package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Veterinario;

public interface VeterinarioService {
    Veterinario salvar(Veterinario veterinario);
    List<Veterinario> listarTodos();
    Optional<Veterinario> buscarPorId(Long id);
    List<Veterinario> buscarPorEspecializacao(String especie);
}
