package com.test;

public class Employee {
private String name;
private int id;
public Employee(int i, String string, String string2) {
	// TODO Auto-generated constructor stub
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String company;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", company=" + company + "]";
}

}
