package com.project.TodoApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.TodoApplication.model.User;
import com.project.TodoApplication.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/api/users")
	public List<User> get() {

		return service.getAll();
	}

	@PostMapping("/api/addUser")
	private ResponseEntity<String> save(@RequestBody User user) {
		return service. addUserDetails(user);

	}
	
	@GetMapping("/api/user/{id}")
	private Optional<User> get(@PathVariable Long id) {
		
		Optional<User> user=service.getAll(id);
			
		return user;
	}
	
	@DeleteMapping("/api/delete/{id}")
	private void deleteUser(@PathVariable Long id) {
		service.delete(id);
	}
	
	
}
