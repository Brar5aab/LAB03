<%-- 
    Document   : helloworldform
    Created on : 21 Sep, 2022, 8:43:50 AM
    Author     : balji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Servlet</title>
    </head>
    <body>
        <h1><b>Age Calculator</b></h1>
        <form method="post" action="age">
            <div>
                <label>Enter your age</label>
                <input type="number" name="enter_your_age" value="${age}">
            </div>
            <br>
            
            <br>
             <p>  ${message} </p>
            
            <div>
                <input type="submit"  value="Age next Birthday">
            </div>
                    
               
        </form>
             <a href="calculator">arithmetic calculator</a>
    </body>
</html>
