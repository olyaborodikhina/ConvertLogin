package com.converterDAO.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by hp on 17.12.2016.
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {

    private Long id;
    private Map<Currency,Long> balance;
    private Set<User> users;

    public Account(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId(){
       return this.id;
    }

    public Map<Currency,Long> getBalance(){
       return  this.balance;
    }

}
