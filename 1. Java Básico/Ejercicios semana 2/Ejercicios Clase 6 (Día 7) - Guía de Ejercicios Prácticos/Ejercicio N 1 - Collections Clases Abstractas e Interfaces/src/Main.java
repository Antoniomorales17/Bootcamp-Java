import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(1,1053,"Toyota","XP",2020,25000,100,50);
        Camioneta camioneta = new Camioneta(2,1243,"Mercedes", "SUPER",2018,80000,200,70);
        Moto moto = new Moto(3,74585,"Scooter","Street",2015,20000,125,"Gasolina");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(auto);
        vehiculos.add(camioneta);
        vehiculos.add(moto);


        //Mostrar los datos segun corresponda(calcula antiguedad,recarga energia, cumbustible)
        for (Vehiculo vehiculo : vehiculos) {
            System.out.print("El modelo: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " Con un costo de " + vehiculo.getCosto() + " Fabricado en el año " + vehiculo.getAño());
            System.out.print(" tiene: " + vehiculo.calcularAntiguedad() + " años de antigüedad. ");

            //Casting

            if(vehiculo instanceof Electrico){
                ((Electrico)vehiculo).cargarEnergia();
            } else if ( vehiculo instanceof Combustion) {
                ((Combustion)vehiculo).recargarCombustible();
            }
            System.out.println();
        }
    }
}
