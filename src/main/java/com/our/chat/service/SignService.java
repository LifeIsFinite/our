package com.our.chat.service;

import com.our.chat.domain.UserBaseInfo;

/**
 * 用户[注册,登录,注销]服务接口
 * @author lvjie
 *
 */
public interface SignService {

	/**
	 * 用户注册
	 * @param account 帐号
	 * @param password 密码
	 * @return false为注册失败
	 */
	public boolean register(String account, String password);

	/**
	 * 用户登录
	 * @param account 帐号
	 * @param password 密码
	 * @return 用户基础信息,null为登录失败
	 */
	public UserBaseInfo login(String account, String password);
	
	/**
	 * 用户注销
	 * @param account 帐号
	 * @return false为注销失败
	 */
	public boolean exit(String account);
}
