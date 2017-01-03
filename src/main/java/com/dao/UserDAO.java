package com.dao;

import com.domain.User;

import java.util.List;


/**
 * Created by hp on 03.01.2017.
 */
public interface UserDAO {

    public void addUser(User user);

    public List<User> listUsers();
}
