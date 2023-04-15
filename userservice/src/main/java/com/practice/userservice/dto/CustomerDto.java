package com.practice.userservice.dto;

public class CustomerDto {
	private long userId;
	private String userName;
	private String userDepartmentId;

	public CustomerDto(long userId, String userName, String userDepartmentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDepartmentId = userDepartmentId;
	}

	public CustomerDto() {
		super();
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
