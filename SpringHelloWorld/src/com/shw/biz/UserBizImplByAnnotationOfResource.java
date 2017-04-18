package com.shw.biz;

import javax.annotation.Resource;

import com.shw.dao.UserDAO;

public class UserBizImplByAnnotationOfResource implements UserBiz {
	//将注解标注在属性userDAO上
	@Resource(name="userDAO")    //或直接使用@Resource
	UserDAO userDAO;	
	
	//将注解标注在属性userDAO的set方法上
	//@Resource(name="userDAO")  //或直接使用@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public boolean login(String username, String password) {		
		return userDAO.login(username, password);
	}
	
	
	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		
	}	
}
