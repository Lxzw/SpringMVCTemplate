package com.moke.springmvctest.domain.value;

import java.io.Serializable;

import javax.persistence.Embeddable;

//用户值对象
@Embeddable
public class PersonID implements Serializable {
	private String id;
	
	public PersonID(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return getId();
	}
}
