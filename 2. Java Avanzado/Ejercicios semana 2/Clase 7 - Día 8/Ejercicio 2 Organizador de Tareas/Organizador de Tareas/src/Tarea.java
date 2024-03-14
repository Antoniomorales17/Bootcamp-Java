import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtareas=" + subtareas +
                '}';
    }


    //Metodo para agregar las subtareas
    public void agregarSubTareas(Tarea subtarea){
        subtareas.add(subtarea);
    }


    public void mostrarTareas(int nivel) {
        String prefix = obtenerPrefijo(nivel);
        System.out.println(prefix + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarTareas(nivel + 1);
        }
    }

    private String obtenerPrefijo(int nivel) {
        if (nivel == 0) return "- ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append("|  ");
        }
        sb.append("|-- ");
        return sb.toString();
    }
}