package com.practice.userservice.dto;

public class ResponseDto {

	private CustomerDto customer;
	private DepartmentDto department;
	public CustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public ResponseDto(CustomerDto customer, DepartmentDto department) {
		super();
		this.customer = customer;
		this.department = department;
	}
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
