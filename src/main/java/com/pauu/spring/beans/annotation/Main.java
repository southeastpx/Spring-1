package com.pauu.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pauu.spring.beans.annotation.controller.UserController;
import com.pauu.spring.beans.annotation.dao.UserDao;
import com.pauu.spring.beans.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
//		TestObject testObject = (TestObject) ctx.getBean("testObject");
//		System.out.println(testObject);
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
//		UserDao userDao = (UserDao) ctx.getBean("userDao");
//		System.out.println(userDao);
	}
}
