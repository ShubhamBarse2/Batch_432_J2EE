package com.jbk.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.entities.Employee;
import com.jbk.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;

	public String insertData(Employee e) {
		repo.save(e);
		return "inserted ..!";
	}

	public String deleteData(int id) {
		repo.deleteById(id);
		return "deleted ..!";
	}

	public Optional<Employee> getSingleData(int id) {
		return repo.findById(id);
	}

	public List<Employee> getAllData() {
		return repo.findAll();
	}

	public String updateData(Employee e, int id) {
		Employee e1 = repo.getById(id);
		e1.setName(e.getName());
		e1.setEmail(e.getEmail());
		e1.setCity(e.getCity());
		e1.setSalary(e.getSalary());
		repo.save(e1);
		return "updated ..!";
	}

}
