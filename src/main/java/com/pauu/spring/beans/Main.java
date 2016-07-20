package com.pauu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*//创建HelloWorld对象
		HelloWorld helloWorld = new HelloWorld();
		//为name属性赋值
		helloWorld.setName("atguigu");*/
		
		//1.创建spring的IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取bean实例
		//HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
		//3.调用hello方法
		//helloWorld.hello();
	}
}
