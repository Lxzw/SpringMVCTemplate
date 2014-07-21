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
public class ShowRoom_Cars {
	@Resource
	private SessionFactory sessionFactory;
	
	//插入数据
	@Test
	public void test() {
		ShowRoom showRoom = new ShowRoom();
		showRoom.setManager("ZHOU");
		showRoom.setLocation("HANGZHOU");
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW"));
		cars.add(new Car("AUDI"));
		showRoom.setCars(cars);
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    session.save(showRoom);
	    session.getTransaction().commit();
	}
	
	//获得对象
	@Test
	public void visitShowRoom() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		ShowRoom sRoom = new ShowRoom();
		session.load(sRoom, 1L);
		for (Car c : sRoom.getCars()) {
			System.out.println(c.getName());
		}
		session.getTransaction().commit();
		System.out.println(sRoom.getManager());
		
	}
}
