package com.matusmoura.catalogodonab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matusmoura.catalogodonab.model.Product;

public interface ProductReposirory extends JpaRepository<Product, Long> {

}
