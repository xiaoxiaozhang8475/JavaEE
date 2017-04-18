package com.shw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shw.biz.UserBiz;

public class TestSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ�����е�UserBizImplʵ��
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");	//���÷���
		boolean flag=userBiz.login("admin", "123456");
		if(flag){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
	}
}
