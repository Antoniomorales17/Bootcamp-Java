package com.hackaboss.DTO1.Repository;


import com.hackaboss.DTO1.model.Ingrediente;
import com.hackaboss.DTO1.model.Plato;
import lombok.Getter;
import org.springframework.stereotype.Repository;



import java.util.Arrays;
import java.util.List;

@Repository
@Getter
public class PlatoRepository {

    public List<Plato> cargarMenu() {
        List<Plato> menu = Arrays.asList(
                new Plato(1, "Tacos", 10.0, Arrays.asList(
                        new Ingrediente(1, "Tortilla", 100),
                        new Ingrediente(2, "Carne", 200),
                        new Ingrediente(3, "Cebolla", 50),
                        new Ingrediente(4, "Salsa", 30)
                )),
                new Plato(2, "Hamburguesa", 20.0, Arrays.asList(
                        new Ingrediente(5, "Pan", 150),
                        new Ingrediente(6, "Carne", 200),
                        new Ingrediente(7, "Lechuga", 30),
                        new Ingrediente(8, "Queso", 100)
                )),
                new Plato(3, "Pizza", 30.0, Arrays.asList(
                        new Ingrediente(9, "Pan", 150),
                        new Ingrediente(10, "Salsa", 100),
                        new Ingrediente(11, "Queso", 100),
                        new Ingrediente(12, "Pepperoni", 150)
                )),
                new Plato(4, "Ensalada", 15.0, Arrays.asList(
                        new Ingrediente(13, "Lechuga", 30),
                        new Ingrediente(14, "Tomate", 30),
                        new Ingrediente(15, "Cebolla", 50),
                        new Ingrediente(16, "Aderezo", 30)
                ))
        );
        return menu;
    }
}
