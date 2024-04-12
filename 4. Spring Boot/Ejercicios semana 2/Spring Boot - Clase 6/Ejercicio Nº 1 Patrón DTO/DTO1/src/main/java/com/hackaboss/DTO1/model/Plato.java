package com.hackaboss.DTO1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {
    private long codigoPlato;
    private String nombre;
    private double precio;
    private List<Ingrediente> listaIngredientes;
}
