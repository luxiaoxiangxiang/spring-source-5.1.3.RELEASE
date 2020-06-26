package com.xiaoxiang.demo.bean;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {

	private String username = "luxiao";

	private Date date ;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

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

	@Override
	public String  toString() {
		return "Student{" +
				"username='" + username + '\'' +
				", date=" + new SimpleDateFormat("yyyy-MM-dd").format(date) +
				", password='" + password + '\'' +
				'}';
	}
}
