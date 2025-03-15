package com.ajmayen.mvcwiththymleaf.service;

import com.ajmayen.mvcwiththymleaf.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getAllUser(){
        return userList;
    }
}
