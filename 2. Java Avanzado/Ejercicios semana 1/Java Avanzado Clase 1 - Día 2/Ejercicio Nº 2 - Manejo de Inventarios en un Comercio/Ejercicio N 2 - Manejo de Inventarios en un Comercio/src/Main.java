public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario("Producto1",100,5);

        try {
            inventario.agregarProducto("Portatil",-120,4);
        } catch (GestionException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
