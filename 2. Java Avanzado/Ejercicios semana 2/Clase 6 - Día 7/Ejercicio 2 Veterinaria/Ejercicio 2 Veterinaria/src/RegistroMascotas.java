import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        registro = new ArrayList<>();
    }

    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public List<Mascota<T>> buscarPorEspecie(T especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            T especieMascota = mascota.getEspecie();
            if (especieMascota != null && especieMascota.equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public int contarMascotasRegistradas() {
        return registro.size();
    }

    public void generarDatosAleatorios(int cantidad, String[] nombres, T[] especies) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1;
            T especie = especies[random.nextInt(especies.length)];
            Mascota<T> mascota = new Mascota<>(nombre, edad, especie);
            agregarMascota(mascota);
        }
    }
}
