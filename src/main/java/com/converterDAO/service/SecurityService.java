package com.converterDAO.service;

/**
 * Created by hp on 06.01.2017.
 */
public interface SecurityService {

    String findLoggedInLogin();

    void autoLogin(String login, String password);
}
