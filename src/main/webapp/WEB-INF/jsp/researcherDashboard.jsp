<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShadowMonstersDashboard</title>
<!-- <link rel="stylesheet" href="login.css"> -->
<style><%@include file="/WEB-INF/css/login.css"%></style>

</head>
<body>
<H1>Researcher Dashboard Page</H1>
<%
    String redirectURL = "http://ec2-34-205-61-100.compute-1.amazonaws.com/ResearcherApplication/ResearcherDashboard.aspx?Id=21";
    response.sendRedirect(redirectURL);
%>
</body>
</html>