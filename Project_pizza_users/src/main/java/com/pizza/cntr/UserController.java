package com.pizza.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.model.User;
import com.pizza.service.UserService;



@RestController
@CrossOrigin(value= {"http://localhost:3000"})

public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value= {"/registration"})
	public String addUser(@RequestBody User user) {
		userService.saveUser(user);
		return "user added sucessfully";
	}
	
	
	// boolean return
	@PostMapping(value= {"/checkCredentials"})
	public boolean checkCredentials(@RequestBody User user, HttpSession session) {
		
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
		List<User> lst = userService.fetchAll();
		for (User u : lst) {
			if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
				session.setAttribute("id", user.getId());
				System.out.println("login success,,,");
				return true;
			}
			
		}
		System.out.println("login failed,,,");
		return false;
		
	}
	
	// String return
//	@PostMapping(value= {"/checkCredentials"})
//	public String checkCredentials(@RequestBody User user, HttpSession session) {
//		
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());
//		
//		List<User> lst = userService.fetchAll();
//		for (User u : lst) {
//			if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
//				session.setAttribute("id", user.getId());
//				System.out.println("login success,,,");
//				return "success";
//			}
//			
//		}
//		System.out.println("login failed,,,");
//		return "fail";
//		
//	}
	
}