package com.shw.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class ThrowsLogAdvice implements ThrowsAdvice {
	private Logger logger=Logger.getLogger(ThrowsLogAdvice.class);
    public void afterThrowing(Method method, Object[] args, Object target, Throwable exeptionClass){
    	//��ȡ�����õ�����
		String targetClassName=target.getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=method.getName();
		//��־��ʽ�ַ���
		String logInfoText="�쳣֪ͨ��ִ��"+targetClassName+"���"+targetMethodName+"����ʱ�����쳣";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
    }

}
