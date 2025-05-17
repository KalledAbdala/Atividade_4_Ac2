package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Prontuario;

public interface ProntuarioService {
    Prontuario salvar(Prontuario prontuario);
    List<Prontuario> listarPorAnimal(Long animalId);
    Optional<Prontuario> buscarPorId(Long id);
}
