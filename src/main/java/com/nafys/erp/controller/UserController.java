package com.nafys.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nafys.erp.entity.User;
import com.nafys.erp.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public String welcome() {
		return "Hello ";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
