package com.sample02.dao;

import java.util.ArrayList;
import java.util.List;

import com.sample02.model.Users;

public interface UsersDao {
	/**
	 * ����Ա��¼
	 * */
	public Users login(String name, String passWord);
	
	/**
	 * ��ǰ�û�ע����½
	 * */
	public void logout(Users users);
	
	/**
	 * �޸ĵ�ǰ�û�����
	 * */
	public boolean modifyPassWord(Users users);
	
	/**
	 * ��ҳ��ѯ
	 * */
	public ArrayList<Users> queryByPage();
}
