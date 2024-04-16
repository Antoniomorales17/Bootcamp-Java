package com.hackaboss.estudianteDeProgramacion.service;

import com.hackaboss.estudianteDeProgramacion.model.Tema;

import java.util.List;

public interface ITemaService {

    Tema crearTema(Tema tema);
    List<Tema> ObtenerTodosLosTemasPorCurso(Long idTema);
    Tema obtenerTemaPorId(Long idCurso);
    Tema actualizarTema(Long idTema, Tema tema);

    void eliminarTema(Long idTema);
}
