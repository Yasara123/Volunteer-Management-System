<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<style type="text/css">
.errorMessage{
color:red;
}
</style>
<s:form action="log">
      <s:textfield key="email" label="Email" size="20" ></s:textfield>
      <s:password key="password" label="Password" size="20" ></s:password>
      <s:submit  label="Login" align="center" ></s:submit >
</s:form>

</body>
</html>