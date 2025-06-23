package com.example.tcc_almoxarifado.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tcc_almoxarifado.model.Cargo;
import com.example.tcc_almoxarifado.service.CargoService;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @GetMapping
    public List<Cargo> listarTodos() {
        return cargoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> buscarPorId(@PathVariable Long id) {
        Optional<Cargo> cargo = cargoService.findById(id);
        return cargo.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cargo criar(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cargo> atualizar(@PathVariable Long id, @RequestBody Cargo cargoAtualizado) {
        Optional<Cargo> cargoExistente = cargoService.findById(id);
        if (cargoExistente.isPresent()) {
            cargoAtualizado.setId(id);
            Cargo cargoSalvo = cargoService.save(cargoAtualizado);
            return ResponseEntity.ok(cargoSalvo);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Optional<Cargo> cargo = cargoService.findById(id);
        if (cargo.isPresent()) {
            cargoService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
