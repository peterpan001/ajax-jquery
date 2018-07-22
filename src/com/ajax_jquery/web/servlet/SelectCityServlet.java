package com.ajax_jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.ajax_jquery.domain.City;
import com.ajax_jquery.service.CityService;

/**
 * 根据省份选择城市
 */
public class SelectCityServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//获取参数
		String pid = request.getParameter("pid");
		System.out.println(pid);
		//调用Service方法进行查询
		List<City> list = null;
		try {
			list = new CityService().findAllCityByProId(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(list!=null && list.size() > 0){
			response.getWriter().println(JSONArray.fromObject(list));
		}
	}

}
