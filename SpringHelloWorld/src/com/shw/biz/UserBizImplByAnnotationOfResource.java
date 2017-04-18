package com.shw.biz;

import javax.annotation.Resource;

import com.shw.dao.UserDAO;

public class UserBizImplByAnnotationOfResource implements UserBiz {
	//��ע���ע������userDAO��
	@Resource(name="userDAO")    //��ֱ��ʹ��@Resource
	UserDAO userDAO;	
	
	//��ע���ע������userDAO��set������
	//@Resource(name="userDAO")  //��ֱ��ʹ��@Resource
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
