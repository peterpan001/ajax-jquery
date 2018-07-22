package com.ajax_jquery.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ajax Post请求
 */
public class Ajax3Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收请求参数
		System.out.println(request.getMethod());
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("姓名：" + username);
	}

}
