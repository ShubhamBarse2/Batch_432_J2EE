package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	int empId;
	String name;
	String city;
	String email;

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

	public Employee() {

	}

	public Employee(int empId, String name, String city, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}

}
