package com.our.chat.common.result;

import lombok.Getter;
import lombok.Setter;

/**
 * Api异常类
 * @author lvjie
 *
 */
@Getter
@Setter
public class ApiException extends Exception {
	
	private Integer errcode;
	
	private String errmsg;

	/**
	 * 
	 */
	private static final long serialVersionUID = 566162959167577767L;
	
	public ApiException(EnumResult enumResult) {
		super();
		this.errcode = enumResult.getErrcode();
		this.errmsg = enumResult.getErrmsg();
	}
	
	public ApiException(Integer errcode, String errmsg) {
		super();
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
}
