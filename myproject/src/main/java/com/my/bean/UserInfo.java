package com.my.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



public class UserInfo {
	
	
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String userName;
	@Getter
	@Setter
	private int userSex;
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", userSex="
				+ userSex + "]";
	}
	
	
	
	
	
	
	

}
