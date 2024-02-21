import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario que ingrese 2 numeros
        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número");
        int num2 = scanner.nextInt();

        //Comparar los números y mostrar el resultado
        if (num1 > num2) {
            System.out.println("El primer número " + num1 + " es mayor que el segundo número " + num2);
        } else if (num1 < num2) {
            System.out.println("El segundo número " + num2 + " es mayor que el primer número " + num1);
        }else {
            System.out.println("Los dos números son iguales " + num1 + " = " + num2);
        }

        // Cerrar el objeto Scanner
        scanner.close();

    }
}
