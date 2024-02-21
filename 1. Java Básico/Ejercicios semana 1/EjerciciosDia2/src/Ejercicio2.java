import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cambiamos el separador decimal del Scanner
        scanner.useLocale(Locale.US);

        // Pedimos al usuario que ingrese su peso y su altura
        System.out.println("Por favor ingresa su peso:");
        int peso = scanner.nextInt();

        System.out.println("Por favor ingresa su altura:");
        double altura = scanner.nextDouble();

        // Calculamos el IMC
        double imc = peso / (altura * altura);

        // Formateamos el IMC para solo mostrar dos decimales
        String imcFormateado = String.format("%.2f", imc);

        System.out.println("Su IMC es " + imcFormateado);

        // Determinamos el nivel del peso en funcion del IMC

        if (imc < 18.5) {
            System.out.println("Nivel de peso = Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Nivel de peso = Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Nivel de peso = Sobrepeso");
        } else {
            System.out.println("Nivel de peso = Obesidad");
        }

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}
