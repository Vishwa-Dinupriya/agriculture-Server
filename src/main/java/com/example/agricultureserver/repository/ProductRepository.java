package com.example.agricultureserver.repository;

import com.example.agricultureserver.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findProductById(Integer id);
}
