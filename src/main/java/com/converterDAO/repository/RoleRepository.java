package com.converterDAO.repository;

import com.converterDAO.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 06.01.2017.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
