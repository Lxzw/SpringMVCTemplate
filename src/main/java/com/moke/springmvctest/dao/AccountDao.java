package com.moke.springmvctest.dao;

import java.sql.Date;
import java.util.List;

import com.moke.springmvctest.domain.Account;
import com.moke.springmvctest.domain.value.PersonID;


public interface AccountDao {
	//查找所有账号
	public List<Account> listAllAccounts();
	//按创建时间查询账号
	public List<Account> queryByCreateDate(Date begin, Date end);
	//根据用户名查找个人账号（用户名唯一）
	public Account queryByName(String name);
	//根据ID查找账号
	public Account queryById(PersonID id);
	
	//更新用户密码
	public int updatePassword(String password);
	
	//根据id删除账户
	public int deleteAccountById(PersonID id);
	//删除多个用户
	public int deleteAccounts(List<Account> accounts);	
}
