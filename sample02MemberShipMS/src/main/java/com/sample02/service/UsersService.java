package com.sample02.service;

import java.util.ArrayList;

import com.sample02.model.Users;

public interface UsersService {
	/**
	 * 验证用户名和密码
	 * */
	public boolean verifyUsers(String name, String passWord);
	
	/**
	 * 分页查询
	 * */
	public ArrayList<Users> queryByPage();
}
