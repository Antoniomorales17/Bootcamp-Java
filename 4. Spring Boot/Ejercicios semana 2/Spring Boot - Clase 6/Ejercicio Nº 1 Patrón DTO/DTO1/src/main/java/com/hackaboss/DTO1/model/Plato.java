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
    private Integer codigo_plato;
    private String nombre;
    private Double precio;
    private List<Ingrediente> lista_ingredientes;
}
