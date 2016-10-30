<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie</title>
</head>
<body>
<p>All Movie List</p>
<hr/>

<form action="search" method="get">
<label>Search:</label>
<input type="text" name="search"></br>
<input type="submit" value="search">
</form>

<s:iterator value="list" var="movie">
	<h2>Name: <s:property value="#movie.name"/></h2>
	<p>Description: 
		<s:property value="#movie.description"/></p>		
		<p>Rate: <s:property value="#movie.rate"/></p>
		<img alt="${ movie.name}" src="${ movie.image}" width="200" height="300"/>
	</hr>
</s:iterator>
</body>
</html>