package com.example.tcc_almoxarifado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private String descricao;
    @SuppressWarnings("unused")
    private LocalDateTime horarioInicio;
    @SuppressWarnings("unused")
    private LocalDateTime horarioFim;

    @ManyToOne
    private Usuario usuario;

    // Getters e Setters
}