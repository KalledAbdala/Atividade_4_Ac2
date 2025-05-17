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
public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    @JsonBackReference("animal-prontuario")
    private Animal animal;

    @OneToMany(mappedBy = "prontuario", cascade = CascadeType.ALL)
    @JsonManagedReference("prontuario-vacina")
    private List<Vacina> vacinasAplicadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Vacina> getVacinasAplicadas() {
        return vacinasAplicadas;
    }

    public void setVacinasAplicadas(List<Vacina> vacinasAplicadas) {
        this.vacinasAplicadas = vacinasAplicadas;
    }
}
