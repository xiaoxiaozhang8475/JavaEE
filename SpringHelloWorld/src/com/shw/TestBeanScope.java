package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加载applicationContext.xml配置
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取配置中的实例
		HelloWorld hw1 =(HelloWorld)context.getBean("hw");
		HelloWorld hw2 =(HelloWorld)context.getBean("hw");
		System.out.println(hw1==hw2);  
	}

}
