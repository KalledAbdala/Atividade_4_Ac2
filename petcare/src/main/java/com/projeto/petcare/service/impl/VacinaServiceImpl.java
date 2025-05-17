package com.projeto.petcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Vacina;
import com.projeto.petcare.repository.VacinaRepository;
import com.projeto.petcare.service.VacinaService;

@Service
public class VacinaServiceImpl implements VacinaService{
    @Autowired
    private VacinaRepository vacinaRepository;

    @Override
    public Vacina salvar(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    @Override
    public List<Vacina> listarPorAnimal(Long animalId) {
        return vacinaRepository.findByAnimalId(animalId);
    }

    @Override
    public Optional<Vacina> buscarPorId(Long id) {
        return vacinaRepository.findById(id);
    }
}
