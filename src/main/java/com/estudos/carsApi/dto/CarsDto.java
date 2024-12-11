package com.estudos.carsApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarsDto {
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("marca")
    private String marca;

    @JsonProperty("preco")
    private Integer preco;
}
