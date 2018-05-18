package com.our.chat.config.interceptor;

import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.our.chat.common.constant.Constant;
import com.our.chat.common.result.ApiResult;
import com.our.chat.common.result.ApiResultFactory;
import com.our.chat.common.result.EnumResult;
import com.our.chat.service.SignService;

import lombok.extern.slf4j.Slf4j;

/**
 * MVC拦截器
 * @author lvjie
 *
 */
@Slf4j
public class InterceptorConfig implements HandlerInterceptor {
	
	/** 用户帐号注册、登录、注销接口 */
	@Autowired
	private SignService signService;

	/**
	 * 处理被拦截的请求
	 * 	执行controller之前
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.info("InterceptorConfig preHandle is start");
		// 获取token信息
		String token = request.getParameter("token");
		// 判断token是否存在
		if(StringUtils.isBlank(token)) {
			// 此处token为空
			// 获取uri
			String _uri = request.getRequestURI();
			// 判断是那种类型的api
			if(_uri.equals(Constant.SEND_MESSAGE)) {
				// 此处为发送信息的api
				// 获取文本信息
				String _msg = request.getParameter("msg");
				// 验证文本是否为登录请求文本
				if(Pattern.matches(Constant.VALI_LOGIN, _msg)) {
					// 此处为登录请求文本
					// 根据空格分割字符串(分割后应为3段:0-登录标识,1-帐号,2-密码)
					String[] _str = _msg.split(" ");
					if(_str.length == 3) {
					}
				}
			}
			// 返回未登录提示信息
			resBackJson(ApiResultFactory.result(EnumResult.SIGN_OUT), request, response);
		}
		log.info("InterceptorConfig preHandle is false");
		return false;
	}
	
	/**
	 * 使用response返回JSON数据
	 * @param request
	 * @param response
	 */
	private void resBackJson(ApiResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("InterceptorConfig resBackJson is start");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null ;
	    out = response.getWriter();
	    out.append(result.toString());
	    log.info("InterceptorConfig resBackJson is end");
	}
}
