package com.estudos.carsApi.repository;

import com.estudos.carsApi.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarsRepository extends JpaRepository<Cars, Long> {
    Optional<Cars> findById(Long carId);
    Cars save(Cars car);
    void deleteById(Long carId);
    List<Cars> findAll();
}
