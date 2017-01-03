package com.service;

import com.domain.User;

import java.util.List;

/**
 * Created by hp on 03.01.2017.
 */
public interface UserService {

    User findUserByLogin(String login);
    User findUserById(Integer id);
    boolean findUser(String login);
    User save(User user);

}
