package com.moke.springmvctest.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="tb_showroom")
public class ShowRoom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ShowRoom_ID")
	private long id = 0;
	private String manager;
	private String location;
	@OneToMany
	@JoinTable (
		name="SHOWROOT_CAR_INTER",
		joinColumns = @JoinColumn(name="ShowRoom_ID")
			)
	@Cascade(CascadeType.ALL)
	private List<Car> cars;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
