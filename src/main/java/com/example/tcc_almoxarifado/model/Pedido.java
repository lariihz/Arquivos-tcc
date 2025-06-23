package com.example.tcc_almoxarifado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @SuppressWarnings("unused")
    private LocalDate dataPedido;
    @SuppressWarnings("unused")
    private String status;
    @SuppressWarnings("unused")
    private String observacoes;

    // Getters e Setters
}