import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GestorEventos {
    public static void main(String[] args) {
        List<Evento>eventos = Arrays.asList(
                new Evento("Reunión de equipo", LocalDate.of(2024, 3, 13), "Reunión"),
                new Evento("Conferencia de tecnología", LocalDate.of(2024, 3, 14), "Conferencia"),
                new Evento("Taller de desarrollo", LocalDate.of(2024, 3, 14), "Taller"),
                new Evento("Charla de motivación", LocalDate.of(2024, 3, 15), "Conferencia")
        );

        //Fecha especifica
        LocalDate fechaEspecifica = LocalDate.of(2024, 3, 14);

        //Filtramos los eventos
        List<Evento> eventoFiltrado = eventos.stream()
                .filter(p->p.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());
        System.out.println("Evento programados para :" + fechaEspecifica);

        eventoFiltrado.forEach(System.out::println);

        //Agrupar eventos por categoria y saber cuantos en cada categoria
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        System.out.println("\nCantidad de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad) -> System.out.println(categoria + ": " + cantidad));

        // Encontrar el evento más próximo en el tiempo
        LocalDate fechaActual = LocalDate.now();

        Optional<Evento> eventoMasProximo = eventos.stream()
                .filter(f->f.getFecha().isAfter(fechaActual))
                .min(Comparator.comparing(Evento::getFecha));

        eventoMasProximo.ifPresentOrElse(
                evento -> System.out.println("\nEl evento más próximo es: " + evento.getNombre() +
                        " el " + evento.getFecha() + " (" + evento.getCategoria() + ")"),
                () -> System.out.println("\nNo hay eventos próximos en el tiempo.")
        );

    }
}
