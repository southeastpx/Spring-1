package com.pauu.spring.beans.spel;

public class Person {
	private String name;
	private String city;
	private Car car;
	private String info;
	
	public Person() {
		super();
	}

	public Person(String name, String city, Car car, String info) {
		super();
		this.name = name;
		this.city = city;
		this.car = car;
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", car=" + car + ", info=" + info + "]";
	}
	
}
