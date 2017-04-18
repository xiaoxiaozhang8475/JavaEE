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
		//获取被调用的方法名
		String targetMethodName=invocation.getMethod().getName();
		//日志格式字符串
		String logInfoText="环绕通知："+targetMethodName+"方法调用前时间"+beginTime+"毫秒,"+
		"调用后时间"+endTime+"毫秒";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);
		return null;		
	}

}
