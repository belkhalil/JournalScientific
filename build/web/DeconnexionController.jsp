<%-- 
    Document   : DeconnexionController
    Created on : 10 janv. 2016, 19:12:29
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
        <%
            session = request.getSession(false);
            session.invalidate();
            RequestDispatcher rd = request.getRequestDispatcher("index.htm");
            rd.forward(request, response);

        %>
    </body>
</html>
