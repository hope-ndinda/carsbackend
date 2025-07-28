package com.carsfinder.carsfinder.service;


import com.carsfinder.carsfinder.model.Body;
import com.carsfinder.carsfinder.repository.BodyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BodyService {

    private final BodyRepository bodyRepository;

    public Body saveBody(Body body) {
        return bodyRepository.save(body);
    }

    public List<Body> getAllBody() {
        return bodyRepository.findAll();
    }

    public List<Body> getBodiesSortedByTopOffers() {
        return bodyRepository.findAllByOrderByOffersDesc();
    }

}
