package com.matusmoura.catalogodonab.controller;

import java.util.List;

import com.matusmoura.catalogodonab.product.ProductRequestDTO;
import com.matusmoura.catalogodonab.product.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.matusmoura.catalogodonab.product.Product;
import com.matusmoura.catalogodonab.product.ProductReposirory;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductReposirory productRepository;

	@PostMapping
	public void saveProduct(@RequestBody ProductRequestDTO data){
			Product productData = new Product(data);
			productRepository.save(productData);
			return;
	}
	
	@GetMapping
	public List<ProductResponseDTO> getAll() {
		List<ProductResponseDTO> productList = productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
		return productList;
	}
}
