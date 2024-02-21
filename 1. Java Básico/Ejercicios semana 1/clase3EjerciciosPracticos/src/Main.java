public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos de la clase Electrodomestico utilizando parámetros
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Samsung", "123ABC", 100.5, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "LG", "456DEF", 120.3, "Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Sony", "789GHI", 90.2, "Plateado");

        // Crear 1 objeto de la clase Electrodomestico sin parámetros
        Electrodomestico electrodomestico4 = new Electrodomestico();

        // Mostrar por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros
        System.out.println("Electrodomésticos creados con parámetros:");
        System.out.println("Electrodoméstico 1: Marca - " + electrodomestico1.getMarca() + ", Modelo - " + electrodomestico1.getModelo() + ", Consumo - " + electrodomestico1.getConsumo());
        System.out.println("Electrodoméstico 2: Marca - " + electrodomestico2.getMarca() + ", Modelo - " + electrodomestico2.getModelo() + ", Consumo - " + electrodomestico2.getConsumo());
        System.out.println("Electrodoméstico 3: Marca - " + electrodomestico3.getMarca() + ", Modelo - " + electrodomestico3.getModelo() + ", Consumo - " + electrodomestico3.getConsumo());

        System.out.println("Marca del electrodoméstico sin parámetros: " + electrodomestico4.getMarca());
        // Al no haber asignado un valor a la marca para el electrodoméstico sin parámetros, se obtendrá el valor por defecto para una cadena, que es null.
    }
}
