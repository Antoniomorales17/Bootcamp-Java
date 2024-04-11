package com.hackaboss.DTO1.controller;

import com.hackaboss.DTO1.dto.PlatoDTO;
import com.hackaboss.DTO1.model.Plato;
import com.hackaboss.DTO1.service.IPlatoService;
import com.hackaboss.DTO1.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class PlatoController {

    @Autowired
    IPlatoService platoService;

    @GetMapping("/platos")
    public List<Plato> traerPlatos() {
        return platoService.traerPlatos();
    }

    @GetMapping("/plato/{nombre}")
    public PlatoDTO traerPlatoPorNombre(@PathVariable String nombre) {
        PlatoDTO platoDTO = platoService.traerPlatoPorNombre(nombre);
        return platoDTO;
    }
}

