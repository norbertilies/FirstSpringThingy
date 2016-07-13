package com.example.spring.repository.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<User> list() {
		throw new UnsupportedOperationException();
	}

	@Override
	public User get(int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void save(User user) {
		throw new UnsupportedOperationException();
	}

}
