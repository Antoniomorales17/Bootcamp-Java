public class Cliente {
    // Atributos
    private int numeroCliente;
    private String nombre;
    private double deuda;

    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int numeroCliente, String nombre, double deuda) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    // Métodos para acceder a los atributos
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    // Método para establecer la deuda
    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
}


