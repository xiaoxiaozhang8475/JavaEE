package com.sample02.service;

import java.util.ArrayList;

import com.sample02.model.Users;

public interface UsersService {
	/**
	 * ��֤�û���������
	 * */
	public boolean verifyUsers(String name, String passWord);
	
	/**
	 * ��ҳ��ѯ
	 * */
	public ArrayList<Users> queryByPage();
}
