package com.mayiedu.test1.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mayiedu.test1.mapper.UserMapper1;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService1 {
	@Resource
	private UserMapper1 userMapper1;
	
	public int insertUser(String name,Integer age) {
		int insertResult = userMapper1.insertUser(name, age);
		log.info("####insertResult:{}"+insertResult);
		return insertResult;
	}
}
