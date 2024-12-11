package com.estudos.carsApi.dto;

import com.estudos.carsApi.domain.Cars;

public record CarsResponseDTO(Long id, String nome, String marca, Integer preco) {
    public CarsResponseDTO(Cars cars){
        this(cars.getId(), cars.getNome(), cars.getMarca(), cars.getPreco());
    }
}
