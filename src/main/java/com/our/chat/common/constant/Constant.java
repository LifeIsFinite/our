package com.our.chat.common.constant;

/**
 * 常量类
 * @author lvjie
 *
 */
public class Constant {

	// ---------------- API接口地址
	/** 发送文本信息的API地址 */
	public static final String SEND_MESSAGE = "/chat/sendMsg.do";
	
	// ---------------- 用户帐号常量
	/** 用户帐号状态 - 正常 */
	public static final Integer USER_STATUS_NORMAL = 0;
	/** 用户帐号状态 - 警告 */
	public static final Integer USER_STATUS_WARN = 1;
	/** 用户帐号状态 - 禁言 */
	public static final Integer USER_STATUS_NO_SEND = 2;
	/** 用户帐号状态 - 禁用 */
	public static final Integer USER_STATUS_BANNED = 3;
	
	/** 用户性别 - 女 */
	public static final Integer USER_GENDER_FEMALE = 0;
	/** 用户性别 - 男 */
	public static final Integer USER_GENDER_MALE = 1;
	
	/** 用户在线状态 - 离线 */
	public static final Integer USER_OUTLINE = 0;
	/** 用户在线状态 - 在线 */
	public static final Integer USER_ONLINE = 1;

	/** 用户是否删除 - 是 */
	public static final Integer USER_ISDELETE_TRUE = 1;
	/** 用户是否删除 - 否 */
	public static final Integer USER_ISDELETE_FALSE = 0;
	
	/** 用户帐号所属平台 - 微信用户 */
	public static final String USER_FROM_WX = "WX";
	/** 用户帐号所属平台 - QQ用户 */
	public static final String USER_FROM_QQ = "QQ";
	/** 用户帐号所属平台 - 淘宝用户 */
	public static final String USER_FROM_TB = "TB";
	/** 用户帐号所属平台 - 支付宝用户 */
	public static final String USER_FROM_ZFB = "ZFB";
	/** 用户帐号所属平台 - 微博用户 */
	public static final String USER_FROM_WB = "WB";
	/** 用户帐号所属平台 - 网易用户 */
	public static final String USER_FROM_WY = "WY";
	/** 用户帐号所属平台 - 京东用户 */
	public static final String USER_FROM_JD = "JD";
	/** 用户帐号所属平台 - 苏宁用户 */
	public static final String USER_FROM_SN = "SN";
	/** 用户帐号所属平台 - GitHub用户 */
	public static final String USER_FROM_GH = "GH";
	/** 用户帐号所属平台 - 本地用户 */
	public static final String USER_FROM_ME = "ME";
	
	// ---------------- 正则表达式
	/** 用于验证登录请求 */
	public static final String VALI_LOGIN = "^\\$login:\\s[A-Za-z0-9~!@#$%^&*_?]+\\s[A-Za-z0-9~!@#$%^&*_?]+$";
}
