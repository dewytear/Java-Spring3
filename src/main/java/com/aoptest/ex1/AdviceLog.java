package com.aoptest.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog {

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
}
