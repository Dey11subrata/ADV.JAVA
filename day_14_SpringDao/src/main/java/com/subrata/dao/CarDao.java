package com.subrata.dao;

import java.util.List;

import com.subrata.model.Car;

public interface CarDao {
	void saveCar(Car car);
	void update(Car car);
	void deleteById(int id);
	Car selectById(int id);
	List<Car> selectAll();
	
}
