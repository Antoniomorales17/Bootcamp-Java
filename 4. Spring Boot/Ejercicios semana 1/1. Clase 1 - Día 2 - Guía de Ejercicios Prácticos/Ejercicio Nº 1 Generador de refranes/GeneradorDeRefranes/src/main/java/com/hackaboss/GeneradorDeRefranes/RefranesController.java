package com.hackaboss.GeneradorDeRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RefranesController {

    private List<String> refranes;

    public RefranesController() {
        refranes = new ArrayList<>();
        refranes.add("No hay mal que por bien no venga");
        refranes.add("Al que madruga Dios lo ayuda");
        refranes.add("Más vale tarde que nunca");
        refranes.add("A quien madruga, Dios le ayuda");
        refranes.add("Más vale pájaro en mano que ciento volando");
        refranes.add("El que no llora, no mama");
        refranes.add("En casa de herrero, cuchillo de palo");
        refranes.add("Dios aprieta pero no ahoga");
    }

    @GetMapping("/")
    public String obtenerRefran() {
        Random random = new Random();
        int index = random.nextInt(refranes.size());
        return refranes.get(index);
    }
}
