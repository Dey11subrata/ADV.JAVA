package com.practice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Faculty {
	
		@Id
		private int id;
		@Column(name="name")
		private String name;
		private String subject;
		@Temporal(TemporalType.DATE)
		private Date joiningDate;
		

	public Faculty(int id) {
			super();
			this.id = id;
		}

	public Faculty() {
	
	}

	public Faculty(int id, String name, String subject, Date joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "{" + id + ","+ name + ", " + subject + "," + joiningDate + "}";
	}
	
	

}
