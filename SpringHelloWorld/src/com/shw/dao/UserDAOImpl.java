package com.shw.dao;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("123456")){
			return true;
		}
		return false;
	}

	@Override
	public void addUser(String username, String password) {
		//��ʵ��δʵ�����ݿ����
		System.out.println(username+"�û���ӳɹ�");		
	}

	@Override
	public void delUser(int id) {
		//��ʵ��δʵ�����ݿ����
		System.out.println("���Ϊ"+id+"���û���ɾ��");		
	}
}
