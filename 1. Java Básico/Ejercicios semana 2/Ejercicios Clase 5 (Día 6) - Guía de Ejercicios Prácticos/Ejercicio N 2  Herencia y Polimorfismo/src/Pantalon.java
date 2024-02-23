public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    public Pantalon(int codigo, java.lang.String nombre, double precio, java.lang.String marca, java.lang.String talla, java.lang.String color, java.lang.String estilo, java.lang.String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public java.lang.String getEstilo() {
        return estilo;
    }

    public void setEstilo(java.lang.String estilo) {
        this.estilo = estilo;
    }

    public java.lang.String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(java.lang.String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    public void mostrar(){
        System.out.println("Estos pantalones son de marca :" + getEstilo() );
    }
}
