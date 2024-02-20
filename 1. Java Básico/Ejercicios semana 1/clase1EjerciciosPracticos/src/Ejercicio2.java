public class Ejercicio2 {
    public static void main(String[] args) {
        int entero = 10;
        double decimal = 3.14;
        boolean booleano = true;
        String cadena = "Hello";

        System.out.println("Valor de la variable entero " + entero);
        System.out.println("Valor de la variable decimal " + decimal);
        System.out.println("Valor de la variable booleano " + booleano);
        System.out.println("Valor de la variable cadena " + cadena);

        // Asignar valores que no corresponden al tipo de dato
        // Esto generará un error en tiempo de compilación o en tiempo de ejecución

        // intentar asignar un String a un double
        //double numero = "3.14";  // Esto produce un error de compilación

        // intentar asignar un int a un String
        String texto = 10 + "";  // Esto no produce un error, pero convierte el int a String

        // intentar asignar un double a un String
        String cadenaDecimal = 3.14 + "";  // Esto no produce un error, pero convierte el double a String
    }
}
