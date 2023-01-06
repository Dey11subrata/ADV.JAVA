package com.subrata.service;

import com.subrata.model.Product;


public interface ProductService {

	void add(Product product);
	void modify(Product proudct);
	void removeById(int id);
	Product getById(int id);
	java.util.List<Product> getAll();
	
	
}
