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

import com.projeto.petcare.entity.Consulta;
import com.projeto.petcare.service.ConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<?> agendar(@RequestBody Consulta consulta) {
        try {
            return ResponseEntity.ok(consultaService.agendarConsulta(consulta));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listarTodas() {
        return ResponseEntity.ok(consultaService.listarTodas());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        consultaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
