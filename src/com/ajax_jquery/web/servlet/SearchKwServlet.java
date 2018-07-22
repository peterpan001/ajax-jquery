package com.ajax_jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax_jquery.service.AdService;
/**
 * 
 */
public class SearchKwServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//设置编码
		request.setCharacterEncoding("utf-8");
		
		//接收请求参数
		String kw = request.getParameter("kw");
		System.out.println(kw);
		
		//调用Service进行查询
		List<Object> list = null;
		try {
			list = new AdService().searchKw4Ajax(kw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(list!=null && list.size()>0){
			String s = list.toString();
			s = s.substring(1, s.length()-1);
			System.out.println(s);
			response.getWriter().println(s);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
