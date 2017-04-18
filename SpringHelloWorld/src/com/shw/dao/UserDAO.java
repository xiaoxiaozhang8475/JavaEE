package com.shw.dao;

public interface UserDAO {
	public boolean login(String username,String password);
	//添加用户
	public void addUser(String username,String password);
    //删除用户
	public void delUser(int id);

}
