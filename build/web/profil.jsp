<%@page import="com.article_informatique.Model.Auteur"%>
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
            Auteur auteur = (Auteur) c.getUser();

            pageContext.setAttribute("nom", c.getUser().getNom() + " " + c.getUser().getPrenom());
            pageContext.setAttribute("profil", c.getUser().getPhoto());

            pageContext.setAttribute("specialite", c.getUser().getSpecialite());
            pageContext.setAttribute("creation", c.getCreation());
            pageContext.setAttribute("user", auteur);

            pageContext.setAttribute("articles", auteur.getArticles());
            pageContext.setAttribute("amis", auteur.getAmis());
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
                        <li><a href="Publier_Article.jsp">Publier des articles<span class="sr-only">(current)</span></a>
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
                        <li><a href="home.jsp">Acceuil</a>
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

                        <li class="dropdown user user-menu active">
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
                                        <a href="#">Mes Articles</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">Mes Messages</a>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <a href="#">Mes Amis</a>
                                    </div>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">Profile</a>
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
        <div class="col-lg-2"></div>
        <div class="col-lg-8 col-sm-6">
            <div class="card hovercard">
                <div class="card-background">
                    <img class="card-bkimg" alt="" src="<c:out value="${profil}"/>">
                    <!-- http://lorempixel.com/850/280/people/9/ -->
                </div>
                <div class="useravatar">
                    <img alt="" src="<c:out value="${profil}"/>">
                </div>
                <div class="card-info"> <span class="card-title"><c:out value="${nom}"/></span>

                </div>
            </div>
            <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
                <div class="btn-group" role="group">
                    <button type="button" id="stars" class="btn btn-primary" href="#tab1" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <div class="hidden-xs">Mes Informations</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="favorites" class="btn btn-default" href="#tab2" data-toggle="tab"><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
                        <div class="hidden-xs">Mes Articles</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="following" class="btn btn-default" href="#tab3" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <div class="hidden-xs">Amis</div>
                    </button>
                </div>
            </div>

            <div class="well" style="font-family: consolas;">
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="tab1">
                        <form class="form-horizontal">
                            <br>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >NOM</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getNom()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >PRENOM</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getPrenom()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Date de naissance</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getNaissance()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Tel</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getTel()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Ville</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getVille()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Nationalite</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getNationalite()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Sexe</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >
                                        <c:if test="${user.getSexe() == 1}">
                                            HOMME
                                        </c:if>
                                        <c:if test="${user.getSexe() == 0}">
                                            FEMME
                                        </c:if>

                                    </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Niveau</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getNiveau()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Travail</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getTravail()}</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >Secteur</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" >${user.getSecteur()}</label>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label" >CV</label>
                                <div class="col-sm-10">
                                    <label for="inputEmail3" class="col-sm-2 control-label" ><a href="${user.getCv()}" target="Starfall">Open File</a></label>
                                </div>
                            </div>
                        </form>

                    </div>
                    <div class="tab-pane fade in" id="tab2">
                        <c:forEach items="${articles}" var="article">
                            <div class="panel panel-default">
                                <div class="panel-body">  
                                    <a href="#" style="font-family: consolas;font-size: 16px;"><img src="${profil}" alt="" width="96" class="img-thumbnail"/>  HANANE AMINE</a>
                                    <time style="float: right">${article.getSoumission()}</time>
                                    <hr>
                                    <span class="badge" style="background-color:#5cb85c;float: right">${article.getTypeAuteur()}</span>
                                    <div>
                                        <h2 style="font-family: consolas;">Titre : ${article.getArticle().getTitre()}</h2>
                                        <img src="${article.getArticle().getPhoto()}" alt="" class="featureImg" width="100%"/>
                                        <p>${article.getArticle().getObjectif()}</p>
                                        <h4 style="font-family: consolas;">Resume</h4>
                                        <p>${article.getArticle().getResume()}</p>
                                    </div>
                                </div>
                                <div class='panel-footer'>
                                    <a class="btn btn-primary btn-xs">Read more</a>
                                    <a class="btn btn-danger btn-xs">Delete</a>
                                    <a class="btn btn-warning btn-flat btn-xs">View comment</a>
                                </div>   
                            </div>
                        </c:forEach>
                    </div>

                    <div class="tab-pane fade in" id="tab3">
                        <c:forEach items="${amis}" var="ami">
                            <div class="panel panel-default">
                                <div class="panel-body">  
                                    <a href="#" style="font-family: consolas;font-size: 16px;"><img src="${ami.getPhoto()}" alt="" width="96" class="img-thumbnail"/>  ${ami.getNom()} ${ami.getPrenom()}</a>
                                    <time style="float: right">${ami.getNaissance()}</time>
                                    <hr>
                                    <div>
                                        <h4 style="font-family: consolas;">Specialite : ${ami.getSpecialite()}</h4>
                                        <h4 style="font-family: consolas;">Travail : ${ami.getTravail()}</h4>
                                        <h4 style="font-family: consolas;">Secteur : ${ami.getSecteur()}</h4>
                                    </div>
                                </div>  
                            </div>
                        </c:forEach>
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
            <script>
                        $(document).ready(function () {
                            $(".btn-pref .btn").click(function () {
                                $(".btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
                                // $(".tab").addClass("active"); // instead of this do the below 
                                $(this).removeClass("btn-default").addClass("btn-primary");
                            });
                        });
            </script>
            <style>
                /* USER PROFILE PAGE */
                .card {
                    margin-top: 20px;
                    padding: 30px;
                    background-color: rgba(214, 224, 226, 0.2);
                    -webkit-border-top-left-radius:5px;
                    -moz-border-top-left-radius:5px;
                    border-top-left-radius:5px;
                    -webkit-border-top-right-radius:5px;
                    -moz-border-top-right-radius:5px;
                    border-top-right-radius:5px;
                    -webkit-box-sizing: border-box;
                    -moz-box-sizing: border-box;
                    box-sizing: border-box;
                }
                .card.hovercard {
                    position: relative;
                    padding-top: 0;
                    overflow: hidden;
                    text-align: center;
                    background-color: #fff;
                    background-color: rgba(255, 255, 255, 1);
                }
                .card.hovercard .card-background {
                    height: 130px;
                }
                .card-background img {
                    -webkit-filter: blur(25px);
                    -moz-filter: blur(25px);
                    -o-filter: blur(25px);
                    -ms-filter: blur(25px);
                    filter: blur(25px);
                    margin-left: -100px;
                    margin-top: -200px;
                    min-width: 130%;
                }
                .card.hovercard .useravatar {
                    position: absolute;
                    top: 15px;
                    left: 0;
                    right: 0;
                }
                .card.hovercard .useravatar img {
                    width: 100px;
                    height: 100px;
                    max-width: 100px;
                    max-height: 100px;
                    -webkit-border-radius: 50%;
                    -moz-border-radius: 50%;
                    border-radius: 50%;
                    border: 5px solid rgba(255, 255, 255, 0.5);
                }
                .card.hovercard .card-info {
                    position: absolute;
                    bottom: 14px;
                    left: 0;
                    right: 0;
                }
                .card.hovercard .card-info .card-title {
                    padding:0 5px;
                    font-size: 20px;
                    line-height: 1;
                    color: #262626;
                    background-color: rgba(255, 255, 255, 0.1);
                    -webkit-border-radius: 4px;
                    -moz-border-radius: 4px;
                    border-radius: 4px;
                }
                .card.hovercard .card-info {
                    overflow: hidden;
                    font-size: 12px;
                    line-height: 20px;
                    color: #737373;
                    text-overflow: ellipsis;
                }
                .card.hovercard .bottom {
                    padding: 0 20px;
                    margin-bottom: 17px;
                }
                .btn-pref .btn {
                    -webkit-border-radius:0 !important;
                }


            </style>
    </body>

</html>