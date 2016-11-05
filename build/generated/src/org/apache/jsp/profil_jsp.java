package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.article_informatique.Model.Auteur;
import com.article_informatique.Model.Compte;

public final class profil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html ng-app=\"myapp\">\n");
      out.write("    <head>\n");
      out.write("        <title>Home Auteur</title>\n");
      out.write("        <meta name=\"description\" content=\"Made with WOW Slider - Create beautiful, responsive image sliders in a few clicks. Awesome skins and animations. Jquery carousel\" />\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />       \n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />   \n");
      out.write("        <link href=\"css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/daterangepicker-bs3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/AdminLTE.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\n");
      out.write("        <!-- End WOWSlider.com HEAD section -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/angular.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body ng-controller=\"userController\">\n");
      out.write("        ");

            session = request.getSession(false);
            Compte c = (Compte) session.getAttribute("compte");
            Auteur auteur = (Auteur) c.getUser();

            pageContext.setAttribute("nom", c.getUser().getNom() + " " + c.getUser().getPrenom());
            pageContext.setAttribute("profil", c.getUser().getPhoto());

            pageContext.setAttribute("specialite", c.getUser().getSpecialite());
            pageContext.setAttribute("creation", c.getCreation());
            pageContext.setAttribute("user", auteur);

            pageContext.setAttribute("articles", auteur.getArticles());
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-static-top\" style=\"font-family: consolas;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header \">\n");
      out.write("                    <a href=\"C:\\Users\\AmineHN\\Desktop\\MASTER2014\\poster.pdf\" class=\"navbar-brand\">\n");
      out.write("                        My Article\n");
      out.write("                    </a>\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"home.html\">HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"recherche.html\">Puplier des articles<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown active\">\n");
      out.write("                            <form class=\"navbar-form navbar-left \" role=\"search\" action=\"\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input ng-model=\"label\" ng-change=\"recherche(label)\" type=\"text\" class=\"form-control\" placeholder=\"Search a Actor or Article ..\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                        <ul class=\"dropdown-menu\" role=\"menu\" style=\"overflow: scroll;height: 300px;width: 400px\">\n");
      out.write("                                            <li ng-repeat=\"article in listArticles\">\n");
      out.write("                                                <a href=\"1\" role=\"menuitem\" tabindex=\"-1\" href=\"#\">\n");
      out.write("                                                    <img src=\"{{article.photo}}\" width=\"70px\" class=\"img-thumbnail\"/>\n");
      out.write("                                                    {{article.titre}} <i>{{article.objectif}}</i>\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <span class=\"input-group-btn\">\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                                <span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span>\n");
      out.write("                                            </button>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"connexion.html\">Acceuil</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Categories <span class=\"caret\">\n");
      out.write("                                </span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"#contact\" data-toggle=\"modal\">Computing Sciences</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">Wild Sciences</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">Physique Sciences</a>\n");
      out.write("                                </li>  \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown notifications-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"label label-warning\">10</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have 10 notifications</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img src=\"img/505880.jpg\" width=\"70px\" class=\"img-thumbnail\" />\n");
      out.write("                                                5 new members joined today\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img src=\"img/505880.jpg\" width=\"70px\" class=\"img-thumbnail\" />\n");
      out.write("                                                Very long description here that may not fit into the page and may cause design problems\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img src=\"img/505880.jpg\" width=\"70px\" class=\"img-thumbnail\" />\n");
      out.write("                                                5 new members joined\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img src=\"img/505880.jpg\" width=\"70px\" class=\"img-thumbnail\" />\n");
      out.write("                                                25 sales made\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img src=\"img/505880.jpg\" width=\"70px\" class=\"img-thumbnail\" />\n");
      out.write("                                                You changed your username\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                <span>");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write(" <i class=\"caret\"></i></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <!-- User image -->\n");
      out.write("                                <li class=\"user-header bg-black\">\n");
      out.write("                                    <img src=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                                    <p>\n");
      out.write("                                        ");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write(" - ");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <small>Member since ");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("</small>\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Body -->\n");
      out.write("                                <li class=\"user-body\">\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Mes Articles</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Mes Messages</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Mes Amis</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">\n");
      out.write("                                        <a href=\"#deconnexion\" data-toggle=\"modal\" class=\"btn btn-default btn-flat\">Déconnecter</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Aide <span class=\"caret\">\n");
      out.write("                                </span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"#contact\" data-toggle=\"modal\">Contact</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">A propos de nous</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">FAQ</a>\n");
      out.write("                                </li>  \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"deconnexion\" role=\"dialog\" style=\"font-family: consolas;\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <center>\n");
      out.write("                                <h4>Voulez vous vraiment deconnecté?</h4>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <a class=\"btn btn-default btn-flat\" data-dismiss=\"modal\">Non</a>\n");
      out.write("                            <a class=\"btn btn-primary btn-flat\" type=\"submit\" href=\"DeconnexionController.jsp\">Oui</a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-2\"></div>\n");
      out.write("        <div class=\"col-lg-8 col-sm-6\">\n");
      out.write("            <div class=\"card hovercard\">\n");
      out.write("                <div class=\"card-background\">\n");
      out.write("                    <img class=\"card-bkimg\" alt=\"\" src=\"");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                    <!-- http://lorempixel.com/850/280/people/9/ -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"useravatar\">\n");
      out.write("                    <img alt=\"\" src=\"");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-info\"> <span class=\"card-title\">");
      if (_jspx_meth_c_out_7(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"btn-pref btn-group btn-group-justified btn-group-lg\" role=\"group\" aria-label=\"...\">\n");
      out.write("                <div class=\"btn-group\" role=\"group\">\n");
      out.write("                    <button type=\"button\" id=\"stars\" class=\"btn btn-primary\" href=\"#tab1\" data-toggle=\"tab\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>\n");
      out.write("                        <div class=\"hidden-xs\">Mes Informations</div>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn-group\" role=\"group\">\n");
      out.write("                    <button type=\"button\" id=\"favorites\" class=\"btn btn-default\" href=\"#tab2\" data-toggle=\"tab\"><span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span>\n");
      out.write("                        <div class=\"hidden-xs\">Mes Articles</div>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn-group\" role=\"group\">\n");
      out.write("                    <button type=\"button\" id=\"following\" class=\"btn btn-default\" href=\"#tab3\" data-toggle=\"tab\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>\n");
      out.write("                        <div class=\"hidden-xs\">Amis</div>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"well\">\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane fade in active\" id=\"tab1\">\n");
      out.write("                        <form class=\"form-horizontal\" style=\"font-family: consolas;\">\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >NOM</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >PRENOM</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getPrenom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Date de naissance</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getNaissance()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Tel</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Ville</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getVille()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Nationalite</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getNationalite()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Sexe</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Niveau</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getNiveau()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Travail</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getTravail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >Secteur</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getSecteur()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" >CV</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\" ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getCv()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"Starfall\">Open File</a></label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade in\" id=\"tab2\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <a href=\"#\" style=\"font-family: consolas;font-size: 16px;\"><img src=\"img/avatar5.png\" alt=\"\" width=\"96\" class=\"img-thumbnail\"/>  HANANE AMINE</a>\n");
      out.write("                                <time style=\"float: right\">20:22 05/04/2015</time>\n");
      out.write("                                <hr>\n");
      out.write("                                <div>\n");
      out.write("                                    <img src=\"img/505880.jpg\" alt=\"\" class=\"featureImg\" width=\"100%\"/>\n");
      out.write("                                    <p>En anglais, les bootstraps qui sont generalement traduits en francais par \"tirants de bottes\", sont les boucles, en cuir ou en tissu, cousus sur le rebord des bottes et dans lesquels on passe les doigts ou qu'on tire pour s'aider à les enfiler.</p>\n");
      out.write("                                    <h4>A heading</h4>\n");
      out.write("                                    <p>En anglais, les bootstraps qui sont generalement traduits en francais par \"tirants de bottes\", sont les boucles, en cuir ou en tissu, cousus sur le rebord des bottes et dans lesquels on passe les doigts ou qu'on tire pour s'aider à les enfiler.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class='panel-footer'>\n");
      out.write("                                <a class=\"btn btn-primary btn-xs\">Read more</a>\n");
      out.write("                                <a class=\"btn btn-danger btn-xs\">Delete</a>\n");
      out.write("                                <a class=\"btn btn-warning btn-flat btn-xs\">View comment</a>\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade in\" id=\"tab3\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"engine1/script.js\"></script>\n");
      out.write("            <!-- End WOWSlider.com BODY section -->\n");
      out.write("            <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("            <script src=\"js/bootstrap.js\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                                                                var myapp = angular.module('myapp', []);\n");
      out.write("\n");
      out.write("                                                                myapp.config(['$httpProvider', function ($httpProvider) {\n");
      out.write("                                                                        $httpProvider.defaults.useXDomain = true;\n");
      out.write("                                                                        delete $httpProvider.defaults.headers.common['X-Requested-With'];\n");
      out.write("                                                                    }\n");
      out.write("                                                                ]);\n");
      out.write("\n");
      out.write("                                                                myapp.controller('userController', function ($scope, $http) {\n");
      out.write("\n");
      out.write("                                                                    /**/\n");
      out.write("                                                                    $scope.base_url = 'http://localhost:8282/Serveur_Article_Scientifique/auteur';\n");
      out.write("                                                                    $scope.idSchool = null;\n");
      out.write("                                                                    $scope.listUsers = null;\n");
      out.write("                                                                    $http.get($scope.base_url).success(function (response) {\n");
      out.write("                                                                        $scope.listUsers = response;\n");
      out.write("                                                                    });\n");
      out.write("\n");
      out.write("                                                                    $scope.recherche = function (label) {\n");
      out.write("                                                                        $scope.slide = true;\n");
      out.write("                                                                        $http.get('http://localhost:8282/Serveur_Article_Scientifique/articles?label=' + label).success(function (response) {\n");
      out.write("                                                                            $scope.listArticles = response;\n");
      out.write("                                                                        });\n");
      out.write("                                                                    };\n");
      out.write("                                                                });\n");
      out.write("            </script>\n");
      out.write("            <script>\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $(\".btn-pref .btn\").click(function () {\n");
      out.write("                                $(\".btn-pref .btn\").removeClass(\"btn-primary\").addClass(\"btn-default\");\n");
      out.write("                                // $(\".tab\").addClass(\"active\"); // instead of this do the below \n");
      out.write("                                $(this).removeClass(\"btn-default\").addClass(\"btn-primary\");\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("            </script>\n");
      out.write("            <style>\n");
      out.write("                /* USER PROFILE PAGE */\n");
      out.write("                .card {\n");
      out.write("                    margin-top: 20px;\n");
      out.write("                    padding: 30px;\n");
      out.write("                    background-color: rgba(214, 224, 226, 0.2);\n");
      out.write("                    -webkit-border-top-left-radius:5px;\n");
      out.write("                    -moz-border-top-left-radius:5px;\n");
      out.write("                    border-top-left-radius:5px;\n");
      out.write("                    -webkit-border-top-right-radius:5px;\n");
      out.write("                    -moz-border-top-right-radius:5px;\n");
      out.write("                    border-top-right-radius:5px;\n");
      out.write("                    -webkit-box-sizing: border-box;\n");
      out.write("                    -moz-box-sizing: border-box;\n");
      out.write("                    box-sizing: border-box;\n");
      out.write("                }\n");
      out.write("                .card.hovercard {\n");
      out.write("                    position: relative;\n");
      out.write("                    padding-top: 0;\n");
      out.write("                    overflow: hidden;\n");
      out.write("                    text-align: center;\n");
      out.write("                    background-color: #fff;\n");
      out.write("                    background-color: rgba(255, 255, 255, 1);\n");
      out.write("                }\n");
      out.write("                .card.hovercard .card-background {\n");
      out.write("                    height: 130px;\n");
      out.write("                }\n");
      out.write("                .card-background img {\n");
      out.write("                    -webkit-filter: blur(25px);\n");
      out.write("                    -moz-filter: blur(25px);\n");
      out.write("                    -o-filter: blur(25px);\n");
      out.write("                    -ms-filter: blur(25px);\n");
      out.write("                    filter: blur(25px);\n");
      out.write("                    margin-left: -100px;\n");
      out.write("                    margin-top: -200px;\n");
      out.write("                    min-width: 130%;\n");
      out.write("                }\n");
      out.write("                .card.hovercard .useravatar {\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 15px;\n");
      out.write("                    left: 0;\n");
      out.write("                    right: 0;\n");
      out.write("                }\n");
      out.write("                .card.hovercard .useravatar img {\n");
      out.write("                    width: 100px;\n");
      out.write("                    height: 100px;\n");
      out.write("                    max-width: 100px;\n");
      out.write("                    max-height: 100px;\n");
      out.write("                    -webkit-border-radius: 50%;\n");
      out.write("                    -moz-border-radius: 50%;\n");
      out.write("                    border-radius: 50%;\n");
      out.write("                    border: 5px solid rgba(255, 255, 255, 0.5);\n");
      out.write("                }\n");
      out.write("                .card.hovercard .card-info {\n");
      out.write("                    position: absolute;\n");
      out.write("                    bottom: 14px;\n");
      out.write("                    left: 0;\n");
      out.write("                    right: 0;\n");
      out.write("                }\n");
      out.write("                .card.hovercard .card-info .card-title {\n");
      out.write("                    padding:0 5px;\n");
      out.write("                    font-size: 20px;\n");
      out.write("                    line-height: 1;\n");
      out.write("                    color: #262626;\n");
      out.write("                    background-color: rgba(255, 255, 255, 0.1);\n");
      out.write("                    -webkit-border-radius: 4px;\n");
      out.write("                    -moz-border-radius: 4px;\n");
      out.write("                    border-radius: 4px;\n");
      out.write("                }\n");
      out.write("                .card.hovercard .card-info {\n");
      out.write("                    overflow: hidden;\n");
      out.write("                    font-size: 12px;\n");
      out.write("                    line-height: 20px;\n");
      out.write("                    color: #737373;\n");
      out.write("                    text-overflow: ellipsis;\n");
      out.write("                }\n");
      out.write("                .card.hovercard .bottom {\n");
      out.write("                    padding: 0 20px;\n");
      out.write("                    margin-bottom: 17px;\n");
      out.write("                }\n");
      out.write("                .btn-pref .btn {\n");
      out.write("                    -webkit-border-radius:0 !important;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("article");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            AA\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${specialite}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${creation}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent(null);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getSexe() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            HOMME\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getSexe() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            FEMME\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
