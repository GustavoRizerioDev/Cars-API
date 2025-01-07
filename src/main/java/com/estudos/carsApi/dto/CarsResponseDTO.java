package com.estudos.carsApi.dto;

import com.estudos.carsApi.domain.Cars;

public record CarsResponseDTO(Long id, String nome, String marca, Integer preco, Integer ano, String cor, String modelo, Integer quilometragem, Integer portas, Integer finalPlaca) {
    public CarsResponseDTO(Cars cars){
        this(cars.getId(), cars.getNome(), cars.getMarca(), cars.getPreco(), cars.getAno(), cars.getCor(), cars.getModelo(), cars.getQuilometragem(), cars.getPortas(), cars.getFinalPlaca());
    }
}
