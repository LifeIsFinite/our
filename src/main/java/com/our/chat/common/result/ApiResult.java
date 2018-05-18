package com.our.chat.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * api接口请求结果返回类
 * @author lvjie
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult {

	/** 错误代码 */
	private Integer errcode;
	
	/** 错误信息 */
	private String errmsg;
	
	/** 携带的数据 */
	private Object data;

	/** 无data构造器 */
	public ApiResult(Integer errcode, String errmsg) {
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
}
