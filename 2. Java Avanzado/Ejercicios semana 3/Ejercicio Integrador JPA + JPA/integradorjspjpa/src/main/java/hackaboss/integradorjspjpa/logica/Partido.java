
package hackaboss.integradorjspjpa.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partido")
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private int resultadoLocal;
    private int resultadoVisitante;

    @ManyToOne
    @JoinColumn(name = "idLocal")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "idVisitante")
    private Equipo equipoVisitante;

    public Partido() {
    }

    public Partido(LocalDate fecha, int resultadoLocal, int resultadoVisitante, Equipo equipoLocal, Equipo equipoVisitante) {
        
        this.fecha = fecha;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", fecha=" + fecha + ", resultadoLocal=" + resultadoLocal + ", resultadoVisitante=" + resultadoVisitante + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + '}';
    }
    
    
    
    
    
    
    
}
