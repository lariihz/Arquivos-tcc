package com.example.tcc_almoxarifado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tcc_almoxarifado.model.Cargo;
import com.example.tcc_almoxarifado.repository.CargoRepository;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Optional<Cargo> findById(Long id) {
        return cargoRepository.findById(id);
    }

    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public void deleteById(Long id) {
        cargoRepository.deleteById(id);
    }
}
