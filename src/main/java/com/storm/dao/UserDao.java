package com.storm.dao;

import java.util.List;

import com.storm.model.UserModel;

public interface UserDao {
    public List<UserModel> getUser(UserModel userModel);
}
