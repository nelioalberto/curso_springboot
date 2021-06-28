package com.corsojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsojava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
