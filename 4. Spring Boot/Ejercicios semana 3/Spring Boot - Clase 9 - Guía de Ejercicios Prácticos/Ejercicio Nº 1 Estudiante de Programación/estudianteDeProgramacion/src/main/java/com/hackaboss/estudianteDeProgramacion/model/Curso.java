package com.hackaboss.estudianteDeProgramacion.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCurso;
    private String nombre;
    private String tipoCurso;
    private LocalDate fechaFinalizacion;


    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Tema> temas;
}
