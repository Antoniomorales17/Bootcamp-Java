import java.util.ArrayList;
import java.util.List;

public class Directorio {
    int id;
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios +
                ", archivos=" + archivos +
                '}';
    }
}
