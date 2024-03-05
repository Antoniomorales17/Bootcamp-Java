import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Antonio", "Madrid", LocalDate.of(2024, 12, 12), 3, 5);

        try {
            usuario.reservarAsientos(10);
            System.out.println("Reserva realizada con exito : Asientos disponibles :" + usuario.getAsientosDisponibles());
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva :" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al crear usuario :" + e.getMessage());
        }
    }
}
