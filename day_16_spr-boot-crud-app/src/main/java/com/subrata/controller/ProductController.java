package com.subrata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subrata.model.Product;
import com.subrata.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value= {"/product"})
	 public String addProduct(@RequestBody Product product) {
		 productService.add(product);
		 return "success";
	 }
	
	@PutMapping(value= {"/product"})// 
	public String productUpdate(@RequestBody Product product) {
		productService.modify(product);
		return "success";
	}
	
	@DeleteMapping(value= {"/product"})
	public String productDelete(@RequestParam int id) {
		productService.removeById(id);
		return "delete successfuly";
	}
	
	@DeleteMapping(value= {"/product/{id}"})
	public String productDelete1(@PathVariable int id) {
		productService.removeById(id);
		return "delete via path variable";
	}
	
	@GetMapping(value= {"/product/{id}"})
	public Product productGet(@PathVariable int id) {
		return productService.getById(id);
	}
	
	@GetMapping(value= {"/product"})
	public List<Product> listOfProduct(){
		return productService.getAll();
	}
}
