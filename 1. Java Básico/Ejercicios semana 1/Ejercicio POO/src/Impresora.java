public class Impresora {
    //Atributos
    private String modelo;
    private String tipoDeConexion;
    private String fechaDeFabricacion;
    private int hojasDisponibles;

    // Constructor con parámetros
    public Impresora(String modelo, String tipoDeConexion, String fechaDeFabricacion, int hojasDisponibles) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.hojasDisponibles = hojasDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeConexion() {
        return tipoDeConexion;
    }

    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }
}
