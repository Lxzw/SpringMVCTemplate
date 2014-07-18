package com.moke.springmvctest.domain;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.moke.springmvctest.domain.value.PersonID;

@Entity
@Table(name="tb_user") 
public class User {
	
	private PersonID id;
	private String name;
	private Date birthDate;
	private String department;
	private String email;
	private String telephone;
	
	@EmbeddedId
	public PersonID getId() {
		return id;
	}
	public void setId(PersonID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
