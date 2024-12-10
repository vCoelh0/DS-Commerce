package com.coelhodev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhodev.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
