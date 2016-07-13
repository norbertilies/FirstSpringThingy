package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import java.util.List;


public class UserController {

	@Autowired
    @Qualifier("USI1")
	private UserService userService;

	public void createUser(User user){
		userService.save(user);
	}

}
