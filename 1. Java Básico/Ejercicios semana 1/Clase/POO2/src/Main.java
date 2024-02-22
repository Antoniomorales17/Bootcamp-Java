public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        //Creamos 5 estudiants y los guardamos en el vector
        estudiantes[0] = new Estudiante(1, "Paco", 30, "Primaria", 7.5);
        estudiantes[1] = new Estudiante(2, "Juan", 20, "Secundaria", 8);
        estudiantes[2] = new Estudiante(3, "Pedro", 18, "Primaria", 9);
        estudiantes[3] = new Estudiante(4, "Maria", 40, "Primaria", 5);
        estudiantes[4] = new Estudiante(5, "Sofia", 35, "Secundaria", 6.5);


        //Mostar el nombre y la nota de cada estudiante
        System.out.println("Nombre y nota de cada estudiante");
        for (int i = 0; i < estudiantes.length - 1; i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println("Nombre : " + estudiante.getNombre() + " / " + "Nota :" + estudiante.getNota());

        }

        // Calculamos el promedio de los alumnos
        double sumaPrimaria = 0;
        double sumaSecundaria = 0;
        int contadorPrimaria = 0;
        int contadorSecundaria = 0;

        for (int i = 0; i < estudiantes.length - 1; i++) {
            Estudiante estudiante = estudiantes[i];
            if (estudiante.getCurso().equals("Primaria")) {
                sumaPrimaria += estudiante.getNota();
                contadorPrimaria++;
            } else if (estudiante.getCurso().equals("Secundaria")) {
                sumaSecundaria += estudiante.getNota();
                contadorSecundaria++;
            }
        }

        //Calculamos los promedios de las notas en funcion del curso
        double promedioPrimaria = sumaPrimaria / contadorPrimaria;
        double promedioSecundaria = sumaSecundaria / contadorSecundaria;

        //Mostramos por consola los resultados
        System.out.println("El promedio de las notas en primaria es  " + promedioPrimaria);
        System.out.println("El promedio de las notas en secundaria es " + promedioSecundaria);
    }
}
