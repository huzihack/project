package com.my.bean;

import lombok.Getter;
import lombok.Setter;



public class UserInfo {
	
	
	private Long id;
	
	private String userName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	private int userSex;
	@Override
	public String toString() {
			return "UserInfo [id=" + id + ", userName=" + userName + ", userSex="
					+ userSex + "]";
	
	}
	
	
	
	
	
	
	

}
