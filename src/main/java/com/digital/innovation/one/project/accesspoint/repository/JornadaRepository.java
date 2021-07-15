package com.digital.innovation.one.project.accesspoint.repository;

import com.digital.innovation.one.project.accesspoint.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
