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

import com.projeto.petcare.entity.Veterinario;
import com.projeto.petcare.service.VeterinarioService;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {
    @Autowired
    private VeterinarioService veterinarioService;

    @PostMapping
    public ResponseEntity<Veterinario> salvar(@RequestBody Veterinario veterinario) {
        return ResponseEntity.ok(veterinarioService.salvar(veterinario));
    }

    @GetMapping
    public ResponseEntity<List<Veterinario>> listarTodos() {
        return ResponseEntity.ok(veterinarioService.listarTodos());
    }

    @GetMapping("/especializacao/{especie}")
    public ResponseEntity<List<Veterinario>> buscarPorEspecializacao(@PathVariable String especie) {
        return ResponseEntity.ok(veterinarioService.buscarPorEspecializacao(especie));
    }
}
