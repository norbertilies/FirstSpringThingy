package com.example.spring.service.impl;

import com.example.spring.Application;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nilies on 7/13/2016.
 */
@Component
@Service("USI2")
public class UserServiceImpl2 implements UserService, ApplicationContextAware {

    @Autowired
    private ApplicationContext appContext;

    private UserRepositoryImpl userRepo = appContext.getBean(UserRepositoryImpl.class);

    @Override
    public List<User> list(){
        System.out.println("USI2 List");
        return userRepo.list();
    }

    @Override
    public User get(int id){
        System.out.println("USI2 Get");
        return userRepo.get(id);
    }

    @Override
    public void save(User user){
        System.out.println("USI2 Save");
        userRepo.save(user);
    }

    public void setApplicationContext(ApplicationContext ap){
        appContext=ap;
    }

}
