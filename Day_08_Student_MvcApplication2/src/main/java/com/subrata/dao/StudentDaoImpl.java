package com.subrata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.subrata.Connection.MyConn;
import com.subrata.dao.StudentDao;
import com.subrata.model.Student;

public class StudentDaoImpl implements StudentDao {
// create a connection reference
	
	private MyConn myConn; // it is an instance member hence to use it it must me initialized via constructor
	
	
	
	
	public StudentDaoImpl() {
		myConn = new MyConn(); // reference has been intialized.
//		now myConn can be used to get connected with database.
	}




	@Override
	public void save(Student student) {
//		to save the details in db connection with db is required after that only we can enter details into db.
		try {
		Connection con = myConn.getConn();
		
//		connection object received - now go for query and its execution
		
		PreparedStatement s = con.prepareStatement("insert into mvcStudents (rollNo,name,standard,percentageScored,dob,contact,localAddress) values(?,?,?,?,?,?,?)");
		
//		values which are entered in bean class variables are now required to insert in this query into db - use s.setXXX along with getter method.
		
		s.setInt(1, student.getRollNo());
		s.setString(2, student.getName());
		s.setInt(3, student.getStandard());
		s.setFloat(4, student.getPercentageScored());
		s.setString(5, student.getDob());
		s.setString(6, student.getContact());
		s.setString(7, student.getLocalAddress());
		
		int i = s.executeUpdate();
		
		s.close();
		con.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	@Override
	public List<Student> selectAll() {
//		crate a list to get all students in it
		List<Student> list = new ArrayList<Student>();
		
		try {
			Connection con = myConn.getConn();
			
//			connection object received - now go for query and its execution
			
			PreparedStatement s = con.prepareStatement("select * from mvcstudents");

			
			ResultSet rs = s.executeQuery();
			
			while(rs.next()) {
				Student student = new Student();
				student.setRollNo(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setStandard(rs.getInt(3));
				student.setPercentageScored(rs.getFloat(4));
				student.setDob(rs.getString(5));
				student.setContact(rs.getString(6));
				student.setLocalAddress(rs.getString(7));
				
				list.add(student);
			}
			
			s.close();
			con.close();
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return list;
	}




	@Override
	public void deleteStudent(int rollNo, int standard) {

//		to save the details in db connection with db is required after that only we can enter details into db.
		try {
		Connection con = myConn.getConn();
		
//		connection object received - now go for query and its execution
		
		PreparedStatement s = con.prepareStatement("delete from mvcstudents where rollNo=? AND standard=?");
		
		s.setInt(1, rollNo);
		s.setInt(2, standard);
		
	
		
		int i = s.executeUpdate();
		
		s.close();
		con.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}






}
