package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test2.xml");
		
		Test2Infor infor = (Test2Infor) ctx.getBean("infor");
		
		System.out.println("생성자 통한 값 주입");
		System.out.println("driver : "+infor.getDriver());
		System.out.println("url : "+infor.getUrl());
		System.out.println("user : "+infor.getUser());
		System.out.println("password : "+infor.getPassword());
	}
}
