package com.subrata.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.subrata.model.Car;

@Repository // 
public class CarDaoImpl implements CarDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void saveCar(Car car) {
		jdbctemplate.update("insert into car (make, model, price) values('"+car.getMake()+"','"+car.getModel()+"',"+car.getPrice()+")");
		
	}

	@Override
	public void update(Car car) {
		jdbctemplate.update("update car set make='"+car.getMake()+"', model='"+car.getModel()+"', price="+car.getPrice()+" where id="+car.getId());
		
	}

	@Override
	public void deleteById(int id) {
		jdbctemplate.update("delete from car where id="+id);
		
	}

	@Override
	public Car selectById(int id) {
		
		return jdbctemplate.query("select * from car where id="+id, rs->{ Car car = new Car();
		if(rs.next()) {
			car.setId(rs.getInt(1));
			car.setMake(rs.getString(2));
			car.setModel(rs.getString(3));
			car.setPrice(rs.getFloat(4));
		}
		return car;
			
		});
	}

	@Override
	public List<Car> selectAll() {

		return jdbctemplate.query("select * from car", res->{
			List<Car> cars = new ArrayList<>();
			while(res.next()) {
				Car car = new Car();
				car.setId(res.getInt(1));
				car.setMake(res.getString(2));
				car.setModel(res.getString(3));
				car.setPrice(res.getFloat(4));
				cars.add(car);
			}
			return cars;
		});
	}

}
