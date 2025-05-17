package com.projeto.petcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projeto.petcare.entity.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long>{
    @Query("SELECT v FROM Vacina v WHERE v.prontuario.animal.id = :animalId")
List<Vacina> findByAnimalId(@Param("animalId") Long animalId);

}
