package com.pauu.spring.beans.collections;

import java.util.Map;

import com.pauu.spring.beans.Car;

public class NewPerson {
	private String name;
	private Integer age;
	private Map<String,Car> cars;
	public NewPerson() {
		super();
	}
	public NewPerson(String name, Integer age, Map<String, Car> cars) {
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
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
