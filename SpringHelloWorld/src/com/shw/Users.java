package com.shw;

import java.util.Random;

public class Users {
	private String loginName;
	private String loginPwd;
	
	//Ĭ�Ϲ��췽��
	public Users(){
		//����һ��100000���ڵ��������
		this.loginPwd=String.valueOf(new Random().nextInt(100000));
	}	
	public Users(String loginName, String loginPwd){
		this.loginName=loginName;
		this.loginPwd=loginPwd;
	}	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}	
}
