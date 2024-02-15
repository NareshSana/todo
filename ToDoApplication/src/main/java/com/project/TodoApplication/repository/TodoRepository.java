package com.project.TodoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TodoApplication.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
