package com.greg.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greg.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
