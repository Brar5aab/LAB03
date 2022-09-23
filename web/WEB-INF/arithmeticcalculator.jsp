

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Calculator </title>
    </head>
    <body>
        <h1><b>Arithmetic Calculator</b></h1>
        <form method="post" action="calculator">
            <div>
                <label>First Number</label>
                <input type="number" name="first_number" value="${fno}">
            </div>
            <br>
            <div>
                <label>Second Number</label>
                <input type="number" name="second_number" value="${sno}">
            </div>
            <br>
            <div>
                <input type="submit"  name="operation" value="+">  <input type="submit" name="operation" value="-">
                <input type="submit" name="operation" value="*">  <input type="submit" name="operation" value="%">
            </div>
            <br>
             <p>  Result: ${m} </p>
            
                    
               
        </form><br>
         <a href="age">Age Calculator</a>
    </body>
</html>
