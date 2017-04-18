package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ�����е�ʵ��
		HelloWorld hw1 =(HelloWorld)context.getBean("hw");
		HelloWorld hw2 =(HelloWorld)context.getBean("hw");
		System.out.println(hw1==hw2);  
	}

}
