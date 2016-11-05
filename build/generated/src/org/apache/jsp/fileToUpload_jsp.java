package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fileToUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>AngularJS File Upoad Example with $http and FormData</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/angular.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body ng-app=\"fupApp\">\n");
      out.write("        <div ng-controller=\"fupController\">\n");
      out.write("\n");
      out.write("            <input type=\"file\" id=\"file1\" name=\"file\" multiple\n");
      out.write("                   ng-files=\"getTheFiles($files)\" />\n");
      out.write("\n");
      out.write("            <input type=\"button\" ng-click=\"uploadFiles()\" value=\"Upload\" />\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        angular.module('fupApp', [])\n");
      out.write("                .directive('ngFiles', ['$parse', function ($parse) {\n");
      out.write("\n");
      out.write("                        function fn_link(scope, element, attrs) {\n");
      out.write("                            var onChange = $parse(attrs.ngFiles);\n");
      out.write("                            element.on('change', function (event) {\n");
      out.write("                                onChange(scope, {$files: event.target.files});\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                        ;\n");
      out.write("\n");
      out.write("                        return {\n");
      out.write("                            link: fn_link\n");
      out.write("                        }\n");
      out.write("                    }])\n");
      out.write("                .controller('fupController', function ($scope, $http) {\n");
      out.write("\n");
      out.write("                    var formdata = new FormData();\n");
      out.write("                    $scope.getTheFiles = function ($files) {\n");
      out.write("                        angular.forEach($files, function (value, key) {\n");
      out.write("                            formdata.append(key, value);\n");
      out.write("                        });\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    // NOW UPLOAD THE FILES.\n");
      out.write("                    $scope.uploadFiles = function () {\n");
      out.write("\n");
      out.write("                        var request = {\n");
      out.write("                            method: 'POST',\n");
      out.write("                            url: '/api/fileupload/',\n");
      out.write("                            data: formdata,\n");
      out.write("                            headers: {\n");
      out.write("                                'Content-Type': undefined\n");
      out.write("                            }\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        // SEND THE FILES.\n");
      out.write("                        $http(request)\n");
      out.write("                                .success(function (d) {\n");
      out.write("                                    alert(d);\n");
      out.write("                                })\n");
      out.write("                                .error(function () {\n");
      out.write("                                });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("I’ll divide the \n");
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
}
