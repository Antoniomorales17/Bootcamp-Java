import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cambiamos el separador decimal del Scanner
        scanner.useLocale(Locale.US);

        //Pedimos que ingese base y altura
        System.out.println("Por favor ingresa la base del triangulo");
        double base = scanner.nextDouble();

        System.out.println("Por favor ingrese la altura del triangulo");
        double altura = scanner.nextDouble();

        //Calculamos al area
        double area = (base * altura) / 2;

        //Formateamos el area para solo mostrar dos decimales
        String areaFormateada = String.format("%.2f", area);

        //Mostramos el area del triangulo por consola
        System.out.println("El área del triangulo es " + areaFormateada);

    }
}
