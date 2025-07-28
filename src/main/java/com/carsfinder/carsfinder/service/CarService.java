package com.carsfinder.carsfinder.service;

import com.carsfinder.carsfinder.model.Car;
import com.carsfinder.carsfinder.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }
    public List<Car> getCarsByCondition(String condition) {
        return carRepository.findByConditionIgnoreCase(condition);
    }
    public List<Car> searchCars(String brand, String model, String bodyType, String location,
                                Integer minYear, Integer maxYear,
                                Double minPrice, Double maxPrice) {
        return carRepository.searchCars(brand, model, bodyType, location, minYear, maxYear, minPrice, maxPrice);
    }

}

