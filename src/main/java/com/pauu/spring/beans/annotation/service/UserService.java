package com.pauu.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pauu.spring.beans.annotation.dao.UserDao;

@Service
public class UserService {
	private UserDao userDao;
	@Autowired
	@Qualifier("userJdbcDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		System.out.println("UserService add()...");
		userDao.save();
	}
}
