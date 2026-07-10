package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/user")
	public String firstApi() {
		return "this is an USER MODULE ... ! ";
	}

	@PostMapping("/admin")
	public String secondApi() {
		return "this is an ADMIN MODULE ... ! ";
	}

	@PutMapping("/home")
	public String thirdApi() {
		return "this is an HOME PAGE ... ! ";
	}

}
