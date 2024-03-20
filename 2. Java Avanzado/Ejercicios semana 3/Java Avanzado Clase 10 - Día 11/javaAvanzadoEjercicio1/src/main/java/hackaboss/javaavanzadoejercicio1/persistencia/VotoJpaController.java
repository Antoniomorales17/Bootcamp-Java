package hackaboss.javaavanzadoejercicio1.persistencia;

import hackaboss.javaavanzadoejercicio1.logica.Voto;
import hackaboss.javaavanzadoejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class VotoJpaController implements Serializable {

    public VotoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public VotoJpaController() {
        emf = Persistence.createEntityManagerFactory("votacionPU");
    }

    public void create(Voto voto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(voto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Voto voto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            voto = em.merge(voto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = voto.getId();
                if (findVoto(id) == null) {
                    throw new NonexistentEntityException("The voto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Voto voto;
            try {
                voto = em.getReference(Voto.class, id);
                voto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The voto with id " + id + " no longer exists.", enfe);
            }
            em.remove(voto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Voto> findVotoEntities() {
        return findVotoEntities(true, -1, -1);
    }

    public List<Voto> findVotoEntities(int maxResults, int firstResult) {
        return findVotoEntities(false, maxResults, firstResult);
    }

    private List<Voto> findVotoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Voto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Voto findVoto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Voto.class, id);
        } finally {
            em.close();
        }
    }

    public int getVotoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Voto> rt = cq.from(Voto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
