package com.sample02.model;

import java.util.Date;

public class Users {
	private int id;	//管理员id
	private String name;	//管理员帐户名
	private String passWord;	//管理员密码
	private String status;	//管理员状态
	private Date lastModifyTime;	//最后修改时间
	private int typeId;		//管理员类型
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public Users(String name, String passWord, String status, Date lastModifyTime, int typeId) {
		super();
		this.name = name;
		this.passWord = passWord;
		this.status = status;
		this.lastModifyTime = lastModifyTime;
		this.typeId = typeId;
	}
	public Users() {
		super();
	}
}
