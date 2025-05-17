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

import com.projeto.petcare.entity.Tutor;
import com.projeto.petcare.service.TutorService;

@RestController
@RequestMapping("/tutores")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @PostMapping
    public ResponseEntity<Tutor> salvar(@RequestBody Tutor tutor) {
        return ResponseEntity.ok(tutorService.salvar(tutor));
    }

    @GetMapping
    public ResponseEntity<List<Tutor>> listarTodos() {
        return ResponseEntity.ok(tutorService.listarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        tutorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
