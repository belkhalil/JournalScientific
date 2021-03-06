<%-- 
    Document   : AfficherArticle
    Created on : 11 janv. 2016, 04:33:09
    Author     : AmineHN
--%>

<%@page import="com.article_informatique.DAO.ArticleDAO"%>
<%@page import="com.article_informatique.Model.Article"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html ng-app="myapp">

    <head>
        <title>Welcome To My Article</title>
        <meta name="description" content="Made with WOW Slider - Create beautiful, responsive image sliders in a few clicks. Awesome skins and animations. Jquery carousel" />

        <meta http-equiv="content-type" content="text/html; charset=utf-8" />

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />       
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />   
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <link href="css/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <link href="css/AdminLTE.css" rel="stylesheet" type="text/css" />
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

        <!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
        <link rel="stylesheet" type="text/css" href="engine1/style.css" />

        <script type="text/javascript" src="engine1/jquery.js"></script>
        <!-- End WOWSlider.com HEAD section -->
        <script type="text/javascript" src="js/angular.min.js"></script>
    </head>

    <body ng-controller="userController">
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            ArticleDAO articleDAO = new ArticleDAO();
            Article article = articleDAO.getArticle(id);
            pageContext.setAttribute("article", article);
            pageContext.setAttribute("comments", article.getCommentaires());
        %>

        <nav class="navbar navbar-inverse navbar-static-top" style="font-family: consolas;">
            <div class="container-fluid">

                <div class="navbar-header ">
                    <a href="C:\Users\AmineHN\Desktop\MASTER2014\poster.pdf" class="navbar-brand">
                        My Article
                    </a>
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="home.html">HOME</a>
                        </li>
                        <li><a href="recherche.html">Puplier des articles<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="dropdown active">
                            <form class="navbar-form navbar-left " role="search" action="">
                                <div class="form-group">
                                    <div class="input-group">
                                        <input ng-model="label" ng-change="recherche(label)" type="text" class="form-control" placeholder="Search a Actor or Article .." data-toggle="dropdown" aria-expanded="false">
                                        <ul class="dropdown-menu" role="menu" style="overflow: scroll;height: 300px;width: 400px">
                                            <li ng-repeat="article in listArticles">
                                                <a href="Afficher_Article.jsp?id={{article.id}}" role="menuitem" tabindex="-1" href="#">
                                                    <img src="{{article.photo}}" width="70px" class="img-thumbnail"/>
                                                    {{article.titre}} <i>{{article.objectif}}</i>
                                                </a>
                                            </li>
                                        </ul>
                                        <span class="input-group-btn">
                                            <button class="btn btn-default" type="submit">
                                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                                            </button>
                                        </span>
                                    </div>
                                </div>
                            </form>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="connexion.html">Acceuil</a>
                        </li>
                        <li><a href="#contact" data-toggle="modal">Connexion</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Categories <span class="caret">
                                </span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#contact" data-toggle="modal">Computing Sciences</a>
                                </li>
                                <li><a href="#">Wild Sciences</a>
                                </li>
                                <li><a href="#">Physique Sciences</a>
                                </li>  
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Aide <span class="caret">
                                </span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#contact" data-toggle="modal">Contact</a>
                                </li>
                                <li><a href="#">A propos de nous</a>
                                </li>
                                <li><a href="#">FAQ</a>
                                </li>  
                            </ul>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
        <div class="col-lg-2"></div>
        <div class="col-lg-8 col-sm-6">
            <div class="panel panel-default">
                <div class="panel-body"> 
                    <c:forEach items="${article.getAuteurs()}" var="participant">
                        <c:if test="${participant.getTypeAuteur() == 'chef'}">
                            <a href="#" style="font-family: consolas;font-size: 16px;"><img src="${participant.getAuteur().getPhoto()}" alt="" width="96" class="img-thumbnail"/>  ${participant.getAuteur().getNom()} ${participant.getAuteur().getPrenom()}</a>
                            <time style="float: right">${participant.getSoumission()}</time>
                        </c:if>
                    </c:forEach>
                    <hr>
                    <span class="badge" style="background-color:#5cb85c;float: right">chef</span>
                    <div>
                        <h2 style="font-family: consolas;">Titre : ${article.getTitre()}</h2>
                        <img src="${article.getPhoto()}" alt="" class="featureImg" width="100%"/>
                        <h4 style="font-family: consolas;">* Objectif</h4>
                        <p>${article.getObjectif()}</p>
                        <h4 style="font-family: consolas;">* Description</h4>
                        <p>${article.getDescription()}</p>
                        <h4 style="font-family: consolas;">* Resume</h4>
                        <p>${article.getResume()}</p>
                        <h4 style="font-family: consolas;">* Public Vise</h4>
                        <p>${article.getPublicVise()}</p>
                        <h4 style="font-family: consolas;">* Categories</h4>
                        <ul>
                            <c:forEach items="${article.getCategories()}" var="categorie">
                                <li>${categorie.getLabel()}</li>
                                </c:forEach>
                        </ul>
                        <h4 style="font-family: consolas;">* Participants</h4>
                        <ul>
                            <c:forEach items="${article.getAuteurs()}" var="participant">
                                <li>${participant.getAuteur().getNom()} ${participant.getAuteur().getPrenom()} <span class="badge" style="background-color:#5cb85c;">${participant.getTypeAuteur()}</span></li>
                                </c:forEach>
                        </ul>
                        <h4 style="font-family: consolas;">* Fcihier <a href="#"><i>(PDF)</i></a></h4>
                    </div>
                </div> 

                <c:forEach items="${comments}" var="comment">  
                    <hr>
                    <div class="panel-body">  
                        <a href="#" style="font-family: consolas;font-size: 16px;"><img src="${comment.getAuteur().getPhoto()}" alt="" width="96" class="img-thumbnail"/>  ${comment.getAuteur().getNom()} ${comment.getAuteur().getPrenom()}</a>
                        <time style="float: right">${comment.getPosted()}</time>
                        <div class="panel-body">
                            ${comment.getContenu()}
                        </div>
                    </div>
                </c:forEach>
                <hr>
            </div>
        </div>

        <div class="modal fade" id="contact" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">Login to myArticle.com</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-xs-6">
                                <div class="well">
                                    <form id="loginForm" method="POST" action="ConnexionController.jsp" novalidate="novalidate">
                                        <div class="form-group">
                                            <label for="password" class="control-label">Email</label>
                                            <input type="text" class="form-control" id="mno" name="email" value="" required="" title="Please enter you email" placeholder="example@gmail.com">
                                            <span class="help-block"></span>
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="control-label">Password</label>
                                            <input type="password" class="form-control" id="password" name="password" value="" required="" title="Please enter your password">
                                            <span class="help-block"></span>
                                        </div>
                                        <div id="loginErrorMsg" class="alert alert-error hide">Wrong username og password</div>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" name="remember" id="remember"> Remember login
                                            </label>
                                            <p class="help-block">(if this is a private computer)</p>
                                        </div>
                                        <button type="submit" class="btn btn-success btn-block btn-flat">Login</button>
                                        <a href="/forgot/" class="btn btn-default btn-block btn-flat">Help to login</a>
                                    </form>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <p class="lead">Register now for <span class="text-success">FREE</span></p>
                                <ul class="list-unstyled" style="line-height: 2">
                                    <li><span class="fa fa-check text-success"></span> See all your orders</li>
                                    <li><span class="fa fa-check text-success"></span> Fast re-order</li>
                                    <li><span class="fa fa-check text-success"></span> Save your favorites articles</li>
                                    <li><span class="fa fa-check text-success"></span> Add articles</li>
                                    <li><span class="fa fa-check text-success"></span> Meet other person</li>
                                    <li><span class="fa fa-check text-success"></span> Get a gift <small>(only new customers)</small></li>
                                    <li><a href="/read-more/"><u>Read more</u></a></li>
                                </ul>
                                <p><a href="inscription.htm" class="btn btn-info btn-block btn-flat">Yes please, register now!</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="engine1/wowslider.js"></script>
        <script type="text/javascript" src="engine1/script.js"></script>
        <!-- End WOWSlider.com BODY section -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script type="text/javascript">
                                                                var myapp = angular.module('myapp', []);

                                                                myapp.config(['$httpProvider', function ($httpProvider) {
                                                                        $httpProvider.defaults.useXDomain = true;
                                                                        delete $httpProvider.defaults.headers.common['X-Requested-With'];
                                                                    }
                                                                ]);

                                                                myapp.controller('userController', function ($scope, $http) {

                                                                    /**/
                                                                    $scope.base_url = 'http://localhost:8282/Serveur_Article_Scientifique/auteur';
                                                                    $scope.idSchool = null;
                                                                    $scope.listUsers = null;
                                                                    $http.get($scope.base_url).success(function (response) {
                                                                        $scope.listUsers = response;
                                                                    });

                                                                    $scope.recherche = function (label) {
                                                                        $scope.slide = true;
                                                                        $http.get('http://localhost:8282/Serveur_Article_Scientifique/articles?label=' + label).success(function (response) {
                                                                            $scope.listArticles = response;
                                                                        });
                                                                    };
                                                                });
        </script>
    </body>

</html>