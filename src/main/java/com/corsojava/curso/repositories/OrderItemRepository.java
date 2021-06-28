package com.corsojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsojava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
