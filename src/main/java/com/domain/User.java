package com.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by hp on 17.12.2016.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable{

    @Id
    @Column(name = "Id")
    @GeneratedValue
    Integer id;

    @Column(name = "login")
    String login;

    @Column(name= "password")
    String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public int getId(){return id; }

    public void setId(int id){this.id = id;}

    public String getLogin(){return login;}

    public void setLogin(String login){this.login = login;}

    public String getPassword(){return password;}

    public void setPassword(String password){this.password = password;}

    @Override
    public String toString() {
        return "User: {" +
                "id = " + id +
                ", login = " + login+
                ", accounts " + accounts +
                "}";
    }
}
