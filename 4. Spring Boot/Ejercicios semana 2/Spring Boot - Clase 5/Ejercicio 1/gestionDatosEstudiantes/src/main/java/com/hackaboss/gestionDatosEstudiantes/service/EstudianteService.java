package com.hackaboss.gestionDatosEstudiantes.service;

import com.hackaboss.gestionDatosEstudiantes.model.Calificacion;
import com.hackaboss.gestionDatosEstudiantes.model.Estudiante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EstudianteService implements IEstudianteService {

    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    @Override
    public List<Estudiante> obtenerListaEstudiantes() {
        return listaEstudiantes;
    }

    @Override
    public Calificacion obtenerCalificacion(int numMatricula) {
        Estudiante estudiante = listaEstudiantes.stream()
                .filter(e->e.getNumMatricula()== numMatricula)
                .findFirst()
                .orElse(null);
        return estudiante != null ? estudiante.getCalificacion() : null;
    }

    @Override
    public List<Calificacion> obtenerCalificacionesOrdenadasDesc() {
        return listaEstudiantes.stream()
                .map(Estudiante :: getCalificacion)
                .sorted(Comparator.comparingDouble(Calificacion::getPromedio).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public void crearEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }
}
