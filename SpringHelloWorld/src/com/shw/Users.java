package com.shw;

import java.util.Random;

public class Users {
	private String loginName;
	private String loginPwd;
	
	//默认构造方法
	public Users(){
		//产生一个100000以内的随机密码
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
