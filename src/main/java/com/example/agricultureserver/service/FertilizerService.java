package com.example.agricultureserver.service;

import com.example.agricultureserver.model.Fertilizer;
import com.example.agricultureserver.repository.FertilizerRepository;
import com.example.agricultureserver.service.impl.FertilizerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FertilizerService implements FertilizerServiceImpl {
    @Autowired
    FertilizerRepository fertilizerRepository;

    @Override
    public void addFertilizer(Integer id, String name, Double price, Double quantity) {
        Fertilizer fertilizer = new Fertilizer();
        fertilizer.setId(id);
        fertilizer.setName(name);
        fertilizer.setPrice(price);
        fertilizer.setQuantity(quantity);
        fertilizerRepository.save(fertilizer); // same insert query
    }

    @Override
    public void addFertilizer(Fertilizer fertilizer) {
        fertilizerRepository.save(fertilizer);
    }

    @Override
    public Iterable<Fertilizer> getAllFertilizers() {
        return fertilizerRepository.findAll();
    }

    @Override
    public Fertilizer getFertilizerById(Integer id) {
        return fertilizerRepository.findFertilizerById(id);
    }

    @Override
    public Fertilizer deleteFertilizer(Integer id) {
        Fertilizer toBeDeletedFertilizer = getFertilizerById(id);
        fertilizerRepository.delete(toBeDeletedFertilizer);
        return toBeDeletedFertilizer;
    }

    @Override
    public Fertilizer updateFertilizer(Fertilizer fertilizer) {
        return fertilizerRepository.save(fertilizer);
    }
}
