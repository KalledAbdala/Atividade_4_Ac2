package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Tutor;

public interface TutorService {
    Tutor salvar(Tutor tutor);
    List<Tutor> listarTodos();
    Optional<Tutor> buscarPorId(Long id);
    void deletar(Long id);
}
