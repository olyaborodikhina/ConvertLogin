package com.repositories;

import com.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by hp on 04.01.2017.
 */
public interface UserRepositories extends CrudRepository<User, Integer> {

    User findUserByLogin(String login);

}
