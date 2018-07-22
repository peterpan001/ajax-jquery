package com.ajax_jquery.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ajax_jquery.domain.Province;
import com.ajax_jquery.utils.DataSourceUtils;

public class ProvinceDao {
	
	public List<Province> findAllPro() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql ="select * from province";
		return qr.query(sql, new BeanListHandler<>(Province.class));
	}

}	
