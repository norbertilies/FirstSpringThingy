package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.controller.UserController;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service("USI1")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl myUserRepositoryImpl;

    @Autowired
    private User u1;
    @Autowired
    private User u2;



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

        System.out.println("User 1: " +u1);
        System.out.println("User 2: "+u2);
        //call method from UserRepository and remove throw
        myUserRepositoryImpl.save(user);

    }

}