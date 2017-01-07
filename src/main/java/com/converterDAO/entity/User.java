package com.converterDAO.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
/**
 * Created by hp on 17.12.2016.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    private Long id;
    private String login;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;
    private Set<Account> accounts;

//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private ArrayList<Account> accounts = new ArrayList<Account>();

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){return id; }

    public void setId(long id){this.id = id;}

    public String getLogin(){return login;}

    public void setLogin(String login){this.login = login;}

    public String getPassword(){return password;}

    public void setPassword(String password){this.password = password;}

    @Override
    public String toString() {
        return "User: {" +
                "id = " + id +
                ", login = " + login+
//                ", accounts " + accounts +
                "}";
    }

   // public ArrayList<Account> getAccounts(){
       // return this.accounts;
   // }


    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }


    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

}
