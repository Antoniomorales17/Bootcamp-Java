import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0; // Inicializamos el contador para controlar el número de iteraciones
        int suma = 0; // Variable para almacenar la suma de los números

        System.out.println("Ingresa 8 numeros enteros");


        // Utilizamos un bucle while para pedir al usuario que ingrese 8 números

        while (contador <= 7) {
            System.out.println("Numero " + (contador + 1 ) + " : ");
            int numero =scanner.nextInt();
            suma +=numero;
            contador++;
        }

        System.out.println("La suma de los 8 numeros es : " + suma);
    }
}
