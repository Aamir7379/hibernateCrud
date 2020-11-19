package com.jsoftteTechnology.DemoProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Text")
public class Student {
@Id
private int id;
@Column
private String name;
@Column
private String password;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
}
public Student(int id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
