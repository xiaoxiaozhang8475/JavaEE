package com.shw.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//日志切面
@Aspect
public class AllLogAdviceByAnnotation {
	private Logger logger=Logger.getLogger(AllLogAdviceByAnnotation.class);
	/**
	 *  使用@Pointcut注解定义一个切入点，切入点的名字为allMethod(),
	 *  切入点的正则表达式execution(* com.shw.biz.UserBiz.*(..))
	 *  含义是对com.shw.biz.UserBiz中的所有方法，都进行拦截
	 **/
	@Pointcut("execution(* com.shw.biz.UserBiz.*(..))")
	//定义切入点名字
	private void allMethod(){}
	//定义前置通知
	@Before("allMethod()")
	public void myBeforeAdvice(JoinPoint jionpoint){
		//获取被调用的类名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//获取被调用的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字符串		
		String logInfoText="前置通知："+targetClassName+"类的"+targetMethodName+"方法开始执行";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);
	}
	
	
	//定义后置通知
	@AfterReturning("allMethod()")
	public void myAfterReturnAdvice(JoinPoint jionpoint){
		//获取被调用的类名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//获取被调用的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字符串
		String logInfoText="后置通知："+targetClassName+"类的"+targetMethodName+"方法开始执行";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);
	}
	
	
	//定义异常通知
	@AfterThrowing(pointcut="allMethod()",throwing="e")
	public void myThrowingAdvice(JoinPoint jionpoint,Exception e){
		//获取被调用的类名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//获取被调用的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字符串
		String logInfoText="异常通知：执行"+targetClassName+"类的"+targetMethodName+"方法时发生异常";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);
	}
	
	
	//定义环绕通知
	@Around("allMethod()")
	public void myAroundAdvice(ProceedingJoinPoint jionpoint) throws Throwable{
		long beginTime=System.currentTimeMillis();
		jionpoint.proceed();		
		long endTime=System.currentTimeMillis();
		//获取被调用的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字符串
		String logInfoText="环绕通知："+targetMethodName+"方法调用前时间"+beginTime+"毫秒,"+
		"调用后时间"+endTime+"毫秒";
		//将日志信息写入配置的文件中
		logger.info(logInfoText);
	}
	
}
