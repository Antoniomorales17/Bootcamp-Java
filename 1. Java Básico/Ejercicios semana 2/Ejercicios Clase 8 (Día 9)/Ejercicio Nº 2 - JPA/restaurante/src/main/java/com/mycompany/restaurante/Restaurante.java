
package com.mycompany.restaurante;

import com.mycompany.restaurante.logica.Controladora;
import com.mycompany.restaurante.logica.Platillo;
import java.util.List;


public class Restaurante {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        //Proceso de altas
        System.out.println("--------REALIZANDO ALTAS-----");
        
        
        Platillo plat1 = new Platillo(1,"Atun","Arroz",20.0);
          control.crearPlatillo(plat1);
        
        Platillo plat2 = new Platillo(2,"Chorizo","Tomate",10.0);
          control.crearPlatillo(plat2);
          
          Platillo plat3 = new Platillo(3,"Canelones","Queso",10.0);
          control.crearPlatillo(plat3); 
          
         
          
          //Proceso de eliminacion
          System.out.println("--------ELIMINANDO REGISTRO 2-----");
          int idEliminar = 2;
          control.eliminarPlatillo(idEliminar);
          
          
          //Proceso de edicion
          System.out.println("--------EDITANDO REGISTRO 3-----");
          
          int idEditar =3;
          Platillo platEdit = control.buscarPlatillo(idEditar);
          platEdit.setPrecio(50.00);
          
          control.editarPlatillo(platEdit);
          
            //Proceso de lecturas
            System.out.println("--------LISTA FINAL PLATILLOS-----");
          List<Platillo> listaPlatillos = control.traerPlatillos();
for (Platillo plat : listaPlatillos) {
    System.out.println(plat.toString()); 
}
          
          
          
                        
    }
}
