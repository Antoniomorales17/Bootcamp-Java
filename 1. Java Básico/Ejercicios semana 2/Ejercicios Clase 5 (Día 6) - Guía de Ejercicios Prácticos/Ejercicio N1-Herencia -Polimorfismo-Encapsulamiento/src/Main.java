public class Main {
    public static void main(String[] args) {

        // Crear un objeto de la clase Animal
        Animal animal = new Animal(1,"Animal", 7, "Lisa", "Herbivoro");
        animal.saludar();

        // Crear un objeto de la clase Mamifero
        Mamifero mamifero = new Mamifero(1,"Leon", 10,"Lisa","Omnivoro",4,"Viviparo","Oscuro","Bosque");
        mamifero.saludar();

        //Crear un objeto de la clase Ave
        Ave ave = new Ave(1,"Colibri",5,"Plumas","Herbivoro",3,"Alto","Azul","Afilado");
        ave.saludar();

        //Crear un objeto de la clase reptil
        Reptil reptil = new Reptil(1,"Serpiente",3,"Escamas","Carnivora",3.5,"Duras","Alto","Pantano");
        mamifero.saludar();

        //Creamos objeto de la clase Animal
        Animal otroAnimal = new Mamifero(1, "oso", 10, "Lisa", "Omnivoro", 4, "Viviparo", "Oscuro", "Bosque");
        otroAnimal.saludar();
        //En este caso se aplica polimorfismo asignando un objeto de la clase hija a una variable de tipo clase padre

        //----Cambio de public a private----
        //Si intentamos acceder se produce un error de compilacion debido a los principios de la encapsulacion


    }
}
