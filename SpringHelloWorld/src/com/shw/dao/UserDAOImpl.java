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
		//该实例未实现数据库操作
		System.out.println(username+"用户添加成功");		
	}

	@Override
	public void delUser(int id) {
		//该实例未实现数据库操作
		System.out.println("编号为"+id+"的用户被删除");		
	}
}
