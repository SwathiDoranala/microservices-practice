package com.practice.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.departmentservice.entity.Department;
import com.practice.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class Departmentcontroller {
	
	@Autowired
    private DepartmentService departmentService;
	
	@PostMapping("/create")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
    
	@GetMapping("/get/{departmentId}")
	public Department findDepartmentById(@PathVariable long departmentId) {
	    return departmentService.findDepartmentById(departmentId);
	}

}
