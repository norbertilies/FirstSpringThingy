package com.example.spring.repository;

import java.util.List;

import com.example.spring.domain.User;

public interface UserRepository {
	List<User> list();
	User get(int id);
	void save(User user);
}
