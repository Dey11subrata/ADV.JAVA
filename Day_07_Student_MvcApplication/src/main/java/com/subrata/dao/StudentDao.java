package com.subrata.dao;

import com.subrata.model.Student;

public interface StudentDao {
	
//	dao interface is created to declare methods such as add remove delete update for manipulating data in db.
	
	void save(Student student);

}
