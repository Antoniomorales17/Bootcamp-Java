package com.hackaboss.DTO1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {

    private int id;
    private String nombre;
    private List<Integer> ingredientes;
}