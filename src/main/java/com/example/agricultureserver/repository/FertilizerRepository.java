package com.example.agricultureserver.repository;

import com.example.agricultureserver.model.Fertilizer;
import org.springframework.data.repository.CrudRepository;

public interface FertilizerRepository extends CrudRepository<Fertilizer,Integer> {

    Fertilizer findFertilizerById(Integer id);
}
