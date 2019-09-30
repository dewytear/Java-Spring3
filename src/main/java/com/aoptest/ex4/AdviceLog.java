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
	//ProceedingJointPoint 객체는 원래 실행되어야 할 대상 메소드(핵심기능)
	public Object profile(ProceedingJoinPoint jointPoint) throws Throwable{
		String signStr = jointPoint.getSignature().toShortString();	//핵심기능의 메소드명

		System.out.println(signStr + " is start!!");
		long startTime = System.currentTimeMillis();	//현재시간을 얻어옴

		try {
			Object obj = jointPoint.proceed();	//핵심기능을 실행
			return obj;
		}finally {
			long endTime = System.currentTimeMillis();	//현재종료시간을 얻어옴
			System.out.println(signStr + " is finished!!");
			System.out.println(signStr + " 경과시간: " + (endTime - startTime));
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
