package com.subrata.dao;

import java.util.List;

import com.subrata.model.Student;

public interface StudentDao {
	
//	dao interface is created to declare methods such as add remove delete update for manipulating data in db.
	
	void save(Student student);
// for selecting all the records from database
	
	List<Student> selectAll();
	
//	for deleting a student from database
	void deleteStudent(int rollNo, int standard);
}
