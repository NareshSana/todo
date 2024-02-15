package com.project.TodoApplication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.TodoApplication.model.Todo;
import com.project.TodoApplication.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping("/api/todo/{id}")
	private Optional<Todo> get(@PathVariable Long id) {
		
		Optional<Todo> todo=service.getAll(id);
			
		return todo;
	}
	
	@PostMapping("/api/todo")
	private ResponseEntity<String> save(@RequestBody Todo todo) {
		
		return service.saveAll(todo);
		
	}
	@DeleteMapping("/api/deletetodo/{id}")
	private ResponseEntity<String> delete(@PathVariable Long id){
		
		return service.deleteTodo(id);
	}
	
	@PutMapping("api/todo")
	private void update(@RequestBody Todo todo) {
		service.updateTodo(todo);
	}
}
