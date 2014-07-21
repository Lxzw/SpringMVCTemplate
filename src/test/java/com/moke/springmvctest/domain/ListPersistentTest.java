package com.moke.springmvctest.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring/applicationContext.xml"})
public class ListPersistentTest {
	
	@Resource
	private SessionFactory sessionFactory;
	
	//数据插入
	@Test
	public void test() {
		Actor actor = new Actor();
		actor.setName("zhou");
		actor.setAddress("here");
		Actor actor2 = new Actor();
		actor2.setName("wang");
		actor2.setAddress("there");
		Movie movie = new Movie();
		movie.setName("transforms4");
		List<Actor> actors = new ArrayList<Actor>();
		actors.add(actor);
		actors.add(actor2);
		movie.setActors(actors);
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
	}
	
	//数据查找
	@Test
	public void query() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Movie> movies = session.createQuery("from Movie").list(); 
		for (Movie m : movies) {
			System.out.println(m.getId());
			System.out.println(m.getName());
			for (Actor actor : m.getActors()) {
				System.out.println(actor.getName());
				System.out.println(actor.getAddress());
			}
		}
		session.getTransaction().commit();
	}
	
}
