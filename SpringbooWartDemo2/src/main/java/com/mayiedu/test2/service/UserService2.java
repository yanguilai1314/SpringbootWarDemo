package com.mayiedu.test2.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mayiedu.test2.mapper.UserMapper2;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService2 {
	@Resource
	private UserMapper2 userMapper2;
	
	public int insertUser(String name,Integer age) {
		int insertResult = userMapper2.insertUser(name, age);
		log.info("####insertResult:{}"+insertResult);
		return insertResult;
	}
}
