package com.example.Tourist.resources;

import com.example.Tourist.models.Tourist;
import com.example.Tourist.resources.services.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1/api/tourists")
public class TouristResource {

    @Autowired
    private TouristService touristService;
    @PostMapping
    public ResponseEntity<Tourist> create (@RequestBody Tourist tourist){
       return ResponseEntity.created(URI.create("/v1/api/tourists")).body(touristService.saveNewTourist(tourist));
    }
}
