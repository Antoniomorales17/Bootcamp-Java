
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario que ingrese su edad
        System.out.println("Por favor ingresa su edad");
        int edad = scanner.nextInt();

        if ( edad > 18 ) {
            System.out.println("Bienvenido, puedes entrar al festival");
        } else {
            System.out.println("Lo sentimos, pero no tienes la mayoria de edad permitida");
        }

        scanner.close();
    }
}
