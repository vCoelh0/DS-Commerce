package com.coelhodev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhodev.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
