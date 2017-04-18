package com.sample02.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sample02.dao.UsersDao;

public class UsersAction {
	public class Login extends ActionSupport{
		private String userName = "";
		private String passWord = "";
		private String message = "";
		private UsersDao usersDao;
		
		public void validate(){
			if(null==userName || userName.equals("")){
				this.addFieldError("userName", "用户名不能为空！");
			}
			if(null==passWord || passWord.equals("")){
				this.addFieldError("passWord", "密码不能为空！");
			}
			System.out.println("验证结束！！！");
		}
		
		public String login() throws Exception {
			// 根据用户输入的姓名,进行的封装
			String result = "";
			if("jbit".equals(this.getUserName()) && "jbit".equals(this.getPassWord())){
				this.setMessage("登录成功！");
				// 处理完毕,返回导航结果的逻辑名
				Map<String,Object> session = null;
				session = ActionContext.getContext().getSession();
				
				if(session.containsKey("CURRENT_USER")){
					session.remove("CURENT_USER");
				}
				session.put("CURRENT_USER", userName);
				result = SUCCESS;
			}else{
				this.setMessage("登录失败！");
				result = ERROR;
			}
			return result;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
	}
}
