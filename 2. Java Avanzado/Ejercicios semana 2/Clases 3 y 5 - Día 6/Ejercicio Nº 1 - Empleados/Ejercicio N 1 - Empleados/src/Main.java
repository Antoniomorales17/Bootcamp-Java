import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", 3000, "Desarrollador"),
                new Empleado("María", 4000, "Analista"),
                new Empleado("Pedro", 5000, "Gerente"),
                new Empleado("Ana", 3500, "Desarrollador"),
                new Empleado("Carlos", 4500, "Analista")
        );

        // Filtrar empleados con salario mayor a cierto valor
        double salarioMinimo = 4000;
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(empleado -> empleado.getSalario() > salarioMinimo)
                .collect(Collectors.toList());
        System.out.println("Empleados con salario mayor a " + salarioMinimo + ":");
        empleadosFiltrados.forEach(System.out::println);

        // Agrupar empleados por categoría y calcular salario promedio
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("\nSalario promedio por categoría:");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio));

        // Encontrar empleado con el salario más alto utilizando Optional
        Optional<Empleado> empleadoSalarioMasAlto = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        empleadoSalarioMasAlto.ifPresent(empleado ->
                System.out.println("\nEmpleado con el salario más alto: " + empleado));
    }
}