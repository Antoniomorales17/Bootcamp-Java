public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, int placa, String marca, String modelo, int año, int costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @java.lang.Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la comioneta");

    }

    @java.lang.Override
    public int calcularAntiguedad() {
        int resultado = 2024 - año;
        return resultado;
    }
}
