package com.hackaboss.gestionDatosEstudiantes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    private int numMatricula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Calificacion calificacion;

}
