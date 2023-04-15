package com.practice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.userservice.dto.ResponseDto;
import com.practice.userservice.entity.Customer;
import com.practice.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public Customer saveUser(@RequestBody Customer user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/get/{userId}")
	public ResponseDto findById(@PathVariable long userId) {
		return userService.findUserById(userId);
	}

}
