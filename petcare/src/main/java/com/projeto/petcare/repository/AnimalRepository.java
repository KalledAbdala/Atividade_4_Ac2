package com.projeto.petcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.petcare.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long>{
    List<Animal> findByTutorId(Long tutorId);
}
