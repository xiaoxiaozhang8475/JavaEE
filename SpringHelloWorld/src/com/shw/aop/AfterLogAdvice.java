package com.shw.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLogAdvice implements AfterReturningAdvice {

	private Logger logger=Logger.getLogger(AfterLogAdvice.class);
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {		
		//��ȡ�����õ�����
		String targetClassName=target.getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=method.getName();
		//��־��ʽ�ַ���
		String logInfoText="����֪ͨ��"+targetClassName+"���"+targetMethodName+"�����Ѿ�ִ��";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
	}

}
