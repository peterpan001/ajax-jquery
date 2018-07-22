<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<title>JQuery的Ajax</title>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var url="${pageContext.request.contextPath}/jqueryAjax";
			var params = {"username":"张三"};
			
			/*
			//load方式
			$(this).load(url, params, function(data){
				alert(data);
			});
			*/
			
			/*
			//get方式
			$.get(url, params, function(data){
				alert(data);
			});
			*/
			
			/*
			//post方式
			$.post(url, params, function(data){
				alert(data.result);
				alert(data.msg);
			}, "json");
			*/
			
			//ajax请求方式
			$.ajax({
				url:url,
				type:"post",
				data:params,
				success:function(data){
					alert(data.result);
					alert(data.msg);
				},
				error:function(){},
				dataType:"json"
			});
		});
	});

</script>
</head>
<body>
	<center>
		<input id="btn" type="button" value="点我">
	</center>
</body>
</html>