package com.hackaboss.ventaDeAutos.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicles {
    private Long id;
    private String brand;
    private String model;
    private String kilometers;
    private Integer doors;
    private Double price;
}
