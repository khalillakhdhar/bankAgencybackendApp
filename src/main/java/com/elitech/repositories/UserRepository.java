package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
