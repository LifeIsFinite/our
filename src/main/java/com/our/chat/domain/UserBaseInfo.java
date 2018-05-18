package com.our.chat.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户基础信息表
 * @author lvjie
 *
 */
@Getter
@Setter
@ToString
public class UserBaseInfo {

	/** 用户唯一索引ID */
	private Long user_id;
	
	/** 
	 * 用户帐号状态
	 * 0: 正常
	 * 1: 警告
	 * 2: 禁言
	 * 3: 禁用
	 */
	private Integer status;

	/**
	 * 是否删除
	 * 0: 否
	 * 1: 是
	 */
	private Integer isDelete;

	/** 用户昵称 */
	private String nickName;

	/** 用户级别 */
	private String level;

	/** 用户手机号码 */
	private String phoneNumber;

	/** 用户邮箱 */
	private String email;

	/**
	 * 用户性别
	 * 0: 女
	 * 1: 男
	 */
	private Integer gender;
	
	/**
	 * 用户在线状态
	 * 0: 离线
	 * 1: 在线
	 */
	private Integer lineStatus;

	/** 用户头像地址 */
	private String headUrl;

	/** 用户出生日期 */
	private String birthDay;
	
	/** 用户在线时长 */
	private Long onlineTime;

	/** 用户注册时间 */
	private Timestamp registerTime;
}
