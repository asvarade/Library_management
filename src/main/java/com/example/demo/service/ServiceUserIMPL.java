package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@Service
public class ServiceUserIMPL implements ServiceUser {

	@Autowired
	public UserRepo userrepo;
	
	@Override
	public User createUser(User user) {
		userrepo.save(user);
		return null;
	}

	@Override
	public User updateUser(User user) {
		userrepo.save(user);
		return null;
	}

	@Override
	public User getUserById(int id) {
		userrepo.getById(id);
		return null;
	}

	@Override
	public List<User> allUsers() {
		List<User> list = new ArrayList();
        userrepo.findAll().forEach(a-> list.add(a));
		return list;
	}

	@Override
	public void deleteUser(int id) {
		userrepo.deleteById(id);

	}

}
