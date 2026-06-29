package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int stud_id;
	String name;

	@OneToOne
	Laptop lpt;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String name, Laptop lpt) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.lpt = lpt;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLpt() {
		return lpt;
	}

	public void setLpt(Laptop lpt) {
		this.lpt = lpt;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", lpt=" + lpt + "]";
	}

}
