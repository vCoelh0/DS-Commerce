package com.coelhodev.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coelhodev.dscommerce.dto.ProductDTO;
import com.coelhodev.dscommerce.entities.Product;
import com.coelhodev.dscommerce.repositories.ProductRepository;

@Service

public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product product = repository.findById(id).get();
		return new ProductDTO(product);
	
		
	}

}