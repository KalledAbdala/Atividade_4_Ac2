package com.projeto.petcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Tutor;
import com.projeto.petcare.repository.TutorRepository;
import com.projeto.petcare.service.TutorService;

@Service
public class TutorServiceImpl implements TutorService{
    @Autowired
    private TutorRepository tutorRepository;

    @Override
    public Tutor salvar(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @Override
    public List<Tutor> listarTodos() {
        return tutorRepository.findAll();
    }

    @Override
    public Optional<Tutor> buscarPorId(Long id) {
        return tutorRepository.findById(id);
    }

    @Override
    public void deletar(Long id) {
        tutorRepository.deleteById(id);
    }
}
