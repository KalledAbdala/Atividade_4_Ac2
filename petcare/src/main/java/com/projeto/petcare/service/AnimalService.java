package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Animal;

public interface AnimalService {
    Animal salvar(Animal animal);
    List<Animal> listarTodos();
    Optional<Animal> buscarPorId(Long id);
    List<Animal> buscarPorTutor(Long tutorId);
    void deletar(Long id);
}
