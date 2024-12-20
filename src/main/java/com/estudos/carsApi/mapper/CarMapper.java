package com.estudos.carsApi.mapper;

import com.estudos.carsApi.domain.Cars;
import com.estudos.carsApi.dto.CarsDto;

public class CarMapper {

    private CarMapper(){
    }

    public static Cars toDomain(CarsDto carsDto){
        return Cars.builder()
                .marca(carsDto.getMarca())
                .preco(Integer.valueOf(carsDto.getPreco()))
                .nome(carsDto.getNome())
                .build();
    }

    public static CarsDto toDto(Cars cars){
        return CarsDto.builder()
                .marca(cars.getMarca())
                .preco(cars.getPreco())
                .nome(cars.getNome())
                .build();
    }
}
