package com.ajax_jquery.domain;

import java.util.Date;

public class User {

	/**
	 * `id` int(11) NOT NULL AUTO_INCREMENT,
	   `username` varchar(20) DEFAULT NULL,
	   `password` varchar(20) DEFAULT NULL,
	   `email` varchar(20) DEFAULT NULL,
	   `name` varchar(20) DEFAULT NULL,
	   `sex` varchar(10) DEFAULT NULL,
	   `birthday` date DEFAULT NULL,
	   `hobby` varchar(50) DEFAULT NULL,
	 */
	
	private int id;
	private String username;
	private String password;
	private String email;
	private String name;
	private String sex;
	private Date birthday;
	private String hobby;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
