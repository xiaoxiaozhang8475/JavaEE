package com.shw.dao;

public interface UserDAO {
	public boolean login(String username,String password);
	//����û�
	public void addUser(String username,String password);
    //ɾ���û�
	public void delUser(int id);

}
