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
import org.springframework.transaction.annotation.Transactional;

import com.moke.springmvctest.dao.AccountDao;
import com.moke.springmvctest.domain.Account;
import com.moke.springmvctest.domain.value.PersonID;

@RunWith(SpringJUnit4ClassRunner.class)//测试类
@ContextConfiguration({"/spring/applicationContext.xml"}) //配置文件
public class AccountDaoImpTest {
	
	//直接注入
	@Resource
	private DriverManagerDataSource dataSource;
	@Resource
	private SessionFactory sessionFactory;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		PersonID id = new PersonID("00001");
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

}
