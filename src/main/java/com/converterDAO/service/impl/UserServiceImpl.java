package com.converterDAO.service.impl;

import com.converterDAO.repository.UserRepository;
import com.converterDAO.entity.User;
import com.converterDAO.service.UserService;
import com.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hp on 03.01.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }



    @Override
    @Transactional
    public User getUserById(Long id) throws UserNotFoundException {
        User user = userRepository.findOne(id);
        if(user == null)
            throw new UserNotFoundException();
        else return user;
    }

    @Override
    @Transactional
    public boolean isValidUser(String login) {
        User user = userRepository.findByLogin(login);
        if(user != null)
            return true;
        else return false;
    }

    @Override
    @Transactional
    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }



}
