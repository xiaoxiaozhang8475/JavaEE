package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class TestSpringDIByAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestSpringDIByAnnotation().springDIByAOR();
	}
	
	
	//@Resource测试
	private void springDIByAOR(){
		//加载applicationContext.xml配置
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取配置中的UserBizImpl实例
		UserBiz userBizByAOR =(UserBiz)context.getBean("userBizByAOR");	//调用方法
		boolean flag=userBizByAOR.login("admin", "123456");
		if(flag){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
}
