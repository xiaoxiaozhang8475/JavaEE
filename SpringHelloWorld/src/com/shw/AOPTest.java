package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class AOPTest {
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ�����е�UserBizImplʵ��
		UserBiz userBiz =(UserBiz)context.getBean("ub");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);
	}
}
