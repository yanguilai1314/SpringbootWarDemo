package com.mayiedu.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
	@RequestMapping("/getUsr")
	public String getUsr(int i,Map<String,Integer> map) {
		int j = 1/i;
		//map.put("u", j);
		return "index";
	}
}
