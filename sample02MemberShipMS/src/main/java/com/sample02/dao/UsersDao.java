package com.sample02.dao;

import java.util.ArrayList;
import java.util.List;

import com.sample02.model.Users;

public interface UsersDao {
	/**
	 * 管理员登录
	 * */
	public Users login(String name, String passWord);
	
	/**
	 * 当前用户注销登陆
	 * */
	public void logout(Users users);
	
	/**
	 * 修改当前用户密码
	 * */
	public boolean modifyPassWord(Users users);
	
	/**
	 * 分页查询
	 * */
	public ArrayList<Users> queryByPage();
}
