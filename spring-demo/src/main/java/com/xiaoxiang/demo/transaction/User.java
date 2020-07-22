package com.xiaoxiang.demo.transaction;

import java.util.Objects;

/**
 * @ClassName User
 * @Description TODO
 * @Author luxiao
 * @description
 * @date 2020/7/19 19:49
 */
public class User implements Comparable{
	private String userName;
	private String password;
	private Integer age;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(String userName,String password,Integer age) {
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public User() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return Objects.equals(getUserName(),user.getUserName()) &&
				Objects.equals(getPassword(),user.getPassword()) &&
				Objects.equals(getAge(),user.getAge());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getUserName(),getPassword(),getAge());
	}


	@Override
	public int compareTo(Object o) {
		return getAge().compareTo(((User)o).getAge());
	}
}
