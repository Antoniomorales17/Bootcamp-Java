package com.hackaboss.DTO1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.hackaboss.DTO1.dto.IngredienteDTO;
import com.hackaboss.DTO1.dto.PlatoDTO;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

@Service
public class PlatoService {

    private List<PlatoDTO> menu;
    private List<IngredienteDTO> ingredientesDTO;

    @Autowired
    private IngredienteService ingredienteService;

    @PostConstruct
    public void init(){
        menu = loadDishesDataBase();
        ingredientesDTO = ingredienteService.loadIngredientsDataBase();
    }

    public PlatoDTO obtenerInfoPlato(String nombrePlato) {
        PlatoDTO platoDTO = findPlatoByName(nombrePlato);

        if (platoDTO != null) {
            calcularCalorias(platoDTO);
            return platoDTO;
        } else {
            return null;
        }
    }

    private void calcularCalorias(PlatoDTO platoDTO) {
        List<IngredienteDTO> ingredientesPlato = obtenerIngredientesDePlato(platoDTO);

        double totalCalorias = 0;

        IngredienteDTO ingredienteMaxCalorias = null;
        int maxCalorias = Integer.MIN_VALUE;

        for (IngredienteDTO ingrediente : ingredientesPlato) {
            totalCalorias += ingrediente.getCalories();

            // Encontrar el ingrediente con la mayor cantidad de calorías
            if (ingrediente.getCalories() > maxCalorias) {
                maxCalorias = ingrediente.getCalories();
                ingredienteMaxCalorias = ingrediente;
            }
        }


    }

    private List<IngredienteDTO> obtenerIngredientesDePlato(PlatoDTO platoDTO) {
        List<IngredienteDTO> ingredientesPlato = new ArrayList<>();



        return ingredientesPlato;
    }

    private PlatoDTO findPlatoByName(String nombrePlato) {
        return menu.stream()
                .filter(plato -> plato.getNombre().equalsIgnoreCase(nombrePlato))
                .findFirst()
                .orElse(null);
    }

    private List<PlatoDTO> loadDishesDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:data/dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatoDTO>> typeRef = new TypeReference<>() {};
        List<PlatoDTO> platosDTO= null;
        try {
            platosDTO= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platosDTO;
    }
}

