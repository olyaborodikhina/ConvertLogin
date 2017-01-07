package com.converterDAO.service.impl;

import com.converterDAO.entity.Role;
import com.converterDAO.repository.RoleRepository;
import com.converterDAO.repository.UserRepository;
import com.converterDAO.entity.User;
import com.converterDAO.service.UserService;
import com.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;

/**
 * Created by hp on 03.01.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);
    }



//    @Override
//    @Transactional
//    public User getUserById(Long id) throws UserNotFoundException {
//        User user = userRepository.findOne(id);
//        if(user == null)
//            throw new UserNotFoundException();
//        else return user;
//    }
//
//    @Override
//    @Transactional
//    public boolean isValidUser(String login) {
//        User user = userRepository.findByLogin(login);
//        if(user != null)
//            return true;
//        else return false;
//    }
//
//    @Override
//    @Transactional
//    public User addUser(User user) {
//        return userRepository.saveAndFlush(user);
//    }



}
