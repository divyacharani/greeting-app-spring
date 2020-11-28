package com.springgreetingapp.service;

import com.springgreetingapp.model.Greeting;
import com.springgreetingapp.model.User;

public interface IGreetingService {

	public Greeting addGreeting(User user);
}
