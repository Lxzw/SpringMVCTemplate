package com.moke.springmvctest.dao.imp;

import java.sql.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moke.springmvctest.dao.AccountDao;
import com.moke.springmvctest.domain.Account;
import com.moke.springmvctest.domain.value.PersonID;

@Component
public class AccountDaoImp implements AccountDao {
	
	private SessionFactory sessionFactory;
	
	
	public List<Account> listAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> queryByCreateDate(Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account queryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account queryById(PersonID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updatePassword(String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteAccountById(PersonID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteAccounts(List<Account> accounts) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
    @Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
