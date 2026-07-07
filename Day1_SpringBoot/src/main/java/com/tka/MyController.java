package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3school")
public class MyController {

	@RequestMapping(name = "/java", method = RequestMethod.GET)
	public String firstApi() {
		return "java is an OOP based language";
	}

	@PostMapping("/js")
	public String thirdApi() {
		return "js used for Dynamic creation ";
	}

	@PutMapping("/python")
	public String fourthApi() {
		return "python used in AI ML";
	}

	@DeleteMapping("/css")
	public String fifthApi() {
		return "css usec for stylesheet  ";
	}

	@PostMapping("/html")
	public String secondApi() {
		return "html used to create web pages";
	}
}
