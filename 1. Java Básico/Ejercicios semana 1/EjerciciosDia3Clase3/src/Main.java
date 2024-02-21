public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos de la clase Cliente utilizando parámetros / argumentos

        Cliente cliente1 = new Cliente(1, "Paco", 500.0);
        Cliente cliente2 = new Cliente(2, "Juan", 800.0);
        Cliente cliente3 = new Cliente(3, "Luis", 100.0);

        // Constructor vacio
        //Cliente cliente4 = new cliente();
       // cliente4.setDeuda(200.00);

        // Mostrar por pantalla el numeroCliente, nombre y deuda de los 3 clientes creados con parámetros
        System.out.println("Clientes sin parametros");
        System.out.println("Cliente 1: Número " + cliente1.getNumeroCliente() + ", Nombre: " + cliente1.getNombre() + ", Deuda: " + cliente1.getDeuda());
        System.out.println("Cliente 2: Número " + cliente2.getNumeroCliente() + ", Nombre: " + cliente2.getNombre() + ", Deuda: " + cliente2.getDeuda());
        System.out.println("Cliente 3: Número " + cliente3.getNumeroCliente() + ", Nombre: " + cliente3.getNombre() + ", Deuda: " + cliente3.getDeuda());


    }

}