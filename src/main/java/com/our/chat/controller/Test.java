package com.our.chat.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
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
	
//	@Autowired
//	private UserAccountRepository userAccountRepository;

	@GetMapping("/login/a")
	public ApiResult login(UserAccount user, HttpServletRequest request, HttpServletResponse response) {
		log.info("this is login api");
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
					throws IOException, JsonProcessingException {
				jsonGenerator.writeString("");
			}
		});
		try {
			log.info(mapper.writeValueAsString(user));
			String json = "{\"id\":null,\"account\":\"lvjie\",\"password\":\"chat.our.com\",\"platForm\":null}";
			log.info(mapper.readValue(json, UserAccount.class).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user = userDao.findByAccoundAndPassword(user);
		
//		user = userAccountRepository.findByAccountAndPassword(user);
		return ApiResultFactory.result(EnumResult.SIGN_SUCCESS, user);
	}
}
