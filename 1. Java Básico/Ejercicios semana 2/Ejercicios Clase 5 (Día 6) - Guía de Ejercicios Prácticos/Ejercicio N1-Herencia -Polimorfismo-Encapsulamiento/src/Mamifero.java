public class Mamifero extends Animal {
    private int nomeroDePatas;
    private String tipoDeReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, java.lang.String nombre, int edad, java.lang.String tipoDePiel, java.lang.String tipoDeAlimentacion, int nomeroDePatas, java.lang.String tipoDeReproduccion, java.lang.String colorPelaje, java.lang.String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.nomeroDePatas = nomeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public void saludar() {
        System.out.println("Hola, soy un mamifero");
    }
}
