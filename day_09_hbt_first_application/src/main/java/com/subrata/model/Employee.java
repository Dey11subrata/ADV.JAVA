package com.subrata.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // use to make a java class java bean class (Entity class)
@Table(name="Employee") // use to map db table with hbnt bean class entity(optional) if not mentioned then class name becomes table name but if different name req. then use this annotation
public class Employee {
@Id // use to make identify property that is mapped with primary key col. of table	.
@Column(name="id") // use to specify the col. name mapped with Id. (optional) if not mentioned then it by def. became id in this case
private int id;
@Column(name="name")
private String name;
private float salary;
private String dept;
@Temporal(TemporalType.DATE) // hibernate date annotation
private Date hdate;

public Employee() {
	
}

public Employee(int id, String name, float salary, String dept, Date hdate) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
	this.hdate = hdate;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Date getHdate() {
	return hdate;
}
public void setHdate(Date hdate) {
	this.hdate = hdate;
}


@Override
public String toString() {
	return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", hdate=" + hdate;
}

}
