package com.example.buildjdbcwithmvc.dao;

import com.example.buildjdbcwithmvc.model.User;

import java.util.List;

public interface IUserDao {
    List<User> getAllUser();
    User getOneUser(int id);
    boolean addNewUser(User user);
    boolean editUser(User user);
    boolean removeUser(int id);
}
