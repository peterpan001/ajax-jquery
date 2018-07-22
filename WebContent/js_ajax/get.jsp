<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax   Get请求方式</title>
</head>
<body>
	<center>
		<h3>
			<input type="button" value="点我" onclick="btnClick()" />
		</h3>
	</center>
</body>
<script type="text/javascript">
	function btnClick() {
		//创建核心对象
		xmlhttp = null;
		if (window.XMLHttpRequest) {
			// code for IE7, Firefox, Opera, etc.
			xmlhttp = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			// code for IE5, IE6
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		//编写回调函数
		xmlhttp.onreadystatechange = function() {
			if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
				alert(xmlhttp.responseText);
			}
		}

		//设置请求方式和请求路径  open操作
		xmlhttp.open("get",
				"${pageContext.request.contextPath}/ajax2?username=张三");

		//发送请求 send操作
		xmlhttp.send();
	}
</script>
</html>