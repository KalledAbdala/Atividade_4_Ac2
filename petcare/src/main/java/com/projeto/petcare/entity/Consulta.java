package com.projeto.petcare.entity;


import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataConsulta;
    private LocalTime horaConsulta;
    private String localConsulta;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    @JsonBackReference("animal-consulta")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    @JsonBackReference("veterinario-consulta")
    private Veterinario veterinario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getLocalConsulta() {
        return localConsulta;
    }

    public void setLocalConsulta(String localConsulta) {
        this.localConsulta = localConsulta;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

}
