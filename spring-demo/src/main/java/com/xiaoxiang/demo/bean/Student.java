package com.xiaoxiang.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Student {

	@Value("luxiao")
	private String username ;

	@Value("2013-03-15")
	private Date date ;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Value("123s")
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
