package com.project.TodoApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.TodoApplication.model.User;
import com.project.TodoApplication.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> getAll() {

		return repository.findAll();
	}

	public ResponseEntity<String> addUserDetails(User user) {
//
//		        String encodedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
//		        user.setPassword(encodedPassword);
//		        repository.save(user);
//		        
//		        return ResponseEntity.ok("User saved");
//		    }

		if (user.getUserName().isBlank()) {

			return ResponseEntity.ok("User Name is Empty");
		}
		repository.save(user);
		return ResponseEntity.ok("User Saved");

	}

	public Optional<User> getAll(Long id) {

		return repository.findById(id);
	}

	public void delete(Long id) {

		repository.deleteById(id);

	}

}
