<%-- 
    Document   : login
    Created on : Oct 13, 2021, 6:40:07 PM
    Author     : 849961
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h2>Login</h2>
        <form method="post" action="login">
            <label>Username: </label>
            <input type="text" name="username" value="">
            <br>
            <lable>Password:</lable>
            <input type="password" name="password" value=""><br>
            <input type="submit" name="login" value="Log in">
        </form>
        <p>${message}</p>
    </body>
</html>
