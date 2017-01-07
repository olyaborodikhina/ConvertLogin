package com.converterDAO.service;

import com.converterDAO.entity.User;
import com.exception.UserNotFoundException;

/**
 * Created by hp on 03.01.2017.
 */
public interface UserService {

    User findByLogin(String login);
   // User getUserById(Long id) throws UserNotFoundException;
   // boolean isValidUser(String login);
    //User addUser(User user);
    void save(User user);

}
