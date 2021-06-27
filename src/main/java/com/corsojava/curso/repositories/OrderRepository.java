package com.corsojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsojava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
