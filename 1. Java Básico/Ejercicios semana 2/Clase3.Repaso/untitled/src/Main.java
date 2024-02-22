public class Main {
    public static void main(String[] args) {
        //Declaramos el vector
        Verdura[] verduras = new Verdura[5];

        // Crear 5 verduras y guardarlas en el vector
        verduras[0] = new Verdura(1, "Tomate", "Rojo", 20, false);
        verduras[1] = new Verdura(2, "Lechuga", "Verde", 15, false);
        verduras[2] = new Verdura(3, "Zanahoria", "Naranja", 30, false);
        verduras[3] = new Verdura(4, "Espinaca", "Verde", 10, true);
        verduras[4] = new Verdura(5, "Pimiento", "Rojo", 25, false);

        //Recorremos el vector y mostramos el nombre y las calorias
        //OPCION 1 FOR EACH
        // System.out.println("Nombre y calorias de las verduras");
        //   for (Verdura verdura : verduras) {
        //    System.out.println("Nombre : " +  verdura.getNombre() + " - "+" Calorias : " + verdura.getCalorias());
        // }

        //OPCION 2 BUCLE FOR
        System.out.println("Nombre y calorias de las verduras");
        for (int i = 0; i < verduras.length; i++) {
            Verdura verdura = verduras[i];
            System.out.println("Nombre : " + verdura.getNombre() + " - " + " Calorias : " + verdura.getCalorias());
        }

        //Cambiar los datos de las verduras
        System.out.println("\nMostrar los datos de 2 verduras sin cambios");
        System.out.println("ID : " + verduras[0].getId() + " Nombre : " + verduras[0].getNombre() + " Color :" + verduras[0].getColor() + " Calorias : " + verduras[0].getCalorias());
        System.out.println("ID : " + verduras[1].getId() + " Nombre : " + verduras[1].getNombre() + " Color :" + verduras[1].getColor() + " Calorias : " + verduras[1].getCalorias());

        //Seteamos para cambiar los datos
        verduras[0].setNombre("Calabaza");
        verduras[0].setColor("Naranja");
        verduras[0].setCalorias(20);

        verduras[1].setNombre("Brócoli");
        verduras[1].setColor("Verde");
        verduras[1].setCalorias(20);

        //Mostramos los resultados despues del cambio
        System.out.println("\nDatos de todas las verduras después del cambio:");
        for (Verdura verdura : verduras) {
            System.out.println(verdura.getId() + ". Nombre: " + verdura.getNombre() + ", Color: " + verdura.getColor() +
                    ", Calorías: " + verdura.getCalorias() + ", Debe Cocinarse: " + verdura.isDebeCocinarse());

        }
        // Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.
        System.out.println("\nMostramos las verduras que solamente sean de color verde");
        for (Verdura verdura : verduras) {
            if (verdura.getColor().equalsIgnoreCase("Verde")) {
                System.out.println("Las verduras que son de color verde son : " + verdura.getNombre() + " -" + " Calorias: " + verdura.getCalorias());

            }


        }
    }

}

