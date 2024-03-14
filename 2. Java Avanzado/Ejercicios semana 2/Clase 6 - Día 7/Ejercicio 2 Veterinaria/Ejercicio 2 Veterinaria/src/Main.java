import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroMascotas<String> registro = new RegistroMascotas<>();

        // Agregar mascotas al registro
        registro.agregarMascota(new Mascota<>(1, "Firulais", 4, "Gato"));
        registro.agregarMascota(new Mascota<>(2, "Luis", 5, "Perro"));
        registro.agregarMascota(new Mascota<>(3, "Enzo", 7, "Pájaro"));

        // Buscar mascotas por nombre
        List<Mascota<String>> mascotasPorNombre = registro.buscarPorNombre("Firulais");
        System.out.println("Mascotas encontradas por nombre:");
        for (Mascota<String> mascota : mascotasPorNombre) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad() + ", Especie: " + mascota.getEspecie());
        }

        // Contar la cantidad de mascotas registradas
        int cantidadMascotas = registro.contarMascotasRegistradas();
        System.out.println("\nCantidad total de mascotas registradas: " + cantidadMascotas);

        // Generar datos aleatorios para mascotas
        String[] nombresAleatorios = {"Tom", "Jerry", "Max", "Luna", "Toby"};
        String[] especiesAleatorias = {"Gato", "Perro", "Pájaro"};
        registro.generarDatosAleatorios(3, nombresAleatorios, especiesAleatorias);
        System.out.println("\nNuevas mascotas agregadas al registro:");

        // Mostrar todas las mascotas en el registro
        List<Mascota<String>> todasLasMascotas = registro.buscarPorEspecie(null);
        for (Mascota<String> mascota : todasLasMascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad() + ", Especie: " + mascota.getEspecie());
        }
    }
}
