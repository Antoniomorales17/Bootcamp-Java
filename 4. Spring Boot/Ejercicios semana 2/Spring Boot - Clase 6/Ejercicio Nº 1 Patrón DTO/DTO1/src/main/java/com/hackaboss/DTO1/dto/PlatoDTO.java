package com.hackaboss.DTO1.dto;

import com.hackaboss.DTO1.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;
import java.util.List;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {

    private String nombre;
    private List<Ingrediente> lista_ingredientes;
    private Integer cantidad_calorias;

    private String ingrediente_mas_calorico;





}