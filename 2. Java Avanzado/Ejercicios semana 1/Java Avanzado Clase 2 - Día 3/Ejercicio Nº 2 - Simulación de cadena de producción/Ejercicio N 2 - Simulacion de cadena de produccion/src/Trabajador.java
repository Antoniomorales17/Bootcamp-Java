import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Trabajador implements Runnable {
    private String nombre;
    private String tarea;

    public Trabajador(String nombre, String tarea) {
        this.nombre = nombre;
        this.tarea = tarea;
    }

    @Override
    public void run() {
        try {
            System.out.println(nombre + " comenzó a " + tarea);
            Thread.sleep((long) (Math.random() * 5000)); // Simula tiempo de ejecución de la tarea
            System.out.println(nombre + " completó " + tarea);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}