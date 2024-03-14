public class Main {
    public static void main(String[] args) {
        // Crear un vector de tamaño fijo para almacenar datos
        int[] vector = new int[5];

        try {
            // Almacenar datos en el vector
            OperacionesVector.almacenarDatos(vector, 0, 10);
            OperacionesVector.almacenarDatos(vector, 1, 20);
            OperacionesVector.almacenarDatos(vector, 2, 30);

            // Intentar acceder a datos en el vector
            OperacionesVector.accederDatos(vector, 2);
            OperacionesVector.accederDatos(vector, 5); // Esto generará una excepción
        } catch (PosicionInvalidaException e) {
            // Manejar la excepción personalizada
            System.out.println("Error: " + e.getMessage());
        }
    }
}