package com.hackaboss.GestionEmpresarial.controller;


import com.hackaboss.GestionEmpresarial.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EventoController {

    private List<Evento> eventos = new ArrayList<>();
    private Long idCounter = 1L;



    @GetMapping("/eventos")
    public List<Evento> getEventos(){
        return eventos;
    }

    @GetMapping("/evento/{id}")
    public Evento getEventos(@PathVariable Long id) {
        return eventos.stream()
                .filter(evento -> evento.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

    @PostMapping("/evento")
    public Evento crearEvento(@RequestBody Evento evento) {
        evento.setId(idCounter++);
        eventos.add(evento);
        return evento;
    }
}
