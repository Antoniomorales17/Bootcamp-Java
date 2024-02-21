import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario qie ingrese el codigo
        System.out.println("Por favor ingrese el codigo : ");
        int codigo = scanner.nextInt();

        // Determinar la denominación correspondiente usando switch

        String denominacion;
        switch (codigo) {
            case 1:
                denominacion = "FACTURAS A";
                break;
            case 2:
                denominacion = "NOTAS DE DEBITO A";
                break;
            case 3:
                denominacion = "NOTAS DE CREDITO A";
                break;
            case 4:
                denominacion = "RECIBOS A";
                break;
            case 5:
                denominacion = " NOTAS DE VENTA AL CONTADO A";
                break;
            case 6:
                denominacion = "FACTURAS B";
                break;
            case 7:
                denominacion = "NOTAS DE DEBITO B";
                break;
            case 8:
                denominacion = "NOTAS DE CREDITO B";
                break;
            case 9:
                denominacion = "RECIBOS B";
                break;
            case 10:
                denominacion = "NOTAS DE VENTA AL CONTADO B";
                break;
            default:
                denominacion = "Indefinido";
                break;
        }

        // Mostrar la denominación correspondiente
        System.out.println("La denominación del código " + codigo + " es: " + denominacion);

        scanner.close();
    }
}
