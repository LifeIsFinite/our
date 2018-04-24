package com.our.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Test {

	@GetMapping("/test")
	public String test() {
		log.info("this is test api");
		return "Hello World";
	}
	
	@GetMapping("/login/a")
	public String login() {
		log.info("this is login api");
		return "Hello World";
	}
}
