package com.moke.springmvctest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_car")
public class Car {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CAR_ID")
	private long id;
	private String name;
	
	public Car(String name) {
		setName(name);
	}
	
	public Car() {
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
