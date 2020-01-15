<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Servlet</title>
</head>
<body>

	<h1>Hello Servlet</h1>
	
	<p>
		<a href="hello">Get Request to /hello</a>
	</p>
	
	<form action="hello" method="post">
		
		<input type="text" name="name" placeholder="Enter Name" />
		<input type="submit" value="Send" />
		
	</form>

</body>
</html>