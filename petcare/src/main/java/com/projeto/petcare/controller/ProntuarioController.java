package com.projeto.petcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.petcare.entity.Prontuario;
import com.projeto.petcare.service.ProntuarioService;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {
    @Autowired
    private ProntuarioService prontuarioService;

    @PostMapping
    public ResponseEntity<Prontuario> salvar(@RequestBody Prontuario prontuario) {
        return ResponseEntity.ok(prontuarioService.salvar(prontuario));
    }

    @GetMapping("/animal/{animalId}")
    public ResponseEntity<List<Prontuario>> listarPorAnimal(@PathVariable Long animalId) {
        return ResponseEntity.ok(prontuarioService.listarPorAnimal(animalId));
    }
}
