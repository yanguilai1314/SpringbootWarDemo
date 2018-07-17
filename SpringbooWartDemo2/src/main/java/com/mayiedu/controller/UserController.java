package com.mayiedu.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mayiedu.test1.service.UserService1;
import com.mayiedu.test2.service.UserService2;

@RestController
public class UserController {
	/*@Resource
	private UserService userService;
	@RequestMapping("/insertUser")
	public int insertUser(String name,int age) {
		return userService.insertUser(name, age);
	}*/
	
	@Resource
	private UserService1 userService1;
	@Resource
	private UserService2 userService2;
	
	@RequestMapping("/insertUser1")
	public int insertUser1(String name,int age) {
		return userService1.insertUser(name, age);
	}
	
	@RequestMapping("/insertUser2")
	public int insertUser2(String name,int age) {
		return userService2.insertUser(name, age);
	}
	
}
