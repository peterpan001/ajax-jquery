package com.ajax_jquery.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ajax的Get请求
 */
public class Ajax2Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收参数
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso-8859-1"), "utf-8");
		System.out.println(username);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("姓名：" + username);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
