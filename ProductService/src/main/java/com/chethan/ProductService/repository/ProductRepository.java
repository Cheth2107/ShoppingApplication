package com.chethan.ProductService.repository;

import com.chethan.ProductService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
