public class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    public Camiseta(int codigo, java.lang.String nombre, double precio, java.lang.String marca, java.lang.String talla, java.lang.String color, java.lang.String manga, java.lang.String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public java.lang.String getManga() {
        return manga;
    }

    public void setManga(java.lang.String manga) {
        this.manga = manga;
    }

    public java.lang.String getCuello() {
        return cuello;
    }

    public void setCuello(java.lang.String cuello) {
        this.cuello = cuello;
    }

    public void mostrar(){
        System.out.println("Esta camiseta es de marca : " + getMarca());
    }
}
