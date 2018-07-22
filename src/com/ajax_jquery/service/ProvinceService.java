package com.ajax_jquery.service;

import java.sql.SQLException;
import java.util.List;

import com.ajax_jquery.dao.ProvinceDao;
import com.ajax_jquery.domain.Province;

public class ProvinceService {

	public List<Province> findAllPro() throws SQLException {
		return new ProvinceDao().findAllPro();
	}	
}
