package com.converterService.object;

import com.converterDAO.entity.User;

import java.util.ArrayList;

/**
 * Created by hp on 04.01.2017.
 */
public class UserDTO {

    Long id;
    String login;
    String password;
    ArrayList<AccountDTO> accounts;

    UserDTO(){}

    UserDTO(User user){
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.id = user.getId();
        for (int i =0; i < user.getAccounts().size(); i++){
            this.accounts.add(new AccountDTO(user.getAccounts().get(i)));
        }
    }

    public Long getId(){
        return this.id;
    }

    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }

    public ArrayList<AccountDTO> getAccounts(){
        return this.accounts;
    }
}
