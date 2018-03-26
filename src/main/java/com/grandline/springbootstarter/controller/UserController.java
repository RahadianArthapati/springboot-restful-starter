package com.grandline.springbootstarter.controller;

import com.grandline.springbootstarter.bean.User;
import com.grandline.springbootstarter.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by home on 3/27/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return service.findAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return service.findUser(id);
    }
}
