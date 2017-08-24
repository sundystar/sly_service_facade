package com.sly.facade.entity;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String password;
	
	public Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", id=" + id + "]";
	}
	
}
