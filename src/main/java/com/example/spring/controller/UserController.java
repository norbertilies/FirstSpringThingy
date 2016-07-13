package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

	@Autowired
	private UserService userService;


	public void createUser(User user){
		userService.save(user);
		// call UserService here
	}
}
