package com.springgreetingapp.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.springgreetingapp.model.Greeting;
import com.springgreetingapp.model.User;

@Service
public class GreetingService implements IGreetingService{
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, user.toString());
		return new Greeting(counter.incrementAndGet(),message);
	}

}
