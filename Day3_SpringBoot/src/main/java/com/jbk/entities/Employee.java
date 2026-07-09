package com.jbk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private String city;
	private double salary;
	private String email;

}
