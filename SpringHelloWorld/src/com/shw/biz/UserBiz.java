package com.shw.biz;

public interface UserBiz {
	public boolean login(String username,String password);
	//添加用户
	public void addUser(String username,String password);
	//删除用户
	public void delUser(int id);

}
