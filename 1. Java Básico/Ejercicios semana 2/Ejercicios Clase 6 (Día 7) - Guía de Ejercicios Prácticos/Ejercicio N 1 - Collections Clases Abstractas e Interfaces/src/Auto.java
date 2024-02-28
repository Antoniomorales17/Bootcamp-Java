public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private double autonomia;

    public Auto(int id, int placa, String marca, String modelo, int año, int costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }


    @java.lang.Override
    public void cargarEnergia() {
        System.out.println("Cargando energia para el coche electrico");

    }

    @java.lang.Override
    public int calcularAntiguedad() {
        int resultado = 2024 - año;
        return  resultado;
    }
}
