package com.hackaboss.estudianteDeProgramacion.service;

import com.hackaboss.estudianteDeProgramacion.model.Curso;

import java.util.List;
import java.util.Optional;

public interface ICursoService {

    Curso crearCurso(Curso curso);
    List<Curso> obtenerTodosLosCursos();
    Optional<Curso> obtenerCursoPorId(Long idCurso);

    List<Curso> obtenerCursosPorNombre(String nombre);
    Curso actualizarCurso(Long idCurso, Curso curso);

    void eliminarCurso(Long idCurso);
}
