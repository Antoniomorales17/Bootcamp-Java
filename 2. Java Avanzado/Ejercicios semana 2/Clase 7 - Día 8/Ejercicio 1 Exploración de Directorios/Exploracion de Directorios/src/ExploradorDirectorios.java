import java.awt.*;
import java.util.List;

public class ExploradorDirectorios {
    public static void main(String[] args) {

        // Creamos el directorio raíz
        Directorio raiz = new Directorio(1, "Raiz");

        // Creamos subdirectorios
        Directorio directorio1 = new Directorio(2, "Directorio1");
        Directorio directorio2 = new Directorio(3, "Directorio2");

        // Agregamos los subdirectorios a la raíz
        raiz.subdirectorios.add(directorio1);
        raiz.subdirectorios.add(directorio2);

        // Creamos más subdirectorios
        Directorio subdirectorio1_1 = new Directorio(4, "Subdirectorio1_1");
        Directorio subdirectorio1_2 = new Directorio(5, "Subdirectorio1_2");
        Directorio subdirectorio2_1 = new Directorio(6, "Subdirectorio2_1");

        // Agregamos subdirectorios a Directorio1
        directorio1.subdirectorios.add(subdirectorio1_1);
        directorio1.subdirectorios.add(subdirectorio1_2);

        // Agregamos subdirectorios a Directorio2
        directorio2.subdirectorios.add(subdirectorio2_1);

        // Creamos archivos para Subdirectorio1_1
        subdirectorio1_1.archivos.add("Archivo1_1.txt");
        subdirectorio1_1.archivos.add("Archivo1_2.txt");

        // Creamos archivos para Subdirectorio1_2
        subdirectorio1_2.archivos.add("Archivo1_3.txt");

        // Creamos archivos para Subdirectorio2_1
        subdirectorio2_1.archivos.add("Archivo2_1.txt");
        subdirectorio2_1.archivos.add("Archivo2_2.txt");

        // Mostrar estructura del directorio raíz
        explorarDirectorio(raiz, 0);
    }


    //Metodo recursivo para mostrar la estructura del menu
    public static void explorarDirectorio(Directorio directorio,int nivel) {
        //Imprimimos el nombre del directorio con el nivel de identacion adecuado
        System.out.println(" ".repeat(nivel * 4) + " -" + directorio.getNombre());

        //Exploramos los archivos de este directorio
        for (String archivo : directorio.getArchivos()) {
            System.out.println(" ".repeat((nivel +1) *4) +"* "+ archivo);
        }

        //Exploramos los subdirectorios
        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }

   }
}
