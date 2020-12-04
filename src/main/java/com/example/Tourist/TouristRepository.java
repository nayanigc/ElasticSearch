package com.example.Tourist;

import com.example.Tourist.models.Tourist;
import org.springframework.data.repository.CrudRepository;

public interface TouristRepository extends CrudRepository<Tourist,Long> {
}