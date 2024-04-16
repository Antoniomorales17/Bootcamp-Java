package com.hackaboss.estudianteDeProgramacion.repository;

import com.hackaboss.estudianteDeProgramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
