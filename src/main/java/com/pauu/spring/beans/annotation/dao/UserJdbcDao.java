package com.pauu.spring.beans.annotation.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcDao implements UserDao {
	
	public void save() {
		System.out.println("UserJdbcDao save()...");
	}

}
