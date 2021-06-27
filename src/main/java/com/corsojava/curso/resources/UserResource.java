package com.corsojava.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	ResponseEntity<User> findAll() {
		User u = new User(1L, "nelio", "nalberto@gmail.com", "21 98278-4837", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
