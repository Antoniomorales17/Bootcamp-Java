import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los numeros
        System.out.println("Por favor ingresa un numero entero");
        int num1 = scanner.nextInt();

        System.out.println("Por favor ingrese un segundo numero entero");
        int num2 = scanner.nextInt();

        //Declaramos las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        //Mostramos por pantalla los resultados
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
    }
}
