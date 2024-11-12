package com.example.carros.repository;

import com.example.carros.cars.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars, Long> {
}
