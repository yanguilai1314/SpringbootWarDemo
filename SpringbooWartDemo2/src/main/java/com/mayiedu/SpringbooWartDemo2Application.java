package com.mayiedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.mayiedu"})  //扫同级包及其子包
public class SpringbooWartDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooWartDemo2Application.class, args);
	}
}
