package com.grandline.springbootstarter.service;

import com.grandline.springbootstarter.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 3/26/18.
 */
@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"Bray"));
        users.add(new User(2,"Brie"));
    }
    public List<User> findAllUser(){
        return users;
    }
    public User saveUser(User user){
        if(user.getId()==null){
            int len = users.size();
            user.setId(++len);
        }
        users.add(user);
        return user;
    }
    public User findUser(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
