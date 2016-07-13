package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.controller.UserController;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl myUserRepositoryImpl;

    @Override
    public List<User> list() {
        //call method from UserRepository and remove throw
        return myUserRepositoryImpl.list();
    }

    @Override
    public User get(int id) {
        //call method from UserRepository and remove throw
        try {
            return myUserRepositoryImpl.get(id);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return new User();
    }

    @Override
    public void save(User user) {
        //call method from UserRepository and remove throw
        myUserRepositoryImpl.save(user);

    }

}