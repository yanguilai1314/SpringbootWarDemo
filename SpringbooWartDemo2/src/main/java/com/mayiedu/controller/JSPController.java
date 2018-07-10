package com.mayiedu.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	private static final Logger logger = LoggerFactory.getLogger(JSPController.class);
	@RequestMapping("/jspIndex")
	public String jspIndex() {
		//logger.info("集成log4j成功了");
		return "index";
	}
}
