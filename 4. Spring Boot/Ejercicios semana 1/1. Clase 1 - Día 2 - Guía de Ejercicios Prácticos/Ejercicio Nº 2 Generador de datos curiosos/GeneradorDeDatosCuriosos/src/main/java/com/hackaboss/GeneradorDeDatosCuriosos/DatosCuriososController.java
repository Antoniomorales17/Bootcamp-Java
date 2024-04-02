package com.hackaboss.GeneradorDeDatosCuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DatosCuriososController {

    private List<String> datosCuriosos;

    public DatosCuriososController () {

        datosCuriosos = new ArrayList<>();
        datosCuriosos.add("Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo");
        datosCuriosos.add("Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso");
        datosCuriosos.add("Las abejas pueden volar a altitudes superiores a los 5.000 metros.");
        datosCuriosos.add("Los pulpos tienen tres corazones.");
        datosCuriosos.add("Las jirafas tienen la misma cantidad de vértebras en el cuello que los humanos: siete.");
        datosCuriosos.add("Los elefantes pueden comunicarse entre sí a kilómetros de distancia a través de infrasonidos.");
        datosCuriosos.add("Los koalas tienen huellas digitales prácticamente idénticas a las de los humanos.");
        datosCuriosos.add("El corazón de un colibrí late hasta 1.260 veces por minuto.");
        datosCuriosos.add("Los pingüinos pueden saltar hasta 2 metros de altura.");
        datosCuriosos.add("Los osos polares son zurdos.");
        datosCuriosos.add("Los camellos tienen párpados largos y gruesos para protegerse de las tormentas de arena.");
    }

    @GetMapping
    public String obtenerDatoCurioso(){
        Random random = new Random();
        int index = random.nextInt(datosCuriosos.size());
        return datosCuriosos.get(index);
    }

}
