package com.shw.biz;

import com.shw.dao.UserDAO;

public class UserBizImpl implements UserBiz {

	//使用UserDAO接口声明了一个对象，
	//并为其添加set方法，用于依赖注入
	UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean login(String username, String password) {
		return userDAO.login(username, password);
	}

	@Override
	public void addUser(String username, String password) {
		userDAO.addUser(username, password);		
	}

	@Override
	public void delUser(int id) {
		userDAO.delUser(id);		
		//演示异常通知时，人为抛出该异常
		throw new RuntimeException("这是特意抛出的异常信息！");
	}

}
