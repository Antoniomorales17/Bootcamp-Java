import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = 0;
        int contador = 0;
        int suma = 0;
        boolean bandera = false;

        System.out.println("Por favor ingresa las notas. Introduzca el numero 0 o negativo para finalizar");

        while (!bandera) {
            System.out.println("Ingresa la nota: ");
            nota = scanner.nextInt();

            if (nota <= 0) {
                bandera = true;
            } else {
                suma += nota;
                contador++;

            }
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("La suma de las notas totales es " + suma);
            System.out.println("El promedio de las notas totales es " + promedio);
        } else {
            System.out.println("No se ingresaron notas");
        }

        scanner.close();
    }
}
