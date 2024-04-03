package com.hackaboss.codigoMorse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/convertir")
    public String convertirAMorse(@RequestParam("texto") String texto) {
        texto = texto.toUpperCase();

        StringBuilder morse = new StringBuilder();
        for (String palabra : texto.split("\\s+")) {
            if (!palabra.isEmpty()) {
                morse.append(convertirPalabraAMorse(palabra)).append("   ");
            }
        }
        return morse.toString().trim();
    }

    // Método para convertir una palabra a código Morse
    private String convertirPalabraAMorse(String palabra) {
        StringBuilder morse = new StringBuilder();
        for (char caracter : palabra.toCharArray()) {
            String codigo = obtenerCodigoMorse(caracter);
            if (codigo != null) {
                morse.append(codigo).append(" ");
            } else {
                morse.append(" ");
            }
        }
        return morse.toString().trim();
    }

    // Método para obtener el código Morse de un caracter
    private String obtenerCodigoMorse(char caracter) {
        switch (caracter) {
            case 'A':
                return ".-";
            case 'B':
                return "-...";
            case 'C':
                return "-.-.";
            case 'D':
                return "-..";
            case 'E':
                return ".";
            case 'F':
                return "..-.";
            case 'G':
                return "--.";
            case 'H':
                return "....";
            case 'I':
                return "..";
            case 'J':
                return ".---";
            case 'K':
                return "-.-";
            case 'L':
                return ".-..";
            case 'M':
                return "--";
            case 'N':
                return "-.";
            case 'O':
                return "---";
            case 'P':
                return ".--.";
            case 'Q':
                return "--.-";
            case 'R':
                return ".-.";
            case 'S':
                return "...";
            case 'T':
                return "-";
            case 'U':
                return "..-";
            case 'V':
                return "...-";
            case 'W':
                return ".--";
            case 'X':
                return "-..-";
            case 'Y':
                return "-.--";
            case 'Z':
                return "--..";
            case '0':
                return "- - - - -";
            case '1':
                return ". - - - -";
            case '2':
                return ". . - - -";
            case '3':
                return ". . . - -";
            case '4':
                return ". . . . -";
            case '5':
                return ". . . . .";
            case '6':
                return "- . . . .";
            case '7':
                return "- - . . .";
            case '8':
                return "- - - . .";
            case '9':
                return "- - - - .";
            default:
                return null;
        }
    }
}
