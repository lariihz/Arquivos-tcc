package com.example.tcc_almoxarifado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tcc_almoxarifado.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
