package com.hackaboss.DTO1.service;

import com.hackaboss.DTO1.dto.PlatoDTO;
import com.hackaboss.DTO1.model.Plato;

import java.util.List;

public interface IPlatoService {

    List<Plato> traerPlatos();
    PlatoDTO traerPlatoPorNombre(String nombre);
}
