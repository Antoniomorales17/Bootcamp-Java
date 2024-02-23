public class Ave extends Animal {
    private double envergaduraAlas;
    private String tipoDeVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, java.lang.String nombre, int edad, java.lang.String tipoDePiel, java.lang.String tipoDeAlimentacion, double envergaduraAlas, java.lang.String tipoDeVuelo, java.lang.String colorPlumaje, java.lang.String tipoPico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public void saludar(){
        System.out.println("Hola, soy un ave");
    }



}
