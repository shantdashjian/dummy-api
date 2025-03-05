package com.polarbookshop.dummyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")
	public String getGreeting() {
		return "Hello, My World!";
	}
}
