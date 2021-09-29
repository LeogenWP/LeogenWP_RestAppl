package com.leogenWP.myRestAPI.repository;

import com.leogenWP.myRestAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByLogin(String login);
}
