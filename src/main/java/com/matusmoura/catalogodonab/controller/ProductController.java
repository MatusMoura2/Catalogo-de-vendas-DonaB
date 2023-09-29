package com.matusmoura.catalogodonab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.matusmoura.catalogodonab.dto.product.ProductRequestDTO;
import com.matusmoura.catalogodonab.dto.product.ProductResponseDTO;
import com.matusmoura.catalogodonab.model.Product;
import com.matusmoura.catalogodonab.repository.ProductReposirory;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductReposirory productRepository;

	@PostMapping
	public void saveProduct(@RequestBody ProductRequestDTO data) {
		Product productData = new Product(data);
		productRepository.save(productData);
		return;
	}

	@GetMapping
	public List<ProductResponseDTO> getAll() {
		List<ProductResponseDTO> productList = productRepository.findAll().stream().map(ProductResponseDTO::new)
				.toList();
		return productList;
	}
}
