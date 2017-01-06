package com.converterDAO.repository;

import com.converterDAO.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by hp on 03.01.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select b from User b where b.login = :login")
    User getUserByLogin(@Param("login") String login);
}
