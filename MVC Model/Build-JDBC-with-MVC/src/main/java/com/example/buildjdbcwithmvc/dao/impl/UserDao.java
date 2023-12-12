package com.example.buildjdbcwithmvc.dao.impl;

import com.example.buildjdbcwithmvc.dao.IUserDao;
import com.example.buildjdbcwithmvc.model.User;
import com.example.buildjdbcwithmvc.utils.JDBCConnection;

import java.util.List;

public class UserDao implements IUserDao {
    private JDBCConnection jdbcConnection;
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getOneUser(int id) {
        return null;
    }

    @Override
    public boolean addNewUser(User user) {
        return false;
    }

    @Override
    public boolean editUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }
}
