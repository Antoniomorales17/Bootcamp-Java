package hackaboss.integradorjspjpa.logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Metodos de los equipos
    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public void editarEquipo(Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }

    public void eliminarEquipo(int id) {
        controlPersis.eliminarEquipo(id);
    }

    public List<Equipo> obtenerTodosLosEquipos() {
        return controlPersis.obtenerTodosLosEquipos();
    }

    public Equipo obtenerEquipoPorId(int id) {
        return controlPersis.obtenerEquipoPorId(id);
    }

    public int contarEquipos() {
        return controlPersis.contarEquipos();
    }

    //Metodos para los partidos
    public void crearPartido(Partido partido) {
        controlPersis.crearPartido(partido);
    }

    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }

    public void eliminarPartido(int id) {
        controlPersis.eliminarPartido(id);
    }

    public List<Partido> obtenerTodosLosPartidos() {
        return controlPersis.obtenerTodosLosPartidos();
    }

    public Partido obtenerPartidoPorId(int id) {
        return controlPersis.obtenerPartidoPorId(id);
    }

    public int contarPartidos() {
        return controlPersis.contarPartidos();
    }

}
