package com.projeto.petcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.petcare.entity.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long>{
    List<Prontuario> findByAnimalId(Long animalId);
}
