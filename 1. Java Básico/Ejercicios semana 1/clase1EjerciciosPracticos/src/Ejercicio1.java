import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos que ingrese el nombre de usuario
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        //Mostrar el mensaje de bienvenida en consola
        System.out.println("Hola," + " " + nombre +" " + "bienvenido al sistema");
    }
}
