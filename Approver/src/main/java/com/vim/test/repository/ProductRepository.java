package com.vim.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vim.test.entity.Product;


public interface ProductRepository extends MongoRepository<Product, String> {

}
