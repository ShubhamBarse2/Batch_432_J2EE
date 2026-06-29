package com.entity;

public class Employee {

	private int empId;
	private String name;
	private String city;
	private String email;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String city, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}

}
