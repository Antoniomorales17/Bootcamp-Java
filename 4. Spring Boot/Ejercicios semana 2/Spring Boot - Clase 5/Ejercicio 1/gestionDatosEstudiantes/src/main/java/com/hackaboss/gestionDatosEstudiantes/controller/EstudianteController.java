package com.hackaboss.gestionDatosEstudiantes.controller;

import com.hackaboss.gestionDatosEstudiantes.model.Calificacion;
import com.hackaboss.gestionDatosEstudiantes.model.Estudiante;
import com.hackaboss.gestionDatosEstudiantes.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    EstudianteService estudianteService = new EstudianteService();


    //Metodo POST

    @PostMapping
    public void agregarAlumno(@RequestBody Estudiante estudiante){
        estudianteService.crearEstudiante(estudiante);
    }

    //Metodos GET

    @GetMapping
    public List<Estudiante> obtenerListaEstudiantes(){
        return estudianteService.obtenerListaEstudiantes();
    }

    @GetMapping("/{numMatricula}")
    public Calificacion obtenerCalificacionEstudiante(@PathVariable int numMatricula){
        return estudianteService.obtenerCalificacion(numMatricula);

    }

    @GetMapping("/calificaciones/ordenadas")
    public List<Calificacion> obtenerCalificacionOrdenadasDesc(){
        return  estudianteService.obtenerCalificacionesOrdenadasDesc();
    }

    }

