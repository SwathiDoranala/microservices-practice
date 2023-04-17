package com.practice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.userservice.dto.CustomerDto;
import com.practice.userservice.dto.DepartmentDto;
import com.practice.userservice.dto.ResponseDto;
import com.practice.userservice.entity.Customer;
import com.practice.userservice.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public Customer saveUser(Customer user) {
		return userRepository.save(user);
	}

	public ResponseDto findUserById(long id) {
		ResponseDto responseDto = new ResponseDto();
		Customer user = userRepository.findById(id).get();
		CustomerDto customerDto = copyDetails(user);
		responseDto.setCustomer(customerDto);
		ResponseEntity<DepartmentDto> departmentDto= restTemplate.getForEntity("http://DEPARTMENT-SERVICE/department/get/"+user.getUserDepartmentId(), DepartmentDto.class);
		responseDto.setDepartment(departmentDto.getBody());	
		return responseDto;
	}
	
	public static CustomerDto copyDetails(Customer user) {
		CustomerDto customerDto = new CustomerDto(user.getUserId(),user.getUserName(),user.getUserDepartmentId());
		return customerDto;
		
	}
}
