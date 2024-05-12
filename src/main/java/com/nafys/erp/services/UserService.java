package com.nafys.erp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nafys.erp.model.User;

@Service
public class UserService {

	private List<User> users = new ArrayList<>();
	
	UserService(){
		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
	}
	
	public List<User> getUsers() {
		return users;
	}
}
