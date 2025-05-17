package com.projeto.petcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Veterinario;
import com.projeto.petcare.repository.VeterinarioRepository;
import com.projeto.petcare.service.VeterinarioService;

@Service
public class VeterinarioServiceImpl implements VeterinarioService{
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Override
    public Veterinario salvar(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    @Override
    public List<Veterinario> listarTodos() {
        return veterinarioRepository.findAll();
    }

    @Override
    public Optional<Veterinario> buscarPorId(Long id) {
        return veterinarioRepository.findById(id);
    }

    @Override
    public List<Veterinario> buscarPorEspecializacao(String especie) {
        return veterinarioRepository.findByEspecializacao(especie);
    }
}
