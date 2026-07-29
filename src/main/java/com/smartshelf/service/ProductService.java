package com.smartshelf.service;

import java.util.List;

import com.smartshelf.entity.Product;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);
    
    void deleteById(Long id);
    
    List<Product> search(String keyword);


}
