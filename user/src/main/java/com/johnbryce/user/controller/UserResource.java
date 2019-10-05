package com.johnbryce.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnbryce.user.repo.beans.User;
import com.johnbryce.user.repo.service.UserService;

@RestController
public class UserResource {

	
	
	@Autowired
	private UserService userservise;
	
	
	
	
	@PostMapping("/add")
	
	public User addUser(@RequestBody User user) {
		return userservise.saveUser(user);
	}
	
	@GetMapping("/users")
	public List<User> gettAllUsers(){
		return userservise.getUsers();
	}
	
	@GetMapping("/educationtype/{education}")
	public List<User> findByEducation(@PathVariable String education){
		return userservise.getByEducation(education);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	
	public void deleteUser(@PathVariable long id) {
		 userservise.deleteUser(id);
	}
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable long id , @RequestBody User user) {
		return userservise.saveUser(user);
	}
}
