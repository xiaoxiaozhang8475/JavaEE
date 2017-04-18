package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class AOPTest {
	public static void main(String[] args) {
		//加载applicationContext.xml配置
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取配置中的UserBizImpl实例
		UserBiz userBiz =(UserBiz)context.getBean("ub");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);
	}
}
