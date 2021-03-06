package com.pauu.spring.beans.collections;

import java.util.List;

import com.pauu.spring.beans.Car;

public class Person {
	private String name;
	private Integer age;
	private List<Car> cars;
	
	public Person() {
		super();
	}

	public Person(String name, Integer age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}
