package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class AnnotationAopTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("annotationAop.xml");
		//��ȡ�����е�UserBizImplʵ��
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);

	}
}
