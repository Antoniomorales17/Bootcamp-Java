public class Main {
    public static void main(String[] args) {

        //Creamos vector de tipo vestimenta
        Vestimenta[] vestimentas = new Vestimenta[9];

        //Almacenamos 3 zapatos
        vestimentas[0] = new Zapato(1, "Zapato deportivo", 49.99, "Nike", "L", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Zapato casual", 39.99, "Adidas", "S", "Blanco", "Tela", "Velcro");
        vestimentas[2] = new Zapato(3, "Zapato elegante", 79.99, "Fila", "M", "Marrón", "Cuero", "Hebilla");

        // Almacenar 3 pantalones
        vestimentas[3] = new Pantalon(1,"Pantalón vaquero", 59.99, "Levis", "32x32", "Azul", "Clásico", "Denim");
        vestimentas[4] = new Pantalon(2, "Pantalón deportivo", 29.99, "Nike", "M", "Negro", "Deportivo", "Poliéster");
        vestimentas[5] = new Pantalon(3, "Pantalón chino", 34.99, "Zara", "L", "Beige", "Casual", "Algodón");

        // Almacenar 2 camisetas
        vestimentas[6] = new Camiseta(1, "Camiseta manga corta", 14.99, "H&M", "M", "Gris", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(2, "Camiseta manga larga", 19.99, "Zara", "L", "Blanco", "Larga", "V");

        // Almacenar 1 sombrero
        vestimentas[8] = new Sombrero(1, "Sombrero de playa", 24.99, "Decathlon", "Única", "Azul", "Paja", "Único");

        // Recorremos el vector y ejecutamos el método correspondiente en cada posición
        for (Vestimenta prenda : vestimentas) {
            if (prenda instanceof Zapato) {
                ((Zapato)prenda).mostrar();
            } else if (prenda instanceof Pantalon) {
                ((Pantalon)prenda).mostrar();
            } else if (prenda instanceof Camiseta) {
                ((Camiseta)prenda).mostrar();
            } else if (prenda instanceof Sombrero) {
                ((Sombrero)prenda).mostrar();
            }
        }
    }
}
