package com.mayiedu.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mayiedu.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Resource
	private UserMapper userMapper;
	
	public int insertUser(String name,Integer age) {
		int insertResult = userMapper.insertUser(name, age);
		log.info("####insertResult:{}"+insertResult);
		return insertResult;
	}
}
