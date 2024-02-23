public class Sombrero extends Vestimenta {
    private String tipo;
    private String tamaño;

    public Sombrero(int codigo, java.lang.String nombre, double precio, java.lang.String marca, java.lang.String talla, java.lang.String color, java.lang.String tipo, java.lang.String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public java.lang.String getTipo() {
        return tipo;
    }

    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    public java.lang.String getTamaño() {
        return tamaño;
    }

    public void setTamaño(java.lang.String tamaño) {
        this.tamaño = tamaño;
    }

    public void mostrar() {
        System.out.println("Este sombrero es de marca : " + getTipo() );

    }
}
