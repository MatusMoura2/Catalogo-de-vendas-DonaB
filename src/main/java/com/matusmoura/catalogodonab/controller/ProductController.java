package com.matusmoura.catalogodonab.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

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
	@ResponseStatus(HttpStatus.CREATED)
	public Product saveProduct(@RequestBody ProductRequestDTO data) {
		Product productData = new Product(data);
		productRepository.save(productData);

		return productData;
	}

	@GetMapping
	public List<ProductResponseDTO> getAll() {
		List<ProductResponseDTO> productList = productRepository.findAll().stream().map(ProductResponseDTO::new)
				.toList();
		return productList;
	}

	@GetMapping("/{id}")
	public ProductResponseDTO getById(@PathVariable UUID id) {
		ProductResponseDTO product = productRepository.findById(id)
				.map(p -> new ProductResponseDTO(p))
				.orElse(null);

		return product;
	}
}
