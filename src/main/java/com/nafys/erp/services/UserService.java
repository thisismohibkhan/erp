package com.nafys.erp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nafys.erp.entity.User;
import com.nafys.erp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
//	UserService(){
//		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
//		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
//		users.add(new User(UUID.randomUUID().toString(), "mohib", "mohib@gmail.com"));
//	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setIsActive(true);
		user.setIsAccountExpired(false);
		user.setIsAuthenticated(true);
		user.setIsCredentialExpired(false);
		return userRepository.save(user);
	}
}
