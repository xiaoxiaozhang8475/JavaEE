package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加载applicationContext.xml配置
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取配置中的实例
		HelloWorld hw =(HelloWorld)context.getBean("hw");
		//调用方法
		hw.show();
	}

}
