package com.example.tcc_almoxarifado.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SaidaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private int quantidade;
    @SuppressWarnings("unused")
    private String motivo;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Usuario usuario;

    @SuppressWarnings("unused")
    private LocalDateTime dataSaida;

    // Getters e Setters
}