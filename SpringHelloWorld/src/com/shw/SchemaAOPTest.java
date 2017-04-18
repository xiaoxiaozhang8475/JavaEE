package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class SchemaAOPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("aop.xml");
		//��ȡ�����е�UserBizImplʵ��
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);
	}

}
