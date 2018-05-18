package com.our.chat.common.result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * api异常全局处理类 (json controller)
 * @author lvjie
 *
 */
@RestControllerAdvice
public class ApiExceptionHandler {

	/**
	 * 拦截处理ApiException
	 * @param request
	 * @param response
	 * @param apie
	 * @return api结果集
	 */
	@ExceptionHandler(ApiException.class)
	public ApiResult apiExceptionHandler(HttpServletRequest request, HttpServletResponse response, ApiException apie) {
		return ApiResultFactory.result(apie.getErrcode(), apie.getErrmsg());
	}
}
