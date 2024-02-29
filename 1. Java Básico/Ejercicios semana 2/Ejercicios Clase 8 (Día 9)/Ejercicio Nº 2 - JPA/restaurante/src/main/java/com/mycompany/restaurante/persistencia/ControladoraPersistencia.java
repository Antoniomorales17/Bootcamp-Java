
package com.mycompany.restaurante.persistencia;

import com.mycompany.restaurante.logica.Platillo;
import com.mycompany.restaurante.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PlatilloJpaController platiJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo plat) {
       platiJpa.create(plat);
    }

    public List<Platillo> traerPlatillos() {
        return platiJpa.findPlatilloEntities();
    }

    public void eliminarPlatillo(int idEliminar) {
        try {
            platiJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platillo buscarPlatillo(int idEditar) {
      return platiJpa.findPlatillo(idEditar);
    }

    public void editarPlatillo(Platillo platEdit) {
        try {
            platiJpa.edit(platEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
