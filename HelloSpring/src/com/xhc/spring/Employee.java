package com.xhc.spring;

public class Employee {
	private int id;
	private String department;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String department, String name, int age) {
		super();
		this.id = id;
		this.department = department;
		this.name = name;
		this.age = age;
	}
	
	

}
