<%-- 
    Document   : HelloJSP
    Created on : Sep 21, 2017, 8:38:18 AM
    Author     : 730053
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Age next birthday.</h1>        
        <div>
            <form action = "AgeBirthdayServlet" method="post">
                Enter your Age:
                <input type="text" name="Age">
                <input type ="submit" value="Submit">
            </form>
            <div>
                ${Age}
                ${errMsg}
            </div>
        </div>
    </body>
</html>
