import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] asientos = new int[5][5];

        //Iniciamos los asientos vacios
        for (int i=0; i< asientos.length; i++) {
            for (int j=0; j< asientos.length; j++) {
                asientos[i][j] = 0;
            }
        }

        boolean finalizado = false;

        while(!finalizado){
            mostrarMapa(asientos);

            // Pedir al usuario la fila y el número de asiento
            System.out.println("Ingresa la fila del asiento (0-4) :");
            int fila = scanner.nextInt() - 1;
            System.out.println("Ingresa el numero del asiento (0-4) :");
            int numeroAsiento = scanner.nextInt() - 1;

            // Verificar si el asiento está disponible y marcarlo como ocupado si lo está
            if (asientos[fila][numeroAsiento] == 0) {
                asientos[fila][numeroAsiento] = 1; // Marcar el asiento como ocupado
                System.out.println("¡Reserva exitosa!");
            } else {
                System.out.println("Lo sentimos, el asiento seleccionado está ocupado. Por favor, elija otro.");
            }

            // Preguntar si desea continuar reservando
            System.out.println("¿Desea realizar otra reserva? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                finalizado = true;
            }
        }
    }

    // Método para mostrar el mapa de asientos
    public static void mostrarMapa(int[][] asientos) {
        System.out.println("Mapa de Asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] == 0) {
                    System.out.print("O "); // "O" representa asiento disponible, "X" asiento ocupado
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
