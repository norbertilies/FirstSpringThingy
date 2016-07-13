package com.example.spring.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.User;

public class JavaConfigRunner implements ConfigRunner {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		UserController userController = context.getBean(UserController.class);
		userController.createUser(new User());
		
		context.registerShutdownHook();
	}
	
}
