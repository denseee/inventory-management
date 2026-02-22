package com.inventory.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.inventory.entity.Product;
import com.inventory.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> findAll() {
        return repo.findAll();
    }

    @Override
    public Product findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }
    
    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public List<Product> search(String keyword) {
        return repo.findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(
                keyword,
                keyword
        );
    }


}
