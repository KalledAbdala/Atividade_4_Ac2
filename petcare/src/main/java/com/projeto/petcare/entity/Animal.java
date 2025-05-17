package com.projeto.petcare.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especie;
    private String raca;
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    @JsonBackReference("tutor-animal")
    private Tutor tutor;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @JsonManagedReference("animal-consulta")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @JsonManagedReference("animal-prontuario")
    private List<Prontuario> prontuarios;

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }
}
