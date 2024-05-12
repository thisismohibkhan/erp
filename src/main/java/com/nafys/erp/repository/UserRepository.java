package com.nafys.erp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nafys.erp.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	public Optional<User> findByUsername(String username);
}
