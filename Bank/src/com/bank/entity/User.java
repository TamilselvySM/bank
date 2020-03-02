package com.bank.entity;

public class User {
	
	private int id;
	private String userName;
	private String userEmail;
	private String userAge;
	private String userPhone;
	private String userBranch;
	private String userAccount;
	
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(String userBranch) {
		this.userBranch = userBranch;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userAge=" + userAge
				+ ", userPhone=" + userPhone + ", userBranch=" + userBranch + ", userAccount=" + userAccount + "]";
	}
	
}
