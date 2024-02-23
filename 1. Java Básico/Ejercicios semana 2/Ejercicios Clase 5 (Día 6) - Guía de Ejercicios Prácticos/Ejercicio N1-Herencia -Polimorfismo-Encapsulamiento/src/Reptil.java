public class Reptil extends Animal {
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;

    public Reptil(int id, java.lang.String nombre, int edad, java.lang.String tipoDePiel, java.lang.String tipoDeAlimentacion, double longitud, java.lang.String tipoEscamas, java.lang.String tipoVeneno, java.lang.String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    private String habitat;


    public void saludar() {
        System.out.println("Hola, soy un reptil");
    }
}
