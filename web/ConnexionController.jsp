<%@page import="com.article_informatique.Model.Compte"%>
<%@page import="com.article_informatique.DAO.CompteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Auteur</title>
    </head>
    <body>
        <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            CompteDAO compteDAO = new CompteDAO();
            Compte c = compteDAO.accesToCompte(email, password);
             if (c != null) {
                session = request.getSession();
                session.setAttribute("compte", c);
                if (c.getUser().getType() == 1) {
                    RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                    rd.forward(request, response);
                }
             }
        %>
    </body>
</html>
