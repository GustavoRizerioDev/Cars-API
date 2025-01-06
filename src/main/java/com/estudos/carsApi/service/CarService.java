package com.estudos.carsApi.service;

import com.estudos.carsApi.domain.Cars;
import com.estudos.carsApi.dto.CarsDto;
import com.estudos.carsApi.exception.CarNotFoundException;
import com.estudos.carsApi.exception.DeleteCarException;
import com.estudos.carsApi.exception.FindCarException;
import com.estudos.carsApi.exception.SaveCarException;
import com.estudos.carsApi.mapper.CarMapper;
import com.estudos.carsApi.repository.CarsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final CarsRepository carsRepository;

    public CarsDto saveCar(CarsDto carsDto){
        try {
            Cars cars = CarMapper.toDomain(carsDto);
            Cars persistedCar = carsRepository.save(cars);
            return CarMapper.toDto(persistedCar);
        } catch (Exception e) {
            log.error("Error to insert on database! Error: {}", e.getMessage());
            throw new SaveCarException(e.getMessage());
        }
    }

    public void deleteCarById(Long carId) {
        try {
            carsRepository.deleteById(carId);
        } catch (DataAccessException dae) {
            log.error("Error to delete on database! Error: {}", dae.getMessage());
            throw new DeleteCarException(dae.getMessage());
        }
    }

    public List<CarsDto> getAll(){
        try {
            List<CarsDto> carsList = carsRepository.findAll().stream().map(CarMapper::toDto).toList();
            return carsList;
        } catch (Exception e) {
            log.error("Error to find on database! Error: {}", e.getMessage());
            throw new FindCarException(e.getMessage());
        }
    }

    public CarsDto findCarById(Long carId) {
        try {
            var persistedCar = carsRepository.findById(carId);
            return persistedCar.map(CarMapper::toDto).orElseThrow(() -> new CarNotFoundException("Registro não existe no banco de dados"));
        } catch (DataAccessException dae) {
            log.error("Error to find on database! Error: {}", dae.getMessage());
            throw new FindCarException(dae.getMessage());
        }
    }

    public CarsDto updateCar(Long carId, CarsDto carsDto) {
        try {
            var persistedCar = carsRepository.findById(carId);

            if (persistedCar.isEmpty()) {
                throw new CarNotFoundException("Registro não existe no banco de dados");
            }

            Cars carToUpdate = persistedCar.get();
            carToUpdate.setNome(carsDto.getNome());
            carToUpdate.setMarca(carsDto.getMarca());
            carToUpdate.setPreco(carsDto.getPreco());

            Cars updatedCar = carsRepository.save(carToUpdate);
            return CarMapper.toDto(updatedCar);
        } catch (DataAccessException dae) {
            log.error("Error to update on database! Error: {}", dae.getMessage());
            throw new FindCarException(dae.getMessage());
        }
    }
}
