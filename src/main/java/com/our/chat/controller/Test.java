package com.our.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Test {

	@GetMapping("/chat")
	public String test() {
		log.info("this is test api");
		return "index";
	}
	
	@GetMapping("/login/a")
	public String login() {
		log.info("this is login api");
		return "Hello World";
	}
}
