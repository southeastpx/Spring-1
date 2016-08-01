package com.pauu.spring.beans.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pauu.spring.beans.annotation.TestObject;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired(required=false)
	private TestObject testObject;
	public void save() {
		System.out.println("UserDao save()...");
		System.out.println(testObject);
	}

}
