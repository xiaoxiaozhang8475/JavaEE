package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlBeanAssemble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加载xmlBeanAssemble.xml配置，初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("xmlBeanAssemble.xml");
		//从Bean工厂容器中获取名为"xba"的XmlBeanAssemble实例
		XmlBeanAssemble xba =(XmlBeanAssemble)context.getBean("xba");
		//调用方法show
		xba.show();
		//手工关闭Spring容器
		((ClassPathXmlApplicationContext)context).destroy();

	}

}
