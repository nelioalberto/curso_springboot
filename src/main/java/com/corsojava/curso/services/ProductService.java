package com.corsojava.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corsojava.curso.entities.Product;
import com.corsojava.curso.repositories.ProductRepository;

//@Component
//@Repository
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;	
	
	public List <Product> findAll () {
		return repository.findAll();
	}
		
	public Product findById (Long id) {
		Optional <Product> obj =  repository.findById(id);
		return obj.get();
	}
}
