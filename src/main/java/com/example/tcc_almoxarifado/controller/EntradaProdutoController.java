package com.example.tcc_almoxarifado.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tcc_almoxarifado.model.EntradaProduto;
import com.example.tcc_almoxarifado.service.EntradaProdutoService;

@RestController
@RequestMapping("/api/entradas")
public class EntradaProdutoController {

    @Autowired
    private EntradaProdutoService entradaProdutoService;

    @GetMapping
    public List<EntradaProduto> listarTodos() {
        return entradaProdutoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntradaProduto> buscarPorId(@PathVariable Long id) {
        Optional<EntradaProduto> entrada = entradaProdutoService.findById(id);
        return entrada.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EntradaProduto criar(@RequestBody EntradaProduto entradaProduto) {
        return entradaProdutoService.save(entradaProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntradaProduto> atualizar(@PathVariable Long id, @RequestBody EntradaProduto entradaAtualizada) {
        Optional<EntradaProduto> entradaExistente = entradaProdutoService.findById(id);
        if (entradaExistente.isPresent()) {
            entradaAtualizada.setId(id);
            EntradaProduto entradaSalva = entradaProdutoService.save(entradaAtualizada);
            return ResponseEntity.ok(entradaSalva);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Optional<EntradaProduto> entrada = entradaProdutoService.findById(id);
        if (entrada.isPresent()) {
            entradaProdutoService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
