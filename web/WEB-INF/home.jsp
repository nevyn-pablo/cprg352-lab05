<%-- 
    Document   : home
    Created on : Oct 13, 2021, 6:39:58 PM
    Author     : 849961
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        
        <h1>Home page</h1>
        <p>Hello ${user.username}.</p>
        <a href="login?logout" name="logout">Log out</a>
    </body>
    

</html>
