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
				this.addFieldError("userName", "�û�������Ϊ�գ�");
			}
			if(null==passWord || passWord.equals("")){
				this.addFieldError("passWord", "���벻��Ϊ�գ�");
			}
			System.out.println("��֤����������");
		}
		
		public String login() throws Exception {
			// �����û����������,���еķ�װ
			String result = "";
			if("jbit".equals(this.getUserName()) && "jbit".equals(this.getPassWord())){
				this.setMessage("��¼�ɹ���");
				// �������,���ص���������߼���
				Map<String,Object> session = null;
				session = ActionContext.getContext().getSession();
				
				if(session.containsKey("CURRENT_USER")){
					session.remove("CURENT_USER");
				}
				session.put("CURRENT_USER", userName);
				result = SUCCESS;
			}else{
				this.setMessage("��¼ʧ�ܣ�");
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
