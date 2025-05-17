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

import com.projeto.petcare.entity.Vacina;
import com.projeto.petcare.service.VacinaService;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {
    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public ResponseEntity<Vacina> salvar(@RequestBody Vacina vacina) {
        return ResponseEntity.ok(vacinaService.salvar(vacina));
    }

    @GetMapping("/animal/{animalId}")
    public ResponseEntity<List<Vacina>> listarPorAnimal(@PathVariable Long animalId) {
        return ResponseEntity.ok(vacinaService.listarPorAnimal(animalId));
    }
}
