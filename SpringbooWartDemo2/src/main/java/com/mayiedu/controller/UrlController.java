package com.mayiedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
	@Value("${url}")
	private String url;
	@RequestMapping("/getUrl")
	public String getUrl() {
		return url;
	}
	
}
