package com.matusmoura.catalogodonab.product;

public record ProductResponseDTO(Long id,String title,String image,Integer price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getTitle(), product.getImage(), product.getPrice() );
    }
}
