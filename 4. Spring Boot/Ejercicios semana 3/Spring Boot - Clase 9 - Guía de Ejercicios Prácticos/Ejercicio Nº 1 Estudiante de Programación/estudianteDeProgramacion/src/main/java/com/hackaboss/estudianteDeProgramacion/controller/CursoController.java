package com.hackaboss.estudianteDeProgramacion.controller;

import com.hackaboss.estudianteDeProgramacion.model.Curso;
import com.hackaboss.estudianteDeProgramacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    ICursoService cursoService;


    @PostMapping
    public Curso crearCurso(@RequestBody  Curso curso) {
       return cursoService.crearCurso(curso);

    }

    @GetMapping("/traer")
    List<Curso> obtenerTodosLosCursos(){
       return cursoService.obtenerTodosLosCursos();
    }

    @GetMapping("/{id}")
    public Curso obtenerCursoPorId(@PathVariable Long id){
        return cursoService.obtenerCursoPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
    }

    @GetMapping("/buscar")
    public List<Curso> obtenerCursosPorNombre(@RequestParam  String nombre){
        return cursoService.obtenerCursosPorNombre(nombre);
    }

    @PutMapping("/{id}")
    public Curso actualizarCurso(@PathVariable Long idCurso,@RequestParam Curso curso){
        return cursoService.actualizarCurso(idCurso, curso);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable Long idCurso){
        cursoService.eliminarCurso(idCurso);
    }
}
