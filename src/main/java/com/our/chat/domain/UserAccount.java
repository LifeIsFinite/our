package com.our.chat.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户帐号表
 * @author lvjie
 *
 */
@Getter
@Setter
@ToString
public class UserAccount {
	
	/** 自增索引ID */
	private Long id;
	
	/** 自增索引ID */
	private Long userId;
	
	/** 用户登录帐号 */
	private String account;

	/** 用户登录密码 */
	private String password;
	
	/** 
	 * 帐号所属平台
	 * ME: 本地用户
	 * WX: 微信用户
	 * QQ: QQ用户
	 * TB: 淘宝用户
	 * ZFB: 支付宝用户
	 * WB: 微博用户
	 * WY: 网易用户
	 * JD: 京东用户
	 * SN: 苏宁用户
	 * GH: GitHub用户
	 */
	private String platForm;
}
