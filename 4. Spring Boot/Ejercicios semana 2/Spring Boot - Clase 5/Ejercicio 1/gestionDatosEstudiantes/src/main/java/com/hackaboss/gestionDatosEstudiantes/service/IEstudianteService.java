package com.hackaboss.gestionDatosEstudiantes.service;

import com.hackaboss.gestionDatosEstudiantes.model.Calificacion;
import com.hackaboss.gestionDatosEstudiantes.model.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> obtenerListaEstudiantes();
    Calificacion obtenerCalificacion(int numMatricula);
    List<Calificacion> obtenerCalificacionesOrdenadasDesc();

    public void crearEstudiante(Estudiante estudiante);


}
