public class Empleado {
    private String nombre;
    private double salario;
    private String categoria;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @java.lang.Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
