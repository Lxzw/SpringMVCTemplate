package com.moke.springmvctest.domain.value;

import java.io.Serializable;

import javax.persistence.Embeddable;


//用户值对象
@Embeddable
public class PersonID implements Serializable {
	private static final long serialVersionUID = -4469143325886577745L;
	private Integer id;
	

	public PersonID(Integer id) {
		this.setId(id);
	}
	
	public Integer getId() {
		return id;
	}
	
	public String toString() {
		return getId() + "";
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
