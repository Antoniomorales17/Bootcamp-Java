public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoDePiel;
    private String tipoDeAlimentacion;

    public Animal(int id, java.lang.String nombre, int edad, java.lang.String tipoDePiel, java.lang.String tipoDeAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public java.lang.String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(java.lang.String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    public java.lang.String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(java.lang.String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    // Método para que el animal salude
    public void saludar() {
        System.out.println("Hola, soy un animal");
    }


}
