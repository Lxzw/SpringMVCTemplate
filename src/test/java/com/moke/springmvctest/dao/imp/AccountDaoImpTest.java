package com.moke.springmvctest.dao.imp;

import static org.junit.Assert.*;

import java.sql.Date;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moke.springmvctest.domain.Account;
import com.moke.springmvctest.domain.DBTest;
import com.moke.springmvctest.domain.value.PersonID;

@RunWith(SpringJUnit4ClassRunner.class)//测试类
@ContextConfiguration({"/spring/applicationContext.xml"}) //配置文件
public class AccountDaoImpTest {
	
	//直接注入
	@Resource
	private DriverManagerDataSource dataSource;
	@Resource
	private  SessionFactory sessionFactory;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		PersonID id = new PersonID(00003);
		Session session = sessionFactory.getCurrentSession();
		
		Account account = new Account();
		account.setId(id);
		account.setUsername("zhouxingxing");
		account.setPassword("123");
		account.setCreateDate(new Date(System.currentTimeMillis()));
		session.beginTransaction();
		session.save(account);
		session.getTransaction().commit();
		
	}
	
	@Test
	public void test1() {
		DBTest dbTest = new DBTest();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(dbTest);
		session.getTransaction().commit();
	}

}
