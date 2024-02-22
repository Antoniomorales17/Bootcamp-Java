public class Main {
    public static void main(String[] args) {

        //Creamos un vector de tipo persona con cinco posiciones
        Persona[] personas = new Persona[5];

        // Creamos 5 personas y las guardamos en el vector
        personas[0] = new Persona(1, "Juan", 22, "Madrid", 6478393);
        personas[1] = new Persona(2, "María", 35, "Barcelona", 654321);
        personas[2] = new Persona(3, "Pedro", 40, "Sevilla", 987654);
        personas[3] = new Persona(4, "Laura", 28, "Valencia", 123456);
        personas[4] = new Persona(5, "Ana", 50, "Bilbao", 987654321);

        // Recorrer el vector y mostrar por pantalla el nombre y edad de cada persona
        // OPCION 1: FOR Each
        for (Persona persona : personas)
            System.out.println("Nombre : " + persona.getNombre() + " - " + " Edad : " + persona.getEdad());

        //OPCION 2: BUCLE FOR
        //for (int i=0; i < personas.length; i++) {
        // Persona persona = personas[i];
        // System.out.println("Nombre : " + persona.getNombre() + " - " +" Edad : " + persona.getEdad());/*

        //Mostrar el nombre antes del cambio
        System.out.println("Nombres  antes del cambio");
        System.out.println("Persona 1 : " + personas[0].getNombre());
        System.out.println("Persona 2 : " + personas[1].getNombre());

        //Realizamos el cambio de nombre
        personas[0].setNombre("Julian");
        personas[1].setNombre("Lorena");

        //Mostrar el nombre despues del cambio
        System.out.println("Nombres despues del cambio");
        System.out.println("Persona 1 :" + personas[0].getNombre());
        System.out.println("Persona 2 :" + personas[1].getNombre());

        // Mostrar personas cuya edad sea mayor de 30 años
        System.out.println("Personas mayores de 30 años");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre : " + persona.getNombre() + "Edad : " + persona.getEdad());
            }
        }
    }

}


