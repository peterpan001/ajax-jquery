package com.ajax_jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import com.ajax_jquery.domain.Province;
import com.ajax_jquery.service.ProvinceService;

/**
 * 
 */
public class SelectProServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有省份
		List<Province> list = null;
		try {
			list = new ProvinceService().findAllPro();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//将所有省份写回去
		response.setContentType("text/html;charset=utf-8");
		if(list!=null && list.size() > 0){
			response.getWriter().println(JSONArray.fromObject(list));
		}
	}
}
