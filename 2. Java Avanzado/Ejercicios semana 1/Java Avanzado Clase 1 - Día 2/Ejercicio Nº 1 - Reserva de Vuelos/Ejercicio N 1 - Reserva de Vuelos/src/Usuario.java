import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int numeroAsientos;
    private int asientosDisponibles;

    public Usuario(String nombre, String destino, LocalDate fechaViaje, int numeroAsientos, int asientosDisponibles) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numeroAsientos = numeroAsientos;
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservarAsientos(int numeroAsientos) throws ReservaInvalidaException {
        if (nombre == null || nombre.isEmpty() || destino == null || destino.isEmpty() || fechaViaje == null) {
            throw new ReservaInvalidaException("Falta información");
        }
        if (numeroAsientos <= 0) {
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero");
        }
        if (numeroAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles");
        }
        // Reducir el número de asientos disponibles después de una reserva exitosa
        asientosDisponibles -= numeroAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}
