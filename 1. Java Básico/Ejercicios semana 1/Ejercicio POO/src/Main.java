public class Main {
    public static void main(String[] args) {

        Impresora[] impresoras = new Impresora [3];

        // Crear tres impresoras y guardarlas en el vector
        impresoras[0] = new Impresora("ASUS","usb", "12/10/24", 200);
        impresoras[1]  = new Impresora("HP","wi-fi", "20/12/18", 300);
        impresoras[2] = new Impresora("intell","bluetooth", "20/7/16", 100);



        // Recorrer el vector creado y mostrar por pantalla el modelo y tipo de conexión de cada impresora almacenada
        System.out.println("Mostrar la informacion de las impresoras");
        for (int i=0; i<= impresoras.length -1; i++) {
            System.out.println("Impresora " + (i + 1) + ": Modelo - " + impresoras[i].getModelo() + " Fecha de fabricacion - :" + impresoras[i].getFechaDeFabricacion() );

        }
    }
}
