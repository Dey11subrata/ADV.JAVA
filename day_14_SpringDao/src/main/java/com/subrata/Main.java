package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.model.Car;
import com.subrata.service.CarService;
import com.subrata.service.CarServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appcntx = new ClassPathXmlApplicationContext("cfg.xml");
		
		CarService carService = appcntx.getBean(CarServiceImpl.class);
		Car car = new Car(1,"maruti", "swift-dezire",8.75);
		carService.add(car);
		System.out.println("car added.....");
	}
}
