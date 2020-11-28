package com.springgreetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springgreetingapp.model.Greeting;
import com.springgreetingapp.model.User;
import com.springgreetingapp.service.IGreetingService;

@RestController
@RequestMapping("/hello")
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName ) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		return greetingService.addGreeting(user);
	}
}
