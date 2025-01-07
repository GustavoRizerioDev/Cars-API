package com.estudos.carsApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarsDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("marca")
    private String marca;

    @JsonProperty("preco")
    private Integer preco;

    @JsonProperty("ano")
    private Integer ano;

    @JsonProperty("cor")
    private String cor;

    @JsonProperty("modelo")
    private String modelo;

    @JsonProperty("quilometragem")
    private Integer quilometragem;

    @JsonProperty("portas")
    private Integer portas;

    @JsonProperty("finalPlaca")
    private Integer finalPlaca;
}
