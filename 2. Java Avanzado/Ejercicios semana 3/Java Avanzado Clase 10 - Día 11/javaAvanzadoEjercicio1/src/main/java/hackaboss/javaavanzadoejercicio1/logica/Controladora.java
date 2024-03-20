package hackaboss.javaavanzadoejercicio1.logica;

import hackaboss.javaavanzadoejercicio1.persistencia.ControladoraPersistencia;
import java.util.Map;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarVoto(String opcion) {
        controlPersis.guardarVoto(opcion);
    }

    public Map<String, Integer> obtenerResultados() {
        return controlPersis.obtenerResultados();
    }
}
