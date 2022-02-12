package com.example.agricultureserver.service.impl;

import com.example.agricultureserver.model.Fertilizer;
import org.springframework.stereotype.Service;

@Service
public interface FertilizerServiceImpl {
    void addFertilizer(Integer id, String name, Double price, Double quantity);

    void addFertilizer( Fertilizer fertilizer);

    Iterable<Fertilizer> getAllFertilizers();

    Fertilizer getFertilizerById(Integer id);

    Fertilizer deleteFertilizer(Integer id);

    Fertilizer updateFertilizer(Fertilizer fertilizer);
}
