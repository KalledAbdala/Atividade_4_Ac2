package com.projeto.petcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.petcare.entity.Animal;
import com.projeto.petcare.entity.Consulta;
import com.projeto.petcare.entity.Veterinario;
import com.projeto.petcare.repository.AnimalRepository;
import com.projeto.petcare.repository.ConsultaRepository;
import com.projeto.petcare.repository.VeterinarioRepository;
import com.projeto.petcare.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Consulta agendarConsulta(Consulta consulta) throws Exception {
        Long vetId = consulta.getVeterinario().getId();
        Long animalId = consulta.getAnimal().getId();

        Optional<Consulta> conflito = consultaRepository.findByVeterinarioAndHorario(
            vetId, consulta.getDataConsulta(), consulta.getHoraConsulta());

        if (conflito.isPresent()) {
            throw new Exception("Veterinário já possui consulta nesse horário.");
        }

        Veterinario vet = veterinarioRepository.findById(vetId)
                .orElseThrow(() -> new Exception("Veterinário não encontrado"));

        Animal animal = animalRepository.findById(animalId)
                .orElseThrow(() -> new Exception("Animal não encontrado"));

        if (!vet.getEspecializacoes().contains(animal.getEspecie())) {
            throw new Exception("Veterinário não é especializado na espécie do animal.");
        }

        return consultaRepository.save(consulta);
    }

    @Override
    public List<Consulta> listarTodas() {
        return consultaRepository.findAll();
    }

    @Override
    public Optional<Consulta> buscarPorId(Long id) {
        return consultaRepository.findById(id);
    }

    @Override
    public void deletar(Long id) {
        consultaRepository.deleteById(id);
    }
}
