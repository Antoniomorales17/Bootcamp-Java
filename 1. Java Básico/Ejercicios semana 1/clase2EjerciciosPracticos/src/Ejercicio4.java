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
            System.out.println("Ingresa la fila del asiento (1-5) :");
            int fila = scanner.nextInt() - 1;
            System.out.println("Ingresa el numero del asiento (1-5) :");
            int numeroAsiento = scanner.nextInt() - 1;
        }
    }
}
