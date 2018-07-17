package com.mayiedu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	@Insert("insert into tb_user(name,age) values(#{name},#{age})")
	//int insertUser(String name,Integer age);  
	int insertUser(@Param("name") String name,@Param("age") Integer age); //必须要使用@Param这个注解，即使名字相同
	
	
	
}
