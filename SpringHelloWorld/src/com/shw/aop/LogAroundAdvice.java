package com.shw.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class LogAroundAdvice implements MethodInterceptor {

	private Logger logger=Logger.getLogger(LogAroundAdvice.class);
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long beginTime=System.currentTimeMillis();
		invocation.proceed();
		long endTime=System.currentTimeMillis();
		//��ȡ�����õķ�����
		String targetMethodName=invocation.getMethod().getName();
		//��־��ʽ�ַ���
		String logInfoText="����֪ͨ��"+targetMethodName+"��������ǰʱ��"+beginTime+"����,"+
		"���ú�ʱ��"+endTime+"����";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
		return null;		
	}

}
