<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShadowMonstersHome</title>
<!-- <link rel="stylesheet" href="login.css"> -->
<style><%@include file="/WEB-INF/css/login.css"%></style>
</head>
<body>
<!-- 
<H1>Welcome to Shadow Monsters Home</H1>
<H2>Enjoy Hackathon</H2> -->
<div class="login-wrap">
<div class="login-html">
    <h1>MonsterMatch</h1>
    
<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
    
    
<div class="login-form">
<div class="sign-in-htm">

<form action="/userAunthentication" method="POST" >
<!-- <form action="/userAunthentication" method="POST" > -->
<div class="group">
<label for="user" class="label">User Email</label>
<input id="user" name="user" type="text" class="input">
</div>
<div class="group">
<label for="pass" class="label">Password</label>
<input id="pass" name="pass" type="password" class="input" data-type="password">
</div>
<div class="group">
<input id="check" type="checkbox" class="check" checked>
<label for="check"><span class="icon"></span> Keep me Signed in</label>
</div>
<div class="group">
<input type="submit" class="button" value="Sign In">
</div>

<div class="hr"></div>
<div class="foot-lnk">
<h4><p>Help?<a href= "/chat" target="_blank" >Click to chat</a></p></h4>
<!-- <h4><p>Help?<a href= "/chat" target="_blank" >Click to chat</a></p></h4> -->
<a href="#forgot">Forgot Password?</a>
</div>
</div>
<div class="sign-up-htm">

<h2><p>New Researcher to Monster Match ?<a href= "http://ec2-34-205-61-100.compute-1.amazonaws.com/ResearcherApplication/Register.aspx"> Register </a></p></h2>
<div class="hr"></div>
<div class="foot-lnk">
<label for="tab-1">Already Registered?</a>
</div>
</div>
</div>
</div>
</div>
</form>
</body>
</html>