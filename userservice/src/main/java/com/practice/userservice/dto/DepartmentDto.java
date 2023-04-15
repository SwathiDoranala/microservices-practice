package com.practice.userservice.dto;

public class DepartmentDto {
 private long id;
 private String departmentName;
 private String departmentCode;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
public DepartmentDto(long id, String departmentName, String departmentCode) {
	super();
	this.id = id;
	this.departmentName = departmentName;
	this.departmentCode = departmentCode;
}
public DepartmentDto() {
	super();
	// TODO Auto-generated constructor stub
}
 

}
