package com.smartshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartshelf.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(
	        String nameKeyword,
	        String categoryKeyword
	);
}
