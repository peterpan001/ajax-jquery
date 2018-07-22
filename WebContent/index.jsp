<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax-Jquery</title>
</head>
<body>
	<center>
		<h3>
			原生的Ajax<br>
			<a href="${pageContext.request.contextPath}/js_ajax/hello.jsp">ajax 入门</a><br>
		
			<a href="${pageContext.request.contextPath}/js_ajax/get.jsp">ajax get请求</a><br>
			
			<a href="${pageContext.request.contextPath}/js_ajax/post.jsp">ajax post请求</a><br>
			<hr>
			jQuery的Ajax<br>
			<a href="${pageContext.request.contextPath}/jquery_ajax/ajax.jsp">Jquery Ajax请求的4种方式</a><br>
			
			<a href="${pageContext.request.contextPath}/checkname/demo1.jsp">原生的Ajax检查用户名是否重复</a><br>
			
			<a href="${pageContext.request.contextPath}/checkname/demo2.jsp">Jquery的Ajax检查用户名是否重复</a><br>
			
			<a href="${pageContext.request.contextPath}/baidusousuo/demo1.jsp">模拟百度搜索浏览框</a><br>
			
			<a href="${pageContext.request.contextPath}/shengshi/demo1.jsp">省市联动</a>
		</h3>
	</center>
</body>
</html>