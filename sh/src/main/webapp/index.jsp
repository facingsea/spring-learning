<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	
	<form action="/sh/user/saveUser.do" method="post">
		<input id="name" name="name" />
		<input id="address" name="address">
		
		<input type="button" value="提交">
	</form>
	
</body>
</html>