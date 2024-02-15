package com.project.TodoApplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.TodoApplication.model.Todo;
import com.project.TodoApplication.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;
	
	
	public Optional<Todo> getAll(Long id) {
		
		return repository.findById(id) ;
	}


	public ResponseEntity<String> saveAll(Todo todo) {
		
		repository.save(todo);
		
		return ResponseEntity.ok("Task Added");
		
		
	}


	public ResponseEntity<String> deleteTodo(Long id) {
		
		//Optional<Todo> todo = repository.findById(id);
		
		repository.deleteById(id);
		
		return ResponseEntity.ok("Task Deleted");
	}


	public void updateTodo(Todo todo) {

		repository.save(todo);
//		Optional<Todo> ExistingTodo=repository.findById(id);
//		ExistingTodo=Optional.of(todo);
		
	}

}

