package com.example.spring.service;

import java.util.List;

import com.example.spring.domain.User;

public interface UserService {
	List<User> list();
	User get(int id);
	void save(User user);
}
