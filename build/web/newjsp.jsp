<%-- 
    Document   : newjsp
    Created on : 17 janv. 2015, 20:13:51
    Author     : AmineHN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="f1" method="post" action="UploadFile" enctype="multipart/form-data" >
            Select File<input type="file" name="file1" multiple/>
            <input type="text" name="nom" value="" />
            <input type="submit" value="insert"/>
        </form>
    </body>
</html>
