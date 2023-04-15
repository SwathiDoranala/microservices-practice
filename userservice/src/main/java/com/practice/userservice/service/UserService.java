package com.practice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.userservice.entity.Customer;
import com.practice.userservice.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public Customer saveUser(Customer user) {
		return userRepository.save(user);
	}

	public Customer findUserById(long id) {
		return userRepository.findById(id).get();
	}
}
