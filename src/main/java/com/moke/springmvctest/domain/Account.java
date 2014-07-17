package com.moke.springmvctest.domain;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.moke.springmvctest.domain.value.PersonID;

@Entity
@Table(name="tb_account")
public class Account {
	PersonID id;
	String username;
	String password;
	Date createDate;
	
	@EmbeddedId
	public PersonID getId() {
		return id;
	}
	public void setId(PersonID id) {
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
