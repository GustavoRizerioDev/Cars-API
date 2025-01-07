package com.estudos.carsApi.mapper;

import com.estudos.carsApi.domain.Cars;
import com.estudos.carsApi.dto.CarsDto;

public class CarMapper {

    private CarMapper(){
    }

    public static Cars toDomain(CarsDto carsDto){
        return Cars.builder()
                .id(carsDto.getId())
                .marca(carsDto.getMarca())
                .preco(Integer.valueOf(carsDto.getPreco()))
                .nome(carsDto.getNome())
                .ano(Integer.valueOf(carsDto.getAno()))
                .cor(carsDto.getCor())
                .modelo(carsDto.getModelo())
                .quilometragem(Integer.valueOf(carsDto.getQuilometragem()))
                .portas(Integer.valueOf(carsDto.getPortas()))
                .finalPlaca(Integer.valueOf(carsDto.getFinalPlaca()))
                .build();
    }

    public static CarsDto toDto(Cars cars){
        return CarsDto.builder()
                .id(cars.getId())
                .marca(cars.getMarca())
                .preco(cars.getPreco())
                .nome(cars.getNome())
                .ano(cars.getAno())
                .cor(cars.getCor())
                .modelo(cars.getModelo())
                .quilometragem(cars.getQuilometragem())
                .portas(cars.getPortas())
                .finalPlaca(cars.getFinalPlaca())
                .build();
    }
}
