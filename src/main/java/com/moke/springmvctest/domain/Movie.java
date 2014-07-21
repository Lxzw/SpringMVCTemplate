package com.moke.springmvctest.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="Movie")
public class Movie {
	@Id
	@Column(name="MOVIE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	
	@OneToMany
	@JoinColumn(name="MOVIE_ID")
	@Cascade(CascadeType.ALL)
	private List<Actor> actors=null;
	
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
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

}
