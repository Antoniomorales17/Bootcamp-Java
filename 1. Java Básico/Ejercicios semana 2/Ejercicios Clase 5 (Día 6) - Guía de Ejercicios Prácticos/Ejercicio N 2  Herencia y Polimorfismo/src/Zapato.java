public class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    public Zapato(int codigo, java.lang.String nombre, double precio, java.lang.String marca, java.lang.String talla, java.lang.String color, java.lang.String material, java.lang.String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public void mostrar(){
        System.out.println("Estos zapatos son de marca :" + getMarca());
    }


}
