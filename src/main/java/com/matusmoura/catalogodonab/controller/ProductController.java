package com.matusmoura.catalogodonab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matusmoura.catalogodonab.product.Product;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@GetMapping
	public void getAll() {
		Product product;
	}
}
