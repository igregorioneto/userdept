package com.greg.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greg.userdept.entities.User;
import com.greg.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		List<User> users = repository.findAll();
		return users;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User user = repository.findById(id).get();
		return user;
	}
	
	@PostMapping
	public User create(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}

}
