package com.example.Tourist.resources.services;

import com.example.Tourist.TouristRepository;
import com.example.Tourist.models.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TouristService")
public class TouristService {
    @Autowired
    private TouristRepository touristRepository;

    public Tourist saveNewTourist(Tourist tourist ){
        return touristRepository.save(tourist);
    }
}
