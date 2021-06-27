package com.corsojava.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corsojava.curso.entities.User;
import com.corsojava.curso.repositories.UserRepository;

//@Component
//@Repository
@Service
public class UserService {

	@Autowired
	private UserRepository repository;	
	
	public List <User> findAll () {
		return repository.findAll();
	}
}
