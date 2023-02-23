package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.ServiceUserIMPL;

@RestController
@RequestMapping("/Api/User")
public class UserController {

	@Autowired
	public ServiceUserIMPL serviceuserimpl;
	
//	@PostMapping("/User/add")
//    public User createUser( User user) {
//	User userCreate = serviceuserimpl.createUser(user);
//	return userCreate;
//    }
//	@PutMapping("/User/update")
//	public User updateUser(User user) {
//		User updateUser = serviceuserimpl.updateUser(user);
//	    return updateUser;
//	}
//	@GetMapping("/UserById/{id}")
//	public User getUserById(@PathVariable("id") int id) {
//		User user = serviceuserimpl.getUserById(id);
//		return user;
//	}
	@PreAuthorize("hasRole('User')")
	//See all user 
	@GetMapping("/AllUsers/list")
	public List<User> allUsers(){
		List<User> list = serviceuserimpl.allUsers();
	    return list;
	}
	@PreAuthorize("hasRole('ADMIN')")
	//Delete any User
	@DeleteMapping("/DeleteById/{id}")
	public void deleteUser(@PathVariable("id")  int id) {
		serviceuserimpl.deleteUser(id);
	}
}
