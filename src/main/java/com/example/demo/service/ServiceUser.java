package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface ServiceUser  {

	User createUser(User user);
	
	User updateUser(User user);
	
	User getUserById(int id);
	
	List<User> allUsers();
	
	void deleteUser(int id);
	
}
