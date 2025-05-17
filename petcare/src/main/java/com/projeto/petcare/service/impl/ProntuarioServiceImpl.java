package com.projeto.petcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Prontuario;
import com.projeto.petcare.repository.ProntuarioRepository;
import com.projeto.petcare.service.ProntuarioService;

@Service
public class ProntuarioServiceImpl implements ProntuarioService{
    @Autowired
    private ProntuarioRepository prontuarioRepository;

    @Override
    public Prontuario salvar(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    @Override
    public List<Prontuario> listarPorAnimal(Long animalId) {
        return prontuarioRepository.findByAnimalId(animalId);
    }

    @Override
    public Optional<Prontuario> buscarPorId(Long id) {
        return prontuarioRepository.findById(id);
    }
}
