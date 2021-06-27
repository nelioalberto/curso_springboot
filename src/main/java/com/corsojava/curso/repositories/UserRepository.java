package com.corsojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsojava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
