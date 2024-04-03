package com.hackaboss.ConversorDeUnidades.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentimetrosController {


    @GetMapping("/convertir")
    public String calcularCentimetros(@RequestParam("centimetros") double centimetros){
        double metros = centimetros / 100.0;
        return "El equivalente a " + centimetros + " cm es de " + metros + " metros";

    }
}
