package com.ajax_jquery.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.ajax_jquery.domain.User;
import com.ajax_jquery.utils.DataSourceUtils;
/**
 * User的dao
 * @author Peter
 *
 */
public class UserDao {

	/**
	 * 用原生Ajax检查用户名是否重复
	 * @param username
	 * @return
	 * @throws SQLException
	 */
	public User checkUsername4Ajax(String username) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username = ? limit 1";
		return qr.query(sql, new BeanHandler<>(User.class), username);
	}

}
