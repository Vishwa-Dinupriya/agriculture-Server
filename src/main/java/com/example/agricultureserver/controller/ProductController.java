package com.example.agricultureserver.controller;

import com.example.agricultureserver.model.Product;
import com.example.agricultureserver.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product) {
        System.out.println(product);
        productServiceImpl.addProduct(product);
        System.out.println("New Product Added!" + product);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Iterable<Product> getProducts() {
        return productServiceImpl.getAllProducts();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable Integer id) {
        return productServiceImpl.getProductById(id);
    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public Product deleteProduct(@RequestParam Integer id){
        return productServiceImpl.deleteProduct(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) {
        System.out.println(product);
        productServiceImpl.updateProduct(product);
        return product;
    }

}
