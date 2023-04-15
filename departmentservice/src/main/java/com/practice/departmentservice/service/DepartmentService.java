package com.practice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.departmentservice.entity.Department;
import com.practice.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
}
