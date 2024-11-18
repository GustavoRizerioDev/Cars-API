package com.estudos.carsApi.repository;

import com.estudos.carsApi.cars.Cars;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CarsRepository extends JpaRepository<Cars, Long> {
    Optional<Cars> findById(Id carId);
}
