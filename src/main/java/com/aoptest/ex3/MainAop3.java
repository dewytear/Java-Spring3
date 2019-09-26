package com.aoptest.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:aoptestEx3.xml");

		Student student = ctx.getBean("student", Student.class);
		student.getInfo();	//getInfo()가 JointPoint가 된다

		Staff staff = ctx.getBean("staff", Staff.class);
		staff.getInfo();

		ctx.close();
	}

}
