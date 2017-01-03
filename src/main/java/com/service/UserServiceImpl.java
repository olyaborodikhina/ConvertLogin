package com.service;

import com.dao.UserDAO;
import com.domain.User;
import com.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hp on 03.01.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;

    public User findUserByLogin(String login) {
        return userRepositories.findUserByLogin(login);
    }

    public User findUserById(Integer id) {
        return userRepositories.findOne(id);
    }

    public boolean findUser(String login) {
        User user = userRepositories.findUserByLogin(login);
        if(user != null)
            return true;
        else
            return false;
    }

    public User save(User user) {
        return userRepositories.save(user);
    }
}
