package com.ajax_jquery.service;

import java.sql.SQLException;
import java.util.List;

import com.ajax_jquery.dao.CityDao;
import com.ajax_jquery.domain.City;

public class CityService {

	public List<City> findAllCityByProId(String pid) throws SQLException {
		return new CityDao().findAllCityByProId(pid);
	}

}
