<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<title>省市联动</title>
<script type="text/javascript">
	$(function(){
		//页面加载成功，查询所有省份
		url="${pageContext.request.contextPath}/selectPro";
		$.get(url, function(data){
			//alert(data);
			var $pro = $("#proId");
			$(data).each(function(){
				$pro.append($("<option value="+this.provinceId+">"+this.name+"</option>"));
			});
		}, "json");
		
		//给省份下拉选派发change事件
		$("#proId").change(function(){
			//获取省份id
			var $pid = $(this).val();
			//alert($pid);
			url="${pageContext.request.contextPath}/selectCity";
			params={"pid":$pid};
			$.get(url, params, function(data){
				//alert(data);
				var $city = $("#cityId");
				$city.html("<option>--请选择--</option>");
				if(data!=null){
					$(data).each(function(){
						$city.append($("<option value="+this.cityId+">"+this.name+"</option>"));
					});
				}
			},"json");
			
		});
	});

</script>
</head>
<body>
	<center>
		<select id="proId" name="province">
			<option>--省份--</option>
		</select>
		
		<select id="cityId" name="city">
			<option>--请选择--</option>
		</select>
	</center>
</body>
</html>