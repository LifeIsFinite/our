package com.our.chat.controller.web;

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
	public String index() {
		log.info("ChatIndex index is start");
		log.info("ChatIndex index is end");
		return "index";
	}
}
