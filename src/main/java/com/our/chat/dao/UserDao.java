package com.our.chat.dao;

import com.our.chat.domain.UserAccount;

public interface UserDao {

	public UserAccount findByAccoundAndPassword(UserAccount user);
}
