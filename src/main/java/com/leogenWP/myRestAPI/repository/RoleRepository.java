package com.leogenWP.myRestAPI.repository;

import com.leogenWP.myRestAPI.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
