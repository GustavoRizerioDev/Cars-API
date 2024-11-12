package com.example.carros.dto;


import com.example.carros.cars.Cars;

public record CarsResponseDTO(Long id, String nome, String marca, Integer preco) {
    public CarsResponseDTO(Cars cars){
        this(cars.getId(), cars.getNome(), cars.getMarca(), cars.getPreco());
    }
}
