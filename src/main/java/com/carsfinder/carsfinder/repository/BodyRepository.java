package com.carsfinder.carsfinder.repository;

import com.carsfinder.carsfinder.model.Body;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BodyRepository extends JpaRepository<Body, Long> {
    List<Body> findAllByOrderByOffersDesc();


}
