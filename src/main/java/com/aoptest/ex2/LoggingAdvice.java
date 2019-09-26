package com.aoptest.ex2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {
	// ��� ����Ͻ� ����  �޼ҵ尡 ������ ������ ����
	// Spring���� ���� method, target, �Ű��������� ������ ���� JoinPoint ��ü�� ���� �޴´�.
	// ��, �Ű������� ���� �س����� ������ ����� �� �ִ�.
	public void logging(JoinPoint joinPoint){
		Signature method = joinPoint.getSignature();
		
		String methodName = method.getName();
		System.out.println("methodName : "+methodName);
	}
}
