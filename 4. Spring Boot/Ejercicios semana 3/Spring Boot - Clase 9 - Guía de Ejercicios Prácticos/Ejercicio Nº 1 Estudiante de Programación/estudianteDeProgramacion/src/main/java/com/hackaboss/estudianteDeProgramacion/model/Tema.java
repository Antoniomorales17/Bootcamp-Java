package com.hackaboss.estudianteDeProgramacion.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idTema;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name ="curso_id")
    private Curso curso;
}
