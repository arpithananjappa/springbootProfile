package com.innominds.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProfileController {
	@Value("${spring.message}")
	private String message;
	
	@GetMapping("/hello")
	public String hello() {
		return message;
	}

}
