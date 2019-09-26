package com.aoptest.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/aoptestEx2.xml");

		Service service = (Service)ctx.getBean("service");

		service.delBoard();
		service.addBoard();
		service.getBoard();
	}
}
