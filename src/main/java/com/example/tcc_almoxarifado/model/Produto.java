package com.example.tcc_almoxarifado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private String descricao;
    @SuppressWarnings("unused")
    private int quantidade;
    @SuppressWarnings("unused")
    private String localizacao;
    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    // Getters e Setters
}
