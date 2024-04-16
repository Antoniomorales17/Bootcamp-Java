package com.hackaboss.estudianteDeProgramacion.service;

import com.hackaboss.estudianteDeProgramacion.model.Curso;
import com.hackaboss.estudianteDeProgramacion.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoService implements ICursoService {

    @Autowired
    CursoRepository cursoRepo;
    @Override
    public Curso crearCurso(Curso curso) {
        return cursoRepo.save(curso);
    }

    @Override
    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public Optional<Curso> obtenerCursoPorId(Long idCurso) {
        return cursoRepo.findById(idCurso);
    }

    @Override
    public List<Curso> obtenerCursosPorNombre(String nombre) {
        return cursoRepo.findAll()
                .stream()
                .filter(curso -> curso.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }


    @Override
    public Curso actualizarCurso(Long idCurso, Curso curso) {
        Curso cursoExistente = cursoRepo.findById(idCurso)
                .orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

        cursoExistente.setNombre(curso.getNombre());
        cursoExistente.setTipoCurso(curso.getTipoCurso());
        cursoExistente.setFechaFinalizacion(curso.getFechaFinalizacion());

        return cursoRepo.save(cursoExistente);
    }

    @Override
    public void eliminarCurso(Long idCurso) {
        cursoRepo.deleteById(idCurso);

    }
}
