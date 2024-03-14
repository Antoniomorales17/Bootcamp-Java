public class Agente implements Runnable {
    private String nombre;

    public Agente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (Math.random() * 5000)); // Simula tiempo de atención
                System.out.println("Agente " + nombre + " atendió una llamada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
