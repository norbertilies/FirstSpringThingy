package com.example.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.controller.UserController;

@Configuration
@ComponentScan("com.example.spring") // search the ... package for @Component classes
public class Config {
	@Bean
	public UserController createUserController(){
		return new UserController();
	}
}
