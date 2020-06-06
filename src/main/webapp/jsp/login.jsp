<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link href="assets/login.css" rel="stylesheet" type="text/css">
    </head>
<body>
    <form method="post" action="login" class="login-box">
    	<h1>Login</h1>
		<div class="textbox">
			<i class="fas fa-user"></i>
			<input type="text" placeholder="Username" name="username">
		</div>

		<div class="textbox">
			<i class="fas fa-lock"></i>
			<input type="password" placeholder="Password" name="password">
		</div>
      	<input type="submit" class="btn" value="Sign in">
    </form>
  </body>
</html>