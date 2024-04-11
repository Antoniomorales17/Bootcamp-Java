package com.hackaboss.DTO1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {
    private int codigoIngrediente;
    private String nombre;
    private int cantidadCalorias;
}
