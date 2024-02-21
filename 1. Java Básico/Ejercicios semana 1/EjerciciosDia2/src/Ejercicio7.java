import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaracion del arreglo
        int[] numeros = new int[8];
        int suma = 0;

        System.out.println("Ingresa 8 numeros enteros");

        // Utilizamos un bucle for para pedir al usuario que ingrese 8 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }

        // Recorremos el arreglo para calcular la suma de los números ingresados
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los 8 numeros es : " + suma);

        scanner.close();
    }
}
