package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private List<User> userList;

    public UserRepositoryImpl(){
        userList=new ArrayList<>();
    }

    @Override
    public List<User> list() {
        displayAllUsers(userList);
        return userList;
    }

    @Override
    public User get(int id) throws RuntimeException {
        for (User u : userList)
            if (u.getId() == id)
                return u;
        throw new RuntimeException("No user with that id found");
    }

    @Override
    public void save(User user) {
        userList.add(user);
        displayAllUsers(userList);
        System.out.println("Saved user " + user.getId());
    }

    private void displayAllUsers(List<User> l) {
        System.out.println("\nAll current users:"+l.size());
        for (User u : l)
            System.out.println(u.getId() + " " + u.getFirstname());
        System.out.println("List ended here");
    }
}

