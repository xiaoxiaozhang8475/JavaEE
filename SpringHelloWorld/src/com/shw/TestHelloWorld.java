package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ�����е�ʵ��
		HelloWorld hw =(HelloWorld)context.getBean("hw");
		//���÷���
		hw.show();
	}

}
