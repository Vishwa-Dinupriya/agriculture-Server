package com.example.agricultureserver.service;

import com.example.agricultureserver.model.Product;
import com.example.agricultureserver.repository.ProductRepository;
import com.example.agricultureserver.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceImpl {
    @Autowired
    ProductRepository productRepository;


    @Override
    public void addProduct(Integer id, String name, Double price, Double quantity) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        productRepository.save(product); // same insert query
    }

    @Override
    public void addProduct(Product product) {
      productRepository.save(product);
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findProductById(id);
    }

    @Override
    public Product deleteProduct(Integer id) {
        Product toBeDeletedProduct = getProductById(id);
        productRepository.delete(toBeDeletedProduct);
        return toBeDeletedProduct;
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
