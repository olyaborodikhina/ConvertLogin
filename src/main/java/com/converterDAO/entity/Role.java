package com.converterDAO.entity;

import com.converterDAO.entity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by hp on 06.01.2017.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable{
    private Long id;
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}