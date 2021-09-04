package com.vim.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vim.test.entity.Product;
import com.vim.test.service.ProductServiceImpl;
import com.vim.test.vo.ProductVO;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@GetMapping("/getProductDetails")
	List<Product> fetchAllProducts() {
		LOG.debug("Fetch all Products");
		return productServiceImpl.fetchAllProducts();
	}
	
	@PostMapping("/saveProduct")
	Product saveProduct(@RequestBody ProductVO product) {
		LOG.debug("save Product");
		return productServiceImpl.saveProduct(product);
	}

	@GetMapping("/deletepProduct/{id}")
	boolean delete(@PathVariable("id") String id) {
		LOG.debug("delete product");
		return productServiceImpl.delete(id);
	}
	
	@PostMapping("/editProduct")
	ProductVO editProduct(@RequestBody ProductVO productVO) {
		LOG.debug("Edit Product");
		return productServiceImpl.editProduct(productVO);
	}
}

