package com.matusmoura.catalogodonab.dto.product;

import com.matusmoura.catalogodonab.model.Product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String title, String image, Float price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getTitle(), product.getImage(), product.getPrice());
    }
}
