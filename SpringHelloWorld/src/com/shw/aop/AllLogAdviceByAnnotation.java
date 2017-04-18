package com.shw.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//��־����
@Aspect
public class AllLogAdviceByAnnotation {
	private Logger logger=Logger.getLogger(AllLogAdviceByAnnotation.class);
	/**
	 *  ʹ��@Pointcutע�ⶨ��һ������㣬����������ΪallMethod(),
	 *  ������������ʽexecution(* com.shw.biz.UserBiz.*(..))
	 *  �����Ƕ�com.shw.biz.UserBiz�е����з���������������
	 **/
	@Pointcut("execution(* com.shw.biz.UserBiz.*(..))")
	//�������������
	private void allMethod(){}
	//����ǰ��֪ͨ
	@Before("allMethod()")
	public void myBeforeAdvice(JoinPoint jionpoint){
		//��ȡ�����õ�����
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=jionpoint.getSignature().getName();
		//��־��ʽ�ַ���		
		String logInfoText="ǰ��֪ͨ��"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
	}
	
	
	//�������֪ͨ
	@AfterReturning("allMethod()")
	public void myAfterReturnAdvice(JoinPoint jionpoint){
		//��ȡ�����õ�����
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=jionpoint.getSignature().getName();
		//��־��ʽ�ַ���
		String logInfoText="����֪ͨ��"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
	}
	
	
	//�����쳣֪ͨ
	@AfterThrowing(pointcut="allMethod()",throwing="e")
	public void myThrowingAdvice(JoinPoint jionpoint,Exception e){
		//��ȡ�����õ�����
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//��ȡ�����õķ�����
		String targetMethodName=jionpoint.getSignature().getName();
		//��־��ʽ�ַ���
		String logInfoText="�쳣֪ͨ��ִ��"+targetClassName+"���"+targetMethodName+"����ʱ�����쳣";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
	}
	
	
	//���廷��֪ͨ
	@Around("allMethod()")
	public void myAroundAdvice(ProceedingJoinPoint jionpoint) throws Throwable{
		long beginTime=System.currentTimeMillis();
		jionpoint.proceed();		
		long endTime=System.currentTimeMillis();
		//��ȡ�����õķ�����
		String targetMethodName=jionpoint.getSignature().getName();
		//��־��ʽ�ַ���
		String logInfoText="����֪ͨ��"+targetMethodName+"��������ǰʱ��"+beginTime+"����,"+
		"���ú�ʱ��"+endTime+"����";
		//����־��Ϣд�����õ��ļ���
		logger.info(logInfoText);
	}
	
}
