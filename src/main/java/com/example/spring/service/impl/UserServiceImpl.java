package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<User> list() {
		//call method from UserRepository and remove throw
		throw new UnsupportedOperationException();
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		throw new UnsupportedOperationException();
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		System.out.println("hello world" + user.toString());

	}
}
