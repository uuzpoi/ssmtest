package com.storm.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.storm.dao.UserDao;
import com.storm.model.UserModel;

@Service
public class UserService {
    
    @Resource 
    private UserDao userDao;
    
    public List<UserModel> getUser(UserModel userModel)
    {
        List<UserModel> userModelList=new ArrayList<UserModel>();
        userModelList=userDao.getUser(userModel);
        return userModelList;
    }
}
