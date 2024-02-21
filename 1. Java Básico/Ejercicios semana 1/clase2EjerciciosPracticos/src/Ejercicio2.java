
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double precioProducto;

        System.out.println("Bienvenido, ingrese el precio de los productos.");

        // Bucle controlado por centinela
        while (true) {
            System.out.print("Ingrese el precio del producto (ingrese 0 o un número negativo para finalizar): ");
            precioProducto = scanner.nextDouble();

            if (precioProducto <= 0) {
                break; // Salir del bucle si el precio es 0 o negativo
            }

            total += precioProducto; // Sumar el precio del producto al total
        }

        // Mostrar el total de la compra
        System.out.println("El total de la compra es: $" + total);

        scanner.close();
    }
}
