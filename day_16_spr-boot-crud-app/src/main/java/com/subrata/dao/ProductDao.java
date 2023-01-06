package com.subrata.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subrata.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

	
}
