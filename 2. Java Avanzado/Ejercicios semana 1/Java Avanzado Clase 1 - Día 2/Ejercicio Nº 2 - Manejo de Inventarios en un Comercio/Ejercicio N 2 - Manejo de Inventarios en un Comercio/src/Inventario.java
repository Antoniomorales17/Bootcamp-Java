public class Inventario {
    private String nombreProducto;
    private double precio;
    private double cantidadDisponible;

    public Inventario(String nombreProducto, double precio, double cantidadDisponible) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void agregarProducto (String nombreProducto,double precio, double cantidadDisponible) throws GestionException {
        if (nombreProducto == null || nombreProducto.isEmpty()){
            throw new GestionException("El nombre del producto no puede estar vacio");
        }
        if (precio <=0) {
            throw new GestionException("El precio del producto debe ser mayor que cero");
        }
        if (cantidadDisponible <= 0) {
            throw new GestionException("La cantidad no puede ser menor a cero");
        }


        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;

        System.out.println("Producto agregado al inventario: " + nombreProducto);
    }
}
