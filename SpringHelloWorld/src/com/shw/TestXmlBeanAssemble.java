package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlBeanAssemble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����xmlBeanAssemble.xml���ã���ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("xmlBeanAssemble.xml");
		//��Bean���������л�ȡ��Ϊ"xba"��XmlBeanAssembleʵ��
		XmlBeanAssemble xba =(XmlBeanAssemble)context.getBean("xba");
		//���÷���show
		xba.show();
		//�ֹ��ر�Spring����
		((ClassPathXmlApplicationContext)context).destroy();

	}

}
