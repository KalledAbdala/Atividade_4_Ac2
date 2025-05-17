package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Vacina;

public interface VacinaService {
    Vacina salvar(Vacina vacina);
    List<Vacina> listarPorAnimal(Long animalId);
    Optional<Vacina> buscarPorId(Long id);
}
