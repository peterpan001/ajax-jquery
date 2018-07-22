package com.ajax_jquery.service;

import java.sql.SQLException;

import com.ajax_jquery.dao.UserDao;
import com.ajax_jquery.domain.User;
/**
 * User的Service
 * @author Peter
 *
 */
public class UserService {

	/**
	 * 用原生Ajax检查用户名是否重复
	 * @param username
	 * @return
	 * @throws SQLException
	 */
	public User checkUsername4Ajax(String username) throws SQLException {
		return new UserDao().checkUsername4Ajax(username);
	}

}
