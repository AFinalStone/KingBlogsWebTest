<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请求方式测试</title>
</head>
<body>

	<form action="springmvc/testRest/11111" method="post">
		<input type="hidden" name="_method" value="PUT" /> <input
			type="submit" value="testRest Put" />
	</form>
	<br/><br/>

	<form action="springmvc/testRest/22222" method="post">
		<input type="hidden" name="_method" value="DELETE" /> <input
			type="submit" value="TestRest DELETE" />
	</form>
	<br/><br/>

	<form action="springmvc/testRest" method="post">
		<input type="submit" value="testRestPost">
	</form>
	<br/><br/>

	<form action="springmvc/testRest/33333" method="post">
		<input type="submit" value="testRestPost ID">
	</form>
	<br/><br/>
	
	<a href="springmvc/testRest">testRestGET</a>
	<br/><br/>
	
	<a href="springmvc/testRest/44444">testRestGET ID</a>
	<br/><br/>
	
	<a href="springmvc/testRequestParam?username=shitou&age=12">testRequestParam</a>
	<br/><br/>

</body>
</html>