package com.converterService.object;

import com.converterDAO.entity.Account;

import java.util.HashMap;

/**
 * Created by hp on 04.01.2017.
 */
public class AccountDTO {
    long id;
    HashMap<String, Long> balance;

    AccountDTO(){}

    AccountDTO(Account account){
        this.id = account.getId();
        this.balance = account.getBalance();
    }

}
