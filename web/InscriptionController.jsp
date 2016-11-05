<%-- 
    Document   : InscriptionController
    Created on : 11 janv. 2016, 02:24:56
    Author     : AmineHN
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.article_informatique.DAO.CompteDAO"%>
<%@page import="com.article_informatique.Model.Compte"%>
<%@page import="java.util.Date"%>
<%@page import="com.article_informatique.Model.Auteur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String naissance = request.getParameter("naissance");
        String tel = request.getParameter("tel");
        String sexe = request.getParameter("sexe");
        String ville = request.getParameter("ville");
        String nationalite = request.getParameter("nationalite");
        String specialite = request.getParameter("specialite");
        String niveau = request.getParameter("niveau");
        String travail = request.getParameter("travail");
        String secteur = request.getParameter("secteur");
        
        //out.println(email+" "+password+" "+nom+" "+prenom+" "+naissance+" "+tel+" "+sexe+" "+ville+" "+nationalite+" "+specialite+" "+niveau+" "+travail+" "+secteur);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(naissance);
        int gender = Integer.parseInt(sexe);
        
        Auteur auteur = new Auteur(nom, prenom, date, tel, ville, nationalite, "img/505880.jpg", specialite, gender, 1, niveau, travail, secteur, "pdf/HANANE_AMINE.pdf");
        Compte compte = new Compte(email, "login", password, 0, 0, 0);
        compte.setUser(auteur);
        auteur.setCompte(compte);
        
        CompteDAO dao = new CompteDAO();
        
        Compte c = dao.addCompte(compte);
        if(c!= null){
                   out.println("<b>Bienvenu à MyArticle : "+nom+" "+prenom+" Ton compte sera traiter par notre equipe il sera actif au mois de 1h</b><br><a href='index.htm'>Home</a>");
        }
        else out.println("Desole : <br><a href='index.htm'>Home</a>");
        %>
    </body>
</html>
