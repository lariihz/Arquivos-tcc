package com.example.tcc_almoxarifado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tcc_almoxarifado.model.EntradaProduto;
import com.example.tcc_almoxarifado.repository.EntradaProdutoRepository;

@Service
public class EntradaProdutoService {

    @Autowired
    private EntradaProdutoRepository entradaProdutoRepository;

    public List<EntradaProduto> findAll() {
        return entradaProdutoRepository.findAll();
    }

    public Optional<EntradaProduto> findById(Long id) {
        return entradaProdutoRepository.findById(id);
    }

    public EntradaProduto save(EntradaProduto entradaProduto) {
        return entradaProdutoRepository.save(entradaProduto);
    }

    public void deleteById(Long id) {
        entradaProdutoRepository.deleteById(id);
    }
}
