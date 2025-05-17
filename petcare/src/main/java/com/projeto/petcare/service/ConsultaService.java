package com.projeto.petcare.service;

import java.util.List;
import java.util.Optional;

import com.projeto.petcare.entity.Consulta;

public interface ConsultaService {
    Consulta agendarConsulta(Consulta consulta) throws Exception;
    List<Consulta> listarTodas();
    Optional<Consulta> buscarPorId(Long id);
    void deletar(Long id);
}
