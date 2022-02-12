package com.example.agricultureserver.service.impl;

import com.example.agricultureserver.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductServiceImpl {
    void addProduct(Integer id, String name, Double price, Double quantity);

    void addProduct( Product product);

    Iterable<Product> getAllProducts();

    Product getProductById(Integer id);

    Product deleteProduct(Integer id);

    Product updateProduct(Product product);
}
