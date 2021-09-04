package com.vim.test.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vim.test.entity.Product;
import com.vim.test.repository.ProductRepository;
import com.vim.test.vo.ProductVO;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> fetchAllProducts() {
		return productRepository.findAll();
	}
	public Product saveProduct(ProductVO productVO){
		ModelMapper modelMapper = new ModelMapper();
		Product savedProduct = modelMapper.map(productVO, Product.class);
		savedProduct = productRepository.save(savedProduct);
		return savedProduct;
	}

	public boolean delete(String id) {
		productRepository.deleteById(id);
		return true;
	}

	public ProductVO editProduct(ProductVO productVO) {
		// TODO Auto-generated method stub
		return null;
	}
}
