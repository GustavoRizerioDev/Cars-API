package com.estudos.carsApi.dto;

public record CarsRequestDTO(String nome,
                             String marca,
                             Integer preco,
                             Integer ano,
                             String cor,
                             String modelo,
                             Integer quilometragem,
                             Integer portas,
                             Integer finalPlaca) {
}
