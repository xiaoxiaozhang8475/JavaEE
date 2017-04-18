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
	
	
	//@Resource����
	private void springDIByAOR(){
		//����applicationContext.xml����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ�����е�UserBizImplʵ��
		UserBiz userBizByAOR =(UserBiz)context.getBean("userBizByAOR");	//���÷���
		boolean flag=userBizByAOR.login("admin", "123456");
		if(flag){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
	}
}
