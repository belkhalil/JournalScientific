<%@page import="com.article_informatique.DAO.AuteurDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int idC = Integer.parseInt(request.getParameter("idC"));
            int idA = Integer.parseInt(request.getParameter("idA"));
            AuteurDAO auteurDAO = new AuteurDAO();
            auteurDAO.addAmi(idC, idA);
            RequestDispatcher rd = request.getRequestDispatcher("Amis.jsp");
            rd.forward(request, response);
       %>
    </body>
</html>
