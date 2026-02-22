package com.inventory.service;

import com.inventory.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);
    
    void deleteById(Long id);
    
    List<Product> search(String keyword);


}
