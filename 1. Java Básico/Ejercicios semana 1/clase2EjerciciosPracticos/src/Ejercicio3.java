import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] temperatura = new int[7]; // Vector para controlar las temperaturas
        int suma = 0;

        System.out.println("Por favor ingresa las temperaturas máximas de la semana");

        //Realizamos un bucle para que el usuario ingrese los datos
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Temperatura" + (i + 1) + " : ");
            temperatura[i] = scanner.nextInt();
            suma += temperatura[i];
        }


        //Calculamos el promedio
        double promedio = (double) suma / temperatura.length;

        //Mostrar resultado por pantalla
        System.out.println("El promedio de la temperatura es " + promedio);

    }
}
