package com.johnbryce.user.repo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnbryce.user.repo.UserRepository;
import com.johnbryce.user.repo.beans.User;

@Service
public class UserService {

	
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getUsers() {
		return userRepository.findAll();
		
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
	
	public List<User> getByEducation(String education){
		return userRepository.findByEducation(education);
	}
	
	
	public void deleteUser(long id) {
		userRepository.deleteById(id);
		 
	}
	
	
}
