package com.example.tcc_almoxarifado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tcc_almoxarifado.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}