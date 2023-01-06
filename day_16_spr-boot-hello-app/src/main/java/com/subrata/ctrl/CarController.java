package com.subrata.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 
public class CarController {

	@GetMapping(value= {"/hello"})
	public String sayHello() {
		return "Hello spring boot......";
	}
	
}
