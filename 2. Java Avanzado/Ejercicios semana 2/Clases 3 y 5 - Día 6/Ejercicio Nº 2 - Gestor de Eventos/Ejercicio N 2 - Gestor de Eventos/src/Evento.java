import java.time.LocalDate;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
