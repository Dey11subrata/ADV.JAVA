package com.subrata.service;

import java.util.List;

import com.subrata.model.Student;

public interface StudentService {
// service interface is created to call the dao class methods i.e using dao class services
	void add(Student student);
	
//	service method to display all students 
	List<Student> showAll();
	
//	service method to remove student
	void remove(int rollNo ,int standard);
}
