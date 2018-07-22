<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax检查用户名是否重复</title>
<script type="text/javascript">
	function checkUsername(obj){
		//创建核心对象
		xmlhttp = null;
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
		}else if(window.ActiveXObject){
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		//调用回调函数
		xmlhttp.onreadystatechange = function(){
			if(xmlhttp.readyState == 4 && xmlhttp.status==200){
				if(xmlhttp.responseText == 1){
					document.getElementById("username_msg").innerHTML="<font color='green'>用户名可以使用</font>";
					document.getElementById("sub").disabled=false;
				}else{
					document.getElementById("username_msg").innerHTML="<font color='red'>用户名已被使用</font>"
					document.getElementById("sub").disabled=true;
				}
			}
		}
		
		//设置请求方式及请求地址
		xmlhttp.open("post", "${pageContext.request.contextPath}/checkUsername4Ajax?username="+obj.value);
		
		//发送请求
		xmlhttp.send();
	}

</script>
</head>
<body>
	<center>
		<form action="#" method="post">
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="username" onblur='checkUsername(this)'></td>
					<td><span id="username_msg"></span></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="text" name="password"></td>
					<td></td>
				</tr>
				<tr align="center">
					<td colspan='3'><input type="submit" id="sub"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>