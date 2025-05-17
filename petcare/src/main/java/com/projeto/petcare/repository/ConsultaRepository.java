package com.projeto.petcare.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projeto.petcare.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

    @Query("SELECT c FROM Consulta c WHERE c.veterinario.id = :veterinarioId AND c.dataConsulta = :data AND c.horaConsulta = :hora")
Optional<Consulta> findByVeterinarioAndHorario(@Param("veterinarioId") Long veterinarioId,
                                               @Param("data") LocalDate data,
                                               @Param("hora") LocalTime hora);


}
