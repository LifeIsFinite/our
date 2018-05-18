package com.our.chat.controller.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.our.chat.common.result.ApiResult;
import com.our.chat.common.result.ApiResultFactory;
import com.our.chat.common.result.EnumResult;

import lombok.extern.slf4j.Slf4j;

/**
 * Chat Apis
 * @author lvjie
 *
 */
@Slf4j
@RestController("/chat")
public class Chat {

	/**
	 * 发送信息Api (仅支持文本信息)
	 * @param msg 要发送的文本
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/sendMsg.do")
	public ApiResult sendMsg(String msg, HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("Chat sendMsg is start");
		log.info(msg);
		log.info("Chat sendMsg is end");
		return ApiResultFactory.result(EnumResult.REQUEST_SUCCESS);
	}
}
