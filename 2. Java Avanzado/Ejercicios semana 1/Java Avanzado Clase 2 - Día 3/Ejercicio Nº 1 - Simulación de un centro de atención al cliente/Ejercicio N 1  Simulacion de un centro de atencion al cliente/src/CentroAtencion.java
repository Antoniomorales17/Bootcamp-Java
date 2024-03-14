import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class CentroAtencion {
    private static final int NUM_AGENTES = 3;
    private static final int NUM_LLAMADAS = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_AGENTES);

        for (int i = 1; i <= NUM_AGENTES; i++) {
            Runnable agente = new Agente("Agente " + i);
            executor.execute(agente);
        }

        for (int i = 1; i <= NUM_LLAMADAS; i++) {
            Cliente cliente = new Cliente("Cliente " + i);
            System.out.println("Llamada entrante de " + cliente.getNombre());


            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}