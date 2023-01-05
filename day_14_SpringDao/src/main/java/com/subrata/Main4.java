package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.model.Car;
import com.subrata.service.CarService;
import com.subrata.service.CarServiceImpl;

public class Main4 {

	public static void main(String[] args) {
		ApplicationContext appcntx = new ClassPathXmlApplicationContext("cfg.xml");
		
		CarService carService = appcntx.getBean(CarService.class);
//		Car car = new Car();
		carService.removeById(1);
	}
}
