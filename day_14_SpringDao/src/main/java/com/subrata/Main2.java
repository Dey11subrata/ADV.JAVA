package com.subrata;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.model.Car;
import com.subrata.service.CarService;
import com.subrata.service.CarServiceImpl;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appcntx = new ClassPathXmlApplicationContext("cfg.xml");
		
		CarService carService = appcntx.getBean(CarServiceImpl.class);
		Car car = new Car();
		List<Car> list = carService.getAll();
		list.forEach(res->System.out.println(res));
	}
}
