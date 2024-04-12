package com.hackaboss.DTO1.controller;


import com.hackaboss.DTO1.dto.PlatoDTO;
import com.hackaboss.DTO1.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    private PlatoService platoService;

    @GetMapping("/plato/{nombrePlato}")
    public ResponseEntity<PlatoDTO> obtenerInfoPlato(@PathVariable String nombrePlato) {
        PlatoDTO platoDTO = platoService.obtenerInfoPlato(nombrePlato);

        if (platoDTO != null) {
            return new ResponseEntity<>(platoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}