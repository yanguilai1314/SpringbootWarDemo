package com.mayiedu.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayiedu.service.UserService;

@RestController
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/insertUser")
	public int insertUser(String name,int age) {
		return userService.insertUser(name, age);
	}
	
}
