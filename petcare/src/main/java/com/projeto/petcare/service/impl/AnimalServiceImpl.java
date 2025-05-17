package com.projeto.petcare.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Animal;
import com.projeto.petcare.repository.AnimalRepository;
import com.projeto.petcare.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal salvar(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> buscarPorId(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> buscarPorTutor(Long tutorId) {
        return animalRepository.findByTutorId(tutorId);
    }

    @Override
    public void deletar(Long id) {
        animalRepository.deleteById(id);
    }
}
