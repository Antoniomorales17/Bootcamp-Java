package persistencia;

import hackaboss.integradorjspjpa.logica.Equipo;
import hackaboss.integradorjspjpa.logica.Partido;
import java.util.List;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();

    //METODOS EQUIPOS
    public void crearEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoJpa.edit(equipo);
        } catch (Exception ex) {

        }
    }

    public void eliminarEquipo(int id) {
        try {
            equipoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {

        }
    }

    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoJpa.findEquipoEntities();
    }

    public Equipo obtenerEquipoPorId(int id) {
        return equipoJpa.findEquipo(id);
    }

    public int contarEquipos() {
        return equipoJpa.getEquipoCount();
    }

    //METODOS PARTIDOS
    public void crearPartido(Partido partido) {
        partidoJpa.create(partido);
    }

    public void editarPartido(Partido partido) {
        try {
            partidoJpa.edit(partido);
        } catch (Exception ex) {
            
        }
    }

    public void eliminarPartido(int id) {
        try {
            partidoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            
        }
    }

    public List<Partido> obtenerTodosLosPartidos() {
        return partidoJpa.findPartidoEntities();
    }

    public Partido obtenerPartidoPorId(int id) {
        return partidoJpa.findPartido(id);
    }

    public int contarPartidos() {
        return partidoJpa.getPartidoCount();
    }

}
