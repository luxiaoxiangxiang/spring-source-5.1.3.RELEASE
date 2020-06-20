package com.xiaoxiang.demo.bean;

import org.springframework.stereotype.Service;


public class Student {

	private String username = "luxiao";

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
