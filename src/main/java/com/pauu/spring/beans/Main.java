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
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);
		//3.调用hello方法
		//helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
}
