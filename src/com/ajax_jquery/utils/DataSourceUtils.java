package com.ajax_jquery.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {

	private static ComboPooledDataSource cpds = new ComboPooledDataSource("shangcheng");
	
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	/**
	 * 返回数据库资源
	 * @return
	 */
	public static DataSource getDataSource(){
		return cpds;
	}
	
	/**
	 * 返回数据库连接
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConn() throws SQLException{
		Connection conn = tl.get();
		if(conn == null){
			conn = cpds.getConnection();
			tl.set(conn);
		}
		return conn;
	}
	
	/**
	 * 释放资源
	 * @param conn
	 * @param st
	 * @param rs
	 */
	public static void closeResource(Connection conn, Statement st, ResultSet rs) {
		closeResource(st, rs);
		closeConn(conn);
	}
	
	/**
	 * 释放资源
	 * @param st
	 * @param rs
	 */
	public static void closeResource(Statement st, ResultSet rs) {
		closeResultSet(rs);
		closeStatement(st);
	}
	
	/**
	 * 释放连接资源
	 * @param conn
	 */
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				//和当前的线程解绑
				tl.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	/**
	 * 释放语句执行者资源
	 * @param st
	 */
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			st = null;
		}
	}
	
	/**
	 * 释放结果集资源
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
	}
	
	//开启事务
	public static void startTransaction() throws SQLException{
		getConn().setAutoCommit(false);
	}
	
	//提交并释放连接
	public static void commitAndClose(){
		try {
			//获取连接
			Connection conn = getConn();
			//提交事物
			conn.commit();
			//释放资源
			conn.close();
			//解除绑定
			tl.remove();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 回滚事物和释放连接
	 */
	public static void rollbackAndClose(){
		try {
			//获取连接
			Connection conn = getConn();
			//事务回滚
			conn.rollback();
			//释放资源
			conn.close();
			//解除绑定
			tl.remove();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
