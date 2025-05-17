package com.projeto.petcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.petcare.entity.Animal;
import com.projeto.petcare.service.AnimalService;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> salvar(@RequestBody Animal animal) {
        return ResponseEntity.ok(animalService.salvar(animal));
    }

    @GetMapping
    public ResponseEntity<List<Animal>> listarTodos() {
        return ResponseEntity.ok(animalService.listarTodos());
    }

    @GetMapping("/tutor/{tutorId}")
    public ResponseEntity<List<Animal>> listarPorTutor(@PathVariable Long tutorId) {
        return ResponseEntity.ok(animalService.buscarPorTutor(tutorId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        animalService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
