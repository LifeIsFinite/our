package com.our.chat.common.result;

import lombok.Getter;
import lombok.Setter;

/**
 * api接口请求常用结果枚举类
 * @author lvjie
 *
 */
public enum EnumResult {

	/** 基础信息 */
	REQUEST_SUCCESS(0, "请求成功"),
	SIGN_OUT(1000, "未登录"),
	SIGN_SUCCESS(1001, "登录成功"),
	SIGN_FAILD(1002, "登录失败");
	
	/** 错误代码 */
	@Getter @Setter private Integer errcode;
	
	/** 错误信息 */
	@Getter @Setter private String errmsg;
	
	private EnumResult(Integer errcode, String errmsg) {
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
}
