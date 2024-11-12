package com.example.carros.controller;

import com.example.carros.cars.Cars;
import com.example.carros.repository.CarsRepository;
import com.example.carros.dto.CarsRequestDTO;
import com.example.carros.dto.CarsResponseDTO;
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
}
