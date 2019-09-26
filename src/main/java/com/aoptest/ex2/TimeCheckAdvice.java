package com.aoptest.ex2;

import org.aspectj.lang.ProceedingJoinPoint;

//���޼ҵ带 ������ �� �ִ� ����� ���� ProceedingJoinPoint�� ���� �޴´�.
public class TimeCheckAdvice {
	public Object check(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("method start.....");

		//proceed()�� ȣ������ ������ ����Ͻ� ������ ���� �� �� ����.
		Object returnValue = joinPoint.proceed();

		System.out.println("method end.....");

		//���޼ҵ��� ������ ����� ��ȯ ���� ��ȯ �ؾ� �Ѵ�.
		return returnValue;
	}
}
