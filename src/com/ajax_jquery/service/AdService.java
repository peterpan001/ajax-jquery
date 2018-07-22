package com.ajax_jquery.service;

import java.sql.SQLException;
import java.util.List;

import com.ajax_jquery.dao.AdDao;

public class AdService {

	public List<Object> searchKw4Ajax(String kw) throws SQLException {
		return new AdDao().searchKw4Ajax(kw);
	}

}
