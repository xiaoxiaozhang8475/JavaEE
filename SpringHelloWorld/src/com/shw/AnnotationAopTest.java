package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class AnnotationAopTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加载applicationContext.xml配置
		ApplicationContext context=new ClassPathXmlApplicationContext("annotationAop.xml");
		//获取配置中的UserBizImpl实例
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);

	}
}
