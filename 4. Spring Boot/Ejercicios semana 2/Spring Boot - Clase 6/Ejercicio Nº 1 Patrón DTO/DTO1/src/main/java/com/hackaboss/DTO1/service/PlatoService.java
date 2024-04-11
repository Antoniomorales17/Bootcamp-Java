package com.hackaboss.DTO1.service;

import com.hackaboss.DTO1.Repository.PlatoRepository;
import com.hackaboss.DTO1.dto.PlatoDTO;
import com.hackaboss.DTO1.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    PlatoRepository platoRepository;

    @Override
    public List<Plato> traerPlatos() {
        return platoRepository.cargarMenu();
    }

    @Override
    public PlatoDTO traerPlatoPorNombre(String nombre) {
        List<Plato> listaPlatos = platoRepository.cargarMenu();
        Plato plato = listaPlatos.stream()
                .filter(p -> p.getNombre().equals(nombre))
                .findFirst()
                .orElse(new Plato()); // Valor predeterminado si no se encuentra ningún plato
        PlatoDTO platoDTO = new PlatoDTO();
        platoDTO.setNombre(plato.getNombre());
        platoDTO.setLista_ingredientes(plato.getLista_ingredientes());


        return platoDTO;


    }
}

