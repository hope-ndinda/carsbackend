package com.carsfinder.carsfinder.controller;

import com.carsfinder.carsfinder.model.Body;
import com.carsfinder.carsfinder.service.BodyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodies")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // allow frontend access
public class BodyController {

    private final BodyService bodyService;

    @PostMapping
    public ResponseEntity<Body> createBody(@RequestBody Body body) {
        Body savedBody = bodyService.saveBody(body);
        return ResponseEntity.ok(savedBody);
    }


    @GetMapping
    public ResponseEntity<List<Body>> getAllBodies() {
        List<Body> bodies = bodyService.getAllBody();
        return ResponseEntity.ok(bodies);
    }

    @GetMapping("/top-offers")
    public ResponseEntity<List<Body>> getBodiesByTopOffers() {
        List<Body> sortedBodies = bodyService.getBodiesSortedByTopOffers();
        return ResponseEntity.ok(sortedBodies);
    }

}
