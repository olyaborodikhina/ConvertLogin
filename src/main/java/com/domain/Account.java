package com.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by hp on 17.12.2016.
 */
@Table(name = "ACCOUNT")
public class Account implements Serializable {

    @Id @GeneratedValue
    private int id;

    @ElementCollection
    @MapKeyColumn(name="Currency")
    @Column(name="count")
    @CollectionTable(name="balance", joinColumns=@JoinColumn(name="account_id"))
    private HashMap<String, Long> balance = new HashMap<String, Long>();

    @ManyToOne
    private User user;

   Account() {
       balance.put("EUR", 20L);
       balance.put("USD", 30L);
       balance.put("RUB", 40L);
   }

    @Override
    public String toString() {
        return "Account : " +
                "id =  " + id +
                "balance: " + balance.toString() +
                "user: " + user+
                "}";
    }
}
