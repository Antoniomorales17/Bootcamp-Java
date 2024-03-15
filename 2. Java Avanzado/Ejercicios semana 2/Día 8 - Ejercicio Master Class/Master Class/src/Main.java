import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Focus", "Ford", 1200),
                new Vehiculo("Explorer", "Ford", 2500),
                new Vehiculo("Uno", "Fiat", 500),
                new Vehiculo("Cronos", "Fiat", 1000),
                new Vehiculo("Torino", "Fiat", 1250),
                new Vehiculo("Aveo", "Chevrolet", 1250),
                new Vehiculo("Spin", "Chevrolet", 2500),
                new Vehiculo("Corolla", "Toyota", 1200),
                new Vehiculo("Fortuner", "Toyota", 3000),
                new Vehiculo("Logan", "Renault", 950)

        );

        //Obtenemos vehiculos mediante lambda
        List<Vehiculo> vehiculosOrdenados = vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());

        //Mostrar por pantalla
        System.out.println("\n-----------Vehiculos ordenador por precio de menor a mayor----------\n");
        vehiculosOrdenados.forEach(System.out::println);

        //Imprimir lista ordenanda por marca y precio
        List<Vehiculo> listaOrdenada = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());

        //Mostar la lista por marca y costo
        System.out.println("\n---------Vehiculos ordenador por marca y precio---------\n");
        listaOrdenada.forEach(System.out::println);

        //Extraer precio no mayor a 1000
        List<Vehiculo> noMayor = vehiculos.stream()
                .filter(p ->p.getCosto() < 1000)
                .collect(Collectors.toList());

        System.out.println("\n----Vehiculos con precios no mayor a 1000\n");
        noMayor.forEach(System.out::println);

        //Extraer precios >= a 1000
        List<Vehiculo> siMayor = vehiculos.stream()
                .filter(p->p.getCosto()>= 1000)
                .collect(Collectors.toList());

        System.out.println("\n----Vehiculos con precios igual o mayor a 1000\n");
        siMayor.forEach(System.out::println);

        //Calcular suma
        double sumaPrecios = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .sum();

        //Calcular promedio
        double promedioPrecio = sumaPrecios / vehiculos.size();

        //Imprimimos el promedio
        System.out.println("\nEl promedio total de los precios es :" + promedioPrecio);



    }



}
