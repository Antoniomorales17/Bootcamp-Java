public class OperacionesVector {
    // Función para almacenar datos en el vector
    public static void almacenarDatos(int[] vector, int indice, int dato) {
        vector[indice] = dato;
        System.out.println("Dato " + dato + " almacenado en la posición " + indice + " del vector.");
    }

    // Función para acceder a los datos almacenados en el vector
    public static void accederDatos(int[] vector, int indice) throws PosicionInvalidaException {
        if (indice < 0 || indice >= vector.length) {
            // Lanzar una excepción personalizada si el índice está fuera del rango del vector
            throw new PosicionInvalidaException("Intentando acceder a una posición inválida en el vector.");
        }
        System.out.println("Dato en la posición " + indice + ": " + vector[indice]);
    }
}