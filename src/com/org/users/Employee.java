package com.org.users;

public class Employee {
	private String userName;
	private String password;
	private int assignmentPercentage;
	private String fullName;
	public Employee(String userName, String password, int assignmentPercentage, String fullName) {
		super();
		this.userName = userName;
		this.password = password;
		this.assignmentPercentage = assignmentPercentage;
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAssignmentPercentage() {
		return assignmentPercentage;
	}
	public void setAssignmentPercentage(int assignmentPercentage) {
		this.assignmentPercentage = assignmentPercentage;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
																																									
}
