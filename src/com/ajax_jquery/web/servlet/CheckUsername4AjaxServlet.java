package com.ajax_jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax_jquery.domain.User;
import com.ajax_jquery.service.UserService;

/**
 * 用原生Ajax检查用户名是否重复的Servlet
 */
public class CheckUsername4AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		
		//接收请求参数
		String username = request.getParameter("username");
		System.out.println(username);
		//调用Service查询用户名
		User user = null;
		try {
			user = new UserService().checkUsername4Ajax(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//将查询的用户信息写回前台
		if(user==null){
			response.getWriter().println("1");
		}else{
			response.getWriter().println("0");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
