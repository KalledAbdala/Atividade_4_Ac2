package com.projeto.petcare.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dadosPessoais;

    @ElementCollection
    private List<String> especializacoes;

    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL)
    @JsonManagedReference("veterinario-consulta")
    private List<Consulta> consultas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(String dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public List<String> getEspecializacoes() {
        return especializacoes;
    }

    public void setEspecializacoes(List<String> especializacoes) {
        this.especializacoes = especializacoes;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
