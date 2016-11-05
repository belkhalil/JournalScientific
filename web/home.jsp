<%@page import="com.article_informatique.Model.Compte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html ng-app="myapp">
    <head>
        <title>Home Auteur</title>
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
            session = request.getSession(false);
            Compte c = (Compte) session.getAttribute("compte");
            
            pageContext.setAttribute("nom", c.getUser().getNom() + " " + c.getUser().getPrenom());
            pageContext.setAttribute("profil", c.getUser().getPhoto());
            pageContext.setAttribute("specialite", c.getUser().getSpecialite());
            pageContext.setAttribute("creation", c.getCreation());
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
                        <li class="active"><a href="Publier_Article.jsp">Publier des articles<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="dropdown active">
                            <form class="navbar-form navbar-left " role="search" action="">
                                <div class="form-group">
                                    <div class="input-group">
                                        <input ng-model="label" ng-change="recherche(label)" type="text" class="form-control" placeholder="Search a Actor or Article .." data-toggle="dropdown" aria-expanded="false">
                                        <ul class="dropdown-menu" role="menu" style="overflow: scroll;height: 300px;width: 400px">
                                            <li ng-repeat="article in listArticles">
                                                <a href="1" role="menuitem" tabindex="-1" href="#">
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
                        <li class="active"><a href="home.jsp">Acceuil</a>
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

                        <li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="label label-warning">10</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">You have 10 notifications</li>
                                <li>
                                    <ul class="menu">
                                        <li>
                                            <a href="#">
                                                <img src="img/505880.jpg" width="70px" class="img-thumbnail" />
                                                5 new members joined today
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <img src="img/505880.jpg" width="70px" class="img-thumbnail" />
                                                Very long description here that may not fit into the page and may cause design problems
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <img src="img/505880.jpg" width="70px" class="img-thumbnail" />
                                                5 new members joined
                                            </a>
                                        </li>

                                        <li>
                                            <a href="#">
                                                <img src="img/505880.jpg" width="70px" class="img-thumbnail" />
                                                25 sales made
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <img src="img/505880.jpg" width="70px" class="img-thumbnail" />
                                                You changed your username
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer"><a href="#">View all</a></li>
                            </ul>
                        </li>

                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span><c:out value="${nom}"/> <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header bg-black">
                                    <img src="<c:out value="${profil}"/>" class="img-circle" alt="User Image" />
                                    <p>
                                        <c:out value="${nom}"/> - <c:out value="${specialite}"/>
                                        <small>Member since <c:out value="${creation}"/></small>
                                    </p>
                                </li>
                                <!-- Menu Body -->
                                <li class="user-body">
                                    <div class="col-xs-4 text-center">
                                        <a href="profil.jsp">Mes Articles</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="profil.jsp">Mes Messages</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="profil.jsp">Mes Amis</a>
                                    </div>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="profil.jsp" class="btn btn-default btn-flat">Profile</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="#deconnexion" data-toggle="modal" class="btn btn-default btn-flat">Déconnecter</a>
                                    </div>
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

        <div class="container" style="font-family: Century Gothic;">
            <div class="row">               
                <div class="col-lg-2">

                </div>
                <div class="col-lg-8">

                    <!-- Start WOWSlider.com BODY section --> <!-- add to the <body> of your page -->
                    <div id="wowslider-container1" ng-hide="slide">
                        <div class="ws_images"><ul>
                                <li><img src="data1/images/a1.jpg" alt="Article scientifique" title="Article scientifique" id="wows1_0"/></li>
                                <li><img src="data1/images/a2.jpg" alt="Planétologie" title="Planétologie" id="wows1_1"/></li>
                                <li><img src="data1/images/a3.jpg" alt="Sciences d'information et d'ingénierie" title="Sciences d'information et d'ingénierie" id="wows1_2"/></li>
                                <li><img src="data1/images/a4.jpg" alt="Sciences naturelles" title="Sciences naturelles" id="wows1_3"/></li>
                                <li><img src="data1/images/a6.jpg" alt="Sport & santé" title="Sport & santé" id="wows1_4"/></li>
                                <li><a href="http://wowslider.com"><img src="data1/images/a7.jpg" alt="slider js" title="sciences corps humain" id="wows1_5"/></a></li>
                                <li><img src="data1/images/a9.jpg" alt="Sciences formelles" title="Sciences formelles" id="wows1_6"/></li>
                            </ul></div>
                        <div class="ws_bullets"><div>
                                <a href="#" title="Article scientifique"><span><img src="data1/tooltips/a1.jpg" alt="Article scientifique"/>1</span></a>
                                <a href="#" title="Planétologie"><span><img src="data1/tooltips/a2.jpg" alt="Planétologie"/>2</span></a>
                                <a href="#" title="Sciences d'information et d'ingénierie"><span><img src="data1/tooltips/a3.jpg" alt="Sciences d'information et d'ingénierie"/>3</span></a>
                                <a href="#" title="Sciences naturelles"><span><img src="data1/tooltips/a4.jpg" alt="Sciences naturelles"/>4</span></a>
                                <a href="#" title="Sport & santé"><span><img src="data1/tooltips/a6.jpg" alt="Sport & santé"/>5</span></a>
                                <a href="#" title="sciences corps humain"><span><img src="data1/tooltips/a7.jpg" alt="sciences corps humain"/>6</span></a>
                                <a href="#" title="Sciences formelles"><span><img src="data1/tooltips/a9.jpg" alt="Sciences formelles"/>7</span></a>
                            </div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.net">jquery carousel</a> by WOWSlider.com v7.9</div>
                        <div class="ws_shadow"></div>
                    </div>
                    <br>
                    <div class="row" >    
                        <div ng-repeat="auteur in listUsers">
                            <div ng-repeat="articl in auteur.articles" class="panel panel-default">
                                <div ng-if="articl.typeAuteur == 'chef'">
                                    <div class="panel-body">

                                        <a href="#" style="font-family: consolas;font-size: 16px;"><img src="{{auteur.photo}}" alt="" width="96" class="img-thumbnail"/>  {{auteur.nom}} {{auteur.prenom}} </a>
                                        <time style="float: right">20:22 05/04/2015</time>
                                        <hr>
                                        <div>
                                            <h4>Titre : <b>{{articl.article.titre}}</b></h4>
                                            <img src="{{articl.article.photo}}" alt="" class="featureImg" width="100%"/>{{articl.article.photo}}
                                            <p>{{articl.article.objectif}}</p>
                                            <h4>Resumé</h4>
                                            <p>{{articl.article.resume}}</p>{{articl.typeAuteur}}
                                        </div>
                                    </div>
                                    <div class='panel-footer'>
                                        <a class="btn btn-primary btn-xs">Read more</a>
                                        <a class="btn btn-danger btn-xs">Delete</a>
                                        <a class="btn btn-warning btn-flat btn-xs">View comment</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2">
                </div>
            </div>
        </div> 
    </div> 
    <div class="modal fade" id="deconnexion" role="dialog" style="font-family: consolas;">
        <div class="modal-dialog">
            <div class="modal-content">
                <form class="form-horizontal">
                    <div class="modal-header">
                        <center>
                            <h4>Voulez vous vraiment deconnecté?</h4>
                        </center>
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-default btn-flat" data-dismiss="modal">Non</a>
                        <a class="btn btn-primary btn-flat" type="submit" href="DeconnexionController.jsp">Oui</a>
                    </div>
                </form>
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