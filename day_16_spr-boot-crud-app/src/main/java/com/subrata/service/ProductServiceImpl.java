package com.subrata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrata.dao.ProductDao;
import com.subrata.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	@Override
	public void add(Product product) {
		productDao.save(product);
	}

	@Override
	public void modify(Product proudct) {
		productDao.save(proudct);
	}

	@Override
	public void removeById(int id) {
productDao.deleteById(id);		
	}

	@Override
	public Product getById(int id) {
//		Optional is a wrapper class here - wrapper class for any entity object
		Optional<Product> opt = productDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Product> getAll() {
		Iterable<Product> itr = productDao.findAll();
		List<Product> lst = new ArrayList<>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

}
