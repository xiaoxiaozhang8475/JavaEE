package com.shw.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;

public class LogAdvice implements MethodBeforeAdvice {
	//��ȡ��־��¼��Logger
	private Logger logger=Logger.getLogger(LogAdvice.class);
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//��ȡ�����õ�����
		String targetClassName=target.getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=method.getName();
		//��־��ʽ�ַ���
		String logInfoText="ǰ��֪ͨ��"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);		
	}

}
