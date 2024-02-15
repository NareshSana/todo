package com.project.TodoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TodoApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
