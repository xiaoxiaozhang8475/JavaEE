package com.shw.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;

public class LogAdvice implements MethodBeforeAdvice {
	//获取日志记录器Logger
	private Logger logger=Logger.getLogger(LogAdvice.class);
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//获取被调用的类名
		String targetClassName=target.getClass().getName();
		//获取被调用的方法名
		String targetMethodName=method.getName();
		//日志格式字符串
		String logInfoText="前置通知："+targetClassName+"类的"+targetMethodName+"方法开始执行";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);		
	}

}
