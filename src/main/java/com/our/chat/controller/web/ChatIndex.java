package com.our.chat.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ChatIndex {

	/**
	 * 聊天首页访问地址
	 * @return
	 */
	@GetMapping("/chat")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		log.info("ChatIndex index is start");
		log.info("ChatIndex index is end");
		return "index";
	}
	
	@GetMapping("/chatDemo")
	public String chatDemo(HttpServletRequest request, HttpServletResponse response) {
		log.info("ChatIndex index is start");
		log.info("ChatIndex index is end");
		return "chat";
	}
}
