package com.subrata.service;

import java.util.List;

import com.subrata.dao.StudentDao;
import com.subrata.dao.StudentDaoImpl;
import com.subrata.model.Student;


public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
//	it is just a reference to initialize it as constructor is required
	
	public StudentServiceImpl() {
	
		studentDao = new StudentDaoImpl();
	}
	
	@Override
	public void add(Student student) {
//		from here the call to save method of dao class is to be given(using dao class services) for this it is needed to get an ref. of dao class through which call can be made
		studentDao.save(student);
		
		
	}

	@Override
	public List<Student> showAll() {
		
		return studentDao.selectAll();
	}

	@Override
	public void remove(int rollNo, int standard) {
		studentDao.deleteStudent(rollNo, standard);
		
	}



	

}
