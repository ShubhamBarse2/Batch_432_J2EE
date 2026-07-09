package com.jbk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.dao.EmployeeService;
import com.jbk.entities.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

	@DeleteMapping("/dlt/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Employee e, @PathVariable int id) {
		String msg = service.updateData(e, id);
		return msg;
	}

	@GetMapping("/getSingle")
	public Optional<Employee> getSingleData(@RequestParam int id) {
		Optional<Employee> e = service.getSingleData(id);
		return e;
	}

	@GetMapping("/getAll")
	public List<Employee> getAllData() {
		List<Employee> list = service.getAllData();
		return list;
	}
}
