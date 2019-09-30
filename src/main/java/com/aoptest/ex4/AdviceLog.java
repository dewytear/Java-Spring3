package com.aoptest.ex4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AdviceLog {

//	@Pointcut("within(com.aoptest.ex4.*)")
//	@Pointcut("execution(* com.aoptest.ex4.*.*())")
	@Pointcut("bean(student)")
	private void pointCutMethod() {}

	@Around("pointCutMethod()")
	//ProceedingJointPoint ��ü�� ���� ����Ǿ�� �� ��� �޼ҵ�(�ٽɱ��)
	public Object profile(ProceedingJoinPoint jointPoint) throws Throwable{
		String signStr = jointPoint.getSignature().toShortString();	//�ٽɱ���� �޼ҵ��

		System.out.println(signStr + " is start!!");
		long startTime = System.currentTimeMillis();	//����ð��� ����

		try {
			Object obj = jointPoint.proceed();	//�ٽɱ���� ����
			return obj;
		}finally {
			long endTime = System.currentTimeMillis();	//��������ð��� ����
			System.out.println(signStr + " is finished!!");
			System.out.println(signStr + " ����ð�: " + (endTime - startTime));
		}
	}

//	@Before("within(com.aoptest.ex4.*)")
	@Before("pointCutMethod()")
	public void beforeAdvice(JoinPoint JoinPoint) {
		System.out.println("beforeAdvice().....");
	}

//	public void afterReturningAdvice() {
//		System.out.println("afterReturningAdvice().....");
//	}
//
//	public void afterThrowingAdvice() {
//		System.out.println("afterThrowingAdvice().....");
//	}
//
//	public void afterAdvice() {
//		System.out.println("afterAdvice().....");
//	}
}
