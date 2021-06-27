package com.corsojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsojava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
