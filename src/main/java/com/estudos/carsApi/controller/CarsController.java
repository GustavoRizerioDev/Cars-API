package com.estudos.carsApi.controller;

import com.estudos.carsApi.cars.Cars;
import com.estudos.carsApi.dto.CarsRequestDTO;
import com.estudos.carsApi.dto.CarsResponseDTO;
import com.estudos.carsApi.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCars(@RequestBody CarsRequestDTO data){
        Cars carsData = new Cars(data);
        repository.save(carsData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CarsResponseDTO> getAll(){
        List<CarsResponseDTO> carsList = repository.findAll().stream().map(CarsResponseDTO::new).toList();
        return carsList;
    }

    @DeleteMapping
    public void deleteCars(@RequestBody CarsRequestDTO data){
        Cars carsData = new Cars(data);
        repository.delete(carsData);
    }
}
