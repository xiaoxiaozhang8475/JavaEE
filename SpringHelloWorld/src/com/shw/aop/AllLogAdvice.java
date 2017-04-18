package com.shw.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AllLogAdvice {
	private Logger logger=Logger.getLogger(AllLogAdvice.class);
	//�˷�������Ϊǰ��֪ͨ
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
	
	//�˷�������Ϊ����֪ͨ
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
	
	//�˷�������Ϊ�쳣֪ͨ
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
	
	//�˷�������Ϊ����֪ͨ
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
