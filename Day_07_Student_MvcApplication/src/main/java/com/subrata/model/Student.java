package com.subrata.model;

public class Student {
// it is a bean class so all data members must be private and to access them write geter seter methods
	private int rollNo;
	private String name;
	private int standard;
	private float percentageScored;
	private String dob;
	private String contact;
	private String localAddress;
	
//	getter setter methods
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public float getPercentageScored() {
		return percentageScored;
	}
	public void setPercentageScored(float percentageScored) {
		this.percentageScored = percentageScored;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	
}

/*
 create table code;
 create table mvcStudents
 (
 	rollNo int,
 	name varchar(30),
 	standard int,
 	percentageScored float,
 	dob date,
 	contact varchar(10),
 	localAddress varchar(100),
 	
 	primary key(rollNo,standard)
 )
 
 */