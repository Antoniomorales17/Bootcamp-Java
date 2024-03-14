public class Mascota<T> {
    private static int contador = 0;
    private int id;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(int id, String nombre, int edad, T especie) {
        this.id = ++contador;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public <T> Mascota(String nombre, int edad, T especie) {
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Mascota.contador = contador;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public T getEspecie() {
        return especie;
    }

    public void setEspecie(T especie) {
        this.especie = especie;
    }
}
