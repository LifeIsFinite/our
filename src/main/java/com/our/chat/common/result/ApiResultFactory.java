package com.our.chat.common.result;

/**
 * api接口请求结果工厂类
 * @author lvjie
 *
 */
public class ApiResultFactory {
	
	/** 静态api结果对象 */
	private static ApiResult apiResult = new ApiResult();

	/**
	 * 返回无data结果
	 * @param enumResult api常有返回数据枚举类
	 * @return
	 */
	public static ApiResult result(EnumResult enumResult) {
		apiResult.setErrcode(enumResult.getErrcode());
		apiResult.setErrmsg(enumResult.getErrmsg());
		apiResult.setData(null);
		return apiResult;
	}
	
	/**
	 * 返回无data结果的自定义结果
	 * @param errcode 错误代码
	 * @param msg 错误信息
	 * @return
	 */
	public static ApiResult result(Integer errcode, String msg) {
		apiResult.setErrcode(errcode);
		apiResult.setErrmsg(msg);
		apiResult.setData(null);
		return apiResult;
	}
	
	/**
	 * 返回有data结果
	 * @param enumResult api常有返回数据枚举类
	 * @param data 返回到前端的数据集
	 * @return
	 */
	public static ApiResult result(EnumResult enumResult, Object data) {
		apiResult.setErrcode(enumResult.getErrcode());
		apiResult.setErrmsg(enumResult.getErrmsg());
		apiResult.setData(data);
		return apiResult;
	}
	
	/**
	 * 返回有data结果的自定义结果
	 * @param errcode 错误代码
	 * @param msg 错误信息
	 * @param data 返回到前端的数据集
	 * @return
	 */
	public static ApiResult result(Integer errcode, String msg, Object data) {
		apiResult.setErrcode(errcode);
		apiResult.setErrmsg(msg);
		apiResult.setData(data);
		return apiResult;
	}
}
