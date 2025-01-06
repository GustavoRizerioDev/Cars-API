package com.estudos.carsApi.controller;

import com.estudos.carsApi.domain.Cars;
import com.estudos.carsApi.dto.CarsDto;
import com.estudos.carsApi.dto.CarsRequestDTO;
import com.estudos.carsApi.exception.FindCarException;
import com.estudos.carsApi.exception.SaveCarException;
import com.estudos.carsApi.repository.CarsRepository;
import com.estudos.carsApi.service.CarService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CarsController {

    @Autowired
    private CarsRepository repository;

    private final CarService carService;

    @PostMapping("/cars")
        public ResponseEntity<CarsDto> createCar(@RequestBody CarsDto carDto){
        try {
            var carToReturn = carService.saveCar(carDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(carToReturn);
        } catch (SaveCarException sce) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/cars")
    public ResponseEntity<Object> getAll() {
        try {
            var carToReturn = carService.getAll();
            return ResponseEntity.ok(carToReturn);
        } catch (FindCarException fce) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao buscar no banco de dados");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/cars/{carId}")
    public ResponseEntity<Object> findCarById(@PathVariable Long carId){
        try {
            var carToReturn = carService.findCarById(carId);
            return ResponseEntity.ok(carToReturn);
        } catch (FindCarException fce) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao buscar no banco de dados");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/cars/{carId}")
    public ResponseEntity<Object> deleteCarById(@PathVariable Long carId){
        try {
            carService.deleteCarById(carId);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/cars/{carId}")
    public ResponseEntity<Object> updateCar(@PathVariable Long carId, @RequestBody CarsDto carDto){
        try {
            var carToReturn = carService.updateCar(carId, carDto);
            return ResponseEntity.ok(carToReturn);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}