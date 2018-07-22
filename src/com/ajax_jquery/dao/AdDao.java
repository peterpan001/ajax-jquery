package com.ajax_jquery.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.ajax_jquery.utils.DataSourceUtils;

public class AdDao {

	public List<Object> searchKw4Ajax(String kw) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select kw from ad where kw like ? limit 5";
		return qr.query(sql, new ColumnListHandler("kw"), "%"+kw+"%");
	}

}
