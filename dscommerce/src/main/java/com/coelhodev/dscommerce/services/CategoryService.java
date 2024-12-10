package com.coelhodev.dscommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.coelhodev.dscommerce.dto.CategoryDTO;
import com.coelhodev.dscommerce.entities.Category;
import com.coelhodev.dscommerce.repositories.CategoryRepository;

@Service

public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List <CategoryDTO> findAll() {
		List <Category> result = repository.findAll();
		return result.stream().map(x -> new CategoryDTO(x)).toList();	
	}
	
	


}
