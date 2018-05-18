package com.our.chat.service.impl;

import org.springframework.stereotype.Service;

import com.our.chat.domain.UserBaseInfo;
import com.our.chat.service.SignService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SignServiceImpl implements SignService {

	@Override
	public boolean register(String account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserBaseInfo login(String account, String password) {
		log.info("SignServiceImpl login is start");
		// TODO Auto-generated method stub
		log.info("SignServiceImpl login is end");
		return null;
	}

	@Override
	public boolean exit(String account) {
		// TODO Auto-generated method stub
		return false;
	}

}
