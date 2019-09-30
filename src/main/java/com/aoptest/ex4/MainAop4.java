package com.aoptest.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:aoptestEx4.xml");

		Student student = ctx.getBean("student", Student.class);
		student.getInfo();	//getInfo()�� JointPoint�� �ȴ�

		Staff staff = ctx.getBean("staff", Staff.class);
		staff.getInfo();

		ctx.close();
	}

}
