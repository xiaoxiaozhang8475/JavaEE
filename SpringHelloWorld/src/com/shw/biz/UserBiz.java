package com.shw.biz;

public interface UserBiz {
	public boolean login(String username,String password);
	//����û�
	public void addUser(String username,String password);
	//ɾ���û�
	public void delUser(int id);

}
