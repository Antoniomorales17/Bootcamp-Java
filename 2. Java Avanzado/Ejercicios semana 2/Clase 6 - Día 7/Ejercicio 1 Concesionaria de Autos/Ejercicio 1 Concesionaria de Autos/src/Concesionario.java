import java.util.List;
public class Concesionario {
    public static void main(String[] args) {
        InventarioAutos inventario = new InventarioAutos();

        // Agregar autos al inventario
        inventario.agregarAuto(new Auto("Toyota", "Corolla", 2022, 25000));
        inventario.agregarAuto(new Auto("Honda", "Civic", 2023, 27000));
        inventario.agregarAuto(new Auto("Ford", "Fusion", 2022, 23000));

        // Buscar autos por marca
        System.out.println("Autos Toyota:");
        List<Auto> autosToyota = inventario.buscarPorMarca("Toyota");
        for (Auto auto : autosToyota) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }

        // Buscar autos por año
        System.out.println("\nAutos del año 2022:");
        List<Auto> autos2022 = inventario.buscarPorAño(2022);
        for (Auto auto : autos2022) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }

        // Calcular valor total del inventario
        System.out.println("\nValor total del inventario: $" + inventario.calcularValorTotal());
    }
}
