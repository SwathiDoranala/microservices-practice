package com.practice.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	@Column
	private String userName;
	@Column
	private String userDepartmentId;
	public Customer(long userId, String userName, String userDepartmentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDepartmentId = userDepartmentId;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserDepartmentId() {
		return userDepartmentId;
	}
	public void setUserDepartmentId(String userDepartmentId) {
		this.userDepartmentId = userDepartmentId;
	}	
}
