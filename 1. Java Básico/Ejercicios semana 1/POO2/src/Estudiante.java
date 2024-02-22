public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private String curso;
    private double nota;

    public Estudiante(int id, java.lang.String nombre, int edad, java.lang.String curso, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
    }

    public Estudiante() {
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
