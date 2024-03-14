import java.util.List;
import java.util.ArrayList;

public class InventarioAutos<T extends Auto> {
    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        autos.add(auto);
    }

    public List<T> buscarPorMarca(String marca) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<T> buscarPorAño(int año) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getAño() == año) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (T auto : autos) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}
