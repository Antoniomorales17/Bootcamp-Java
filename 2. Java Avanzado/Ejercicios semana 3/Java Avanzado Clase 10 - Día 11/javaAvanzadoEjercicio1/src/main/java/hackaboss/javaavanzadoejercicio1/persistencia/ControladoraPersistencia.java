package hackaboss.javaavanzadoejercicio1.persistencia;

import hackaboss.javaavanzadoejercicio1.logica.Voto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControladoraPersistencia {

    VotoJpaController votoJpa = new VotoJpaController();

    public void guardarVoto(String opcion) {
        Voto voto = new Voto();
        voto.setOpcion(opcion);
        votoJpa.create(voto);
    }

    public Map<String, Integer> obtenerResultados() {
        List<Voto> votos = votoJpa.findVotoEntities();
        Map<String, Integer> resultados = new HashMap<>();
        for (Voto voto : votos) {
            String opcion = voto.getOpcion();
            resultados.put(opcion, resultados.getOrDefault(opcion, 0) + 1);
        }
        return resultados;
    }
}
