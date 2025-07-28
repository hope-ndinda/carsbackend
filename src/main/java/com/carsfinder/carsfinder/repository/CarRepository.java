package com.carsfinder.carsfinder.repository;

import com.carsfinder.carsfinder.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByConditionIgnoreCase(String condition);
    @Query("SELECT c FROM Car c WHERE " +
            "(:brand IS NULL OR LOWER(c.brand) = LOWER(:brand)) AND " +
            "(:model IS NULL OR LOWER(c.model) = LOWER(:model)) AND " +
            "(:bodyType IS NULL OR LOWER(c.bodyType) = LOWER(:bodyType)) AND " +
            "(:location IS NULL OR LOWER(c.location) = LOWER(:location)) AND " +
            "(:minYear IS NULL OR c.manufacturingYear >= :minYear) AND " +
            "(:maxYear IS NULL OR c.manufacturingYear <= :maxYear) AND " +
            "(:minPrice IS NULL OR c.price >= :minPrice) AND " +
            "(:maxPrice IS NULL OR c.price <= :maxPrice)")
    List<Car> searchCars(
            @Param("brand") String brand,
            @Param("model") String model,
            @Param("bodyType") String bodyType,
            @Param("location") String location,
            @Param("minYear") Integer minYear,
            @Param("maxYear") Integer maxYear,
            @Param("minPrice") Double minPrice,
            @Param("maxPrice") Double maxPrice
    );

}
