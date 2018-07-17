package com.mayiedu.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class User {
	private String name;
	private int age;
	
	
	public static void main(String[] args) {
		User user = new User();
		user.setName("meinv");
		user.setAge(20);
		log.info(user.toString());


	}
}
