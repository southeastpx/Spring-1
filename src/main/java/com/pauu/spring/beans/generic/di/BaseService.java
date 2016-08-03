package com.pauu.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	@Autowired
	protected BaseDao<T> baseDao;
	public void add(){
		System.out.println("add()...");
		System.out.println(baseDao);
	}
}
