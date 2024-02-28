public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, int placa, String marca, String modelo, int año, int costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @java.lang.Override
    public void recargarCombustible() {
        System.out.println("Recargar el combustible de la moto");
    }

    @java.lang.Override
    public int calcularAntiguedad() {
        int resultado = 2024 - año;
        return resultado;
    }
}
