package com.hackaboss.estudianteDeProgramacion.service;

import com.hackaboss.estudianteDeProgramacion.model.Tema;
import com.hackaboss.estudianteDeProgramacion.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TemaService implements ITemaService {

    @Autowired
    TemaRepository temaRepo;
    @Override
    public Tema crearTema(Tema tema) {
        return temaRepo.save(tema);
    }

    @Override
    public List<Tema> ObtenerTodosLosTemasPorCurso(Long idCurso) {
        return temaRepo.findAll()
                .stream()
                .filter(tema -> tema.getCurso().getIdCurso().equals(idCurso))
                .collect(Collectors.toList());
    }

    @Override
    public Tema obtenerTemaPorId(Long idTema) {
        return temaRepo.findById(idTema)
                .orElseThrow(() -> new IllegalArgumentException("Tema no encontrado"));
    }

    @Override
    public Tema actualizarTema(Long idTema, Tema tema) {
        Tema temaExistente = temaRepo.findById(idTema)
                .orElseThrow(() -> new IllegalArgumentException("Tema no encontrado"));

        temaExistente.setNombre(tema.getNombre());
        temaExistente.setDescripcion(tema.getDescripcion());

        return temaRepo.save(temaExistente);
    }

    @Override
    public void eliminarTema(Long idTema) {
        temaRepo.deleteById(idTema);

    }
}
