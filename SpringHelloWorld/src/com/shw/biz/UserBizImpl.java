package com.shw.biz;

import com.shw.dao.UserDAO;

public class UserBizImpl implements UserBiz {

	//ʹ��UserDAO�ӿ�������һ������
	//��Ϊ�����set��������������ע��
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
		//��ʾ�쳣֪ͨʱ����Ϊ�׳����쳣
		throw new RuntimeException("���������׳����쳣��Ϣ��");
	}

}
