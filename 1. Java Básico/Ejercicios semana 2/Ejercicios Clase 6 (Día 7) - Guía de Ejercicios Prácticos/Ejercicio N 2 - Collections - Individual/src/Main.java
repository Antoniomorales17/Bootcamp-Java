import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Crear 10 objetos de tipo Producto
        Producto producto1 = new Producto(1, "Teléfono", "Samsung", "Smartphone", 200.0, 300.0, 50);
        Producto producto2 = new Producto(2, "Laptop", "HP", "Portátil", 600.0, 800.0, 30);
        Producto producto3 = new Producto(3, "Auriculares", "Sony", "Accesorio", 50.0, 80.0, 100);
        Producto producto4 = new Producto(4, "Cargador", "Apple", "Accesorio", 20.0, 30.0, 80);
        Producto producto5 = new Producto(5, "Tablet", "Lenovo", "Tablet", 150.0, 200.0, 40);
        Producto producto6 = new Producto(6, "Smartwatch", "Xiaomi", "Wearable", 80.0, 120.0, 60);
        Producto producto7 = new Producto(7, "Altavoz", "JBL", "Accesorio", 70.0, 100.0, 70);
        Producto producto8 = new Producto(8, "Teclado", "Logitech", "Accesorio", 25.0, 40.0, 90);
        Producto producto9 = new Producto(9, "Monitor", "Dell", "Accesorio", 150.0, 250.0, 20);
        Producto producto10 = new Producto(10, "Impresora", "Epson", "Impresora", 100.0, 150.0, 25);

        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(producto1);
        inventario.add(producto2);
        inventario.add(producto3);
        inventario.add(producto4);
        inventario.add(producto5);
        inventario.add(producto6);
        inventario.add(producto7);
        inventario.add(producto8);
        inventario.add(producto9);
        inventario.add(producto10);

        // Inicializamos variables para el producto con el mayor y menor precio de venta
        Producto productoConMayorPrecioVenta = null;
        Producto productoConMenorPrecioVenta = null;
        double precioMayor = Double.MIN_VALUE;
        double precioMenor = Double.MAX_VALUE;

        // Recorremos el ArrayList y determinamos el producto con el mayor precio de venta
        for (Producto producto : inventario) {
            if (producto.getPrecioVenta() > precioMayor) {
                precioMayor = producto.getPrecioVenta();
                productoConMayorPrecioVenta = producto;
            }
        }

        // Recorremos el ArrayList y determinamos el producto con el mayor precio de venta
        for(Producto producto : inventario) {
            if(producto.getPrecioVenta() < precioMenor) {
                precioMenor = producto.getPrecioVenta();
                productoConMenorPrecioVenta = producto;
            }
        }

        // Verificamos si se encontró algún producto con el mayor precio de venta
        if (productoConMayorPrecioVenta != null) {
            System.out.println("El producto con el mayor precio de venta es:");
            System.out.println("Nombre: " + productoConMayorPrecioVenta.getNombre());
            System.out.println("Precio de venta: " + productoConMayorPrecioVenta.getPrecioVenta());
        } else {
            System.out.println("No se encontraron productos en el inventario.");
        }

        // Verificamos si se encontró algún producto con el mayor precio de venta
        if(productoConMenorPrecioVenta != null) {
            System.out.println("El producto con el menor precio de venta es ");
            System.out.println("Nombre: " + productoConMenorPrecioVenta.getNombre());
            System.out.println("Precio de venta " + productoConMenorPrecioVenta.getPrecioVenta());
        }

        //Eliminar la posicion 5 del array
      if (inventario.size() > 5) {
          inventario.remove(4);
          System.out.println("\nProducto en la posición 5 eliminado.");
      } else {
          System.out.println("\nNo existen suficientes productos");
      }

      //Determinar productos con mayor stock.Descontar 3 y actualizar
        Producto productoConMayorStock = null;
        int cantidadMaxima = Integer.MIN_VALUE;

        // Recorremos el ArrayList y determinamos el producto con la mayor cantidad en stock
        for (Producto producto : inventario) {
            if (producto.getCantidadStock() > cantidadMaxima) {
                cantidadMaxima = producto.getCantidadStock();
                productoConMayorStock = producto;
            }
        }

        // Verificamos si se encontró algún producto con la mayor cantidad en stock
        if (productoConMayorStock != null) {
            System.out.println("El producto con mayor stock es");
            System.out.println("Nombre :" + productoConMayorStock.getNombre());
            System.out.println("Cantidad inicial :" + productoConMayorStock.getCantidadStock());


        // Descontar 3 unidades del stock del producto con mayor cantidad
        int nuevaCantidadStock =productoConMayorStock.getCantidadStock() - 3;
        productoConMayorStock.setCantidadStock(nuevaCantidadStock);
        System.out.println("Cantidad en stock después de descontar: " + nuevaCantidadStock);

        } else {
            System.out.println("No se encontraron productos");
        }




    }
}
