package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.entity.Department;

@Configuration
public class MyConfigClass {

	@Bean("dept")
	@Scope("prototype")
	public Department deptObject() {
		return new Department();
	}

}
