<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入门Ajax</title>
</head>
<body>
	<center>
		<h3><input type="button" value="点我" onclick="btnClick()"/></h3>
	</center>
</body>
<script type="text/javascript">
	function btnClick(){
		//1：创建核心对象
		xmlhttp = null;
		if(window.XMLHttpRequest){
			// code for Firefox, Opera, IE7, etc.
			xmlhttp = new XMLHttpRequest();
		}else if(window.ActiveXObject){
			// code for IE6, IE5
			xmlhttp = new ActionXObject("Microsoft.XMLHTTP");
		}
		
		//2:编写回调函数
		xmlhttp.onreadystatechange = function(){
			//alert(xmlhttp.readyState);
			//alert(xmlhttp.status);
			if(xmlhttp.readyState == 4 && xmlhttp.status){
				//alert('ok');
				alert(xmlhttp.responseText);
			}
		}
		
		//3:open 设置请求的方式和请求的路径
		xmlhttp.open("get", "${pageContext.request.contextPath}/ajax1");
	
		//4:send 发送请求
		xmlhttp.send()
		
	}
</script>
</html>