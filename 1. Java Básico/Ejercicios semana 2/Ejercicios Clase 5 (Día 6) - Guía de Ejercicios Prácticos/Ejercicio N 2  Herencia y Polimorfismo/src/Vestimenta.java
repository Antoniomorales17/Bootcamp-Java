public class Vestimenta {
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private String talla;
    private String color;

    public Vestimenta(int codigo, java.lang.String nombre, double precio, java.lang.String marca, java.lang.String talla, java.lang.String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public java.lang.String getMarca() {
        return marca;
    }

    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }

    public java.lang.String getTalla() {
        return talla;
    }

    public void setTalla(java.lang.String talla) {
        this.talla = talla;
    }

    public java.lang.String getColor() {
        return color;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }
}
