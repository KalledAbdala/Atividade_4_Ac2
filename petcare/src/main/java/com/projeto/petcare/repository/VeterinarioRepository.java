package com.projeto.petcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projeto.petcare.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    @Query("SELECT v FROM Veterinario v JOIN v.especializacoes esp WHERE LOWER(esp) = LOWER(:especializacao)")
List<Veterinario> findByEspecializacao(@Param("especializacao") String especializacao);
}
