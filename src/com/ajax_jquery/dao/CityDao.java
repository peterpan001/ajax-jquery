package com.ajax_jquery.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ajax_jquery.domain.City;
import com.ajax_jquery.utils.DataSourceUtils;

public class CityDao {

	public List<City> findAllCityByProId(String pid) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from city where provinceId = ?";
		return qr.query(sql, new BeanListHandler<>(City.class), pid);
	}

}
