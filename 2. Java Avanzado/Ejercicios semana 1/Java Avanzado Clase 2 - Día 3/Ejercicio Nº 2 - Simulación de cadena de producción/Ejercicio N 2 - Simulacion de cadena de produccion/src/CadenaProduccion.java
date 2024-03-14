import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CadenaProduccion {
    private static final int NUM_TRABAJADORES = 5;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_TRABAJADORES);

        // Simulación de tareas en la cadena de producción
        for (int i = 1; i <= NUM_TRABAJADORES; i++) {
            executor.execute(new Trabajador("Trabajador " + i, "ensamblar productos"));
            executor.execute(new Trabajador("Trabajador " + i, "realizar controles de calidad"));
            executor.execute(new Trabajador("Trabajador " + i, "embalar productos"));
        }

        executor.shutdown();
    }
}