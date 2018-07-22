package com.ajax_jquery.jqueryajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class JqueryAjaxServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getMethod();
		System.out.println("method:"+method);
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso-8859-1"),"utf-8");
		System.out.println(username);
		
		//响应数据
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("姓名：" + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getMethod();
		System.out.println("method:"+method);
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
		
		
		response.setContentType("text/html;charset=utf-8");
		String s = "{\"result\":\"success\",\"msg\":\"成功\"}";
		response.getWriter().println(s);
		
	}
}