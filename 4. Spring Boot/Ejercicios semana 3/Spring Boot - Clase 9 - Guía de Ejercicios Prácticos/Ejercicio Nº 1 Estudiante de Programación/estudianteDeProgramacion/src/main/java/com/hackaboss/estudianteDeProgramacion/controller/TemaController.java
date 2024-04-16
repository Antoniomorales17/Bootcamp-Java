package com.hackaboss.estudianteDeProgramacion.controller;

import com.hackaboss.estudianteDeProgramacion.model.Tema;
import com.hackaboss.estudianteDeProgramacion.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    ITemaService temaService;

    @PostMapping
     public Tema crearTema(@RequestBody Tema tema) {
         return temaService.crearTema(tema);
     }


    @GetMapping("/{id}")
    public Tema obtenerTemaPorId(@PathVariable Long id) {
        return temaService.obtenerTemaPorId(id);
    }

    @PutMapping("/{id}")
    public Tema actualizarTema(@PathVariable Long id, @RequestBody Tema tema) {
        return temaService.actualizarTema(id, tema);
    }

    @DeleteMapping("/{id}")
    public void eliminarTema(@PathVariable Long id) {
        temaService.eliminarTema(id);
    }


}
