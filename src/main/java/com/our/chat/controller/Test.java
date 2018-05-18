package com.our.chat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.our.chat.common.result.ApiResult;
import com.our.chat.common.result.ApiResultFactory;
import com.our.chat.common.result.EnumResult;
import com.our.chat.dao.UserDao;
import com.our.chat.domain.UserAccount;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Test {
	
	@Autowired
	private UserDao userDao;

	@GetMapping("/login/a")
	public ApiResult login(UserAccount user, HttpServletRequest request, HttpServletResponse response) {
		log.info("this is login api");
		user = userDao.findByAccoundAndPassword(user);
		return ApiResultFactory.result(EnumResult.SIGN_SUCCESS, user);
	}
}
