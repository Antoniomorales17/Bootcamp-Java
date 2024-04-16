package com.hackaboss.estudianteDeProgramacion.repository;

import com.hackaboss.estudianteDeProgramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
}
