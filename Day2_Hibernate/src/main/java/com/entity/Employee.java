package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name ="empData")
public class Employee {

	@Id
	private int empId;
	@Column(name = "empName")
	private String name;
	private String city;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private long mobNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String city, String email, long mobNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.email = email;
		this.mobNo = mobNo;
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

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", email=" + email + ", mobNo="
				+ mobNo + "]";
	}

}
