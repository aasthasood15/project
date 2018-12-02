package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style tab links */\n");
      out.write(".tablink {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("  float: left;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tablink:hover {\n");
      out.write("  background-color: #777;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content (and add height:100% for full page content) */\n");
      out.write(".tabcontent {\n");
      out.write("  color: white;\n");
      out.write("  display: none;\n");
      out.write("  padding: 100px 20px;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Home {background-color: red;}\n");
      out.write("#News {background-color: green;}\n");
      out.write("#Contact {background-color: blue;}\n");
      out.write("#About {background-color: orange;}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("        function openPage(pageName, elmnt, color) {\n");
      out.write("    // Hide all elements with class=\"tabcontent\" by default */\n");
      out.write("    var i, tabcontent, tablinks;\n");
      out.write("    tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("    for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("        tabcontent[i].style.display = \"none\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Remove the background color of all tablinks/buttons\n");
      out.write("    tablinks = document.getElementsByClassName(\"tablink\");\n");
      out.write("    for (i = 0; i < tablinks.length; i++) {\n");
      out.write("        tablinks[i].style.backgroundColor = \"\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Show the specific tab content\n");
      out.write("    document.getElementById(pageName).style.display = \"block\";\n");
      out.write("\n");
      out.write("    // Add the specific color to the button used to open the tab content\n");
      out.write("    elmnt.style.backgroundColor = color;\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Get the element with id=\"defaultOpen\" and click on it\n");
      out.write("document.getElementById(\"defaultOpen\").click(); \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <button class=\"tablink\" onclick=\"openPage('Home', this, 'red')\">Home</button>\n");
      out.write("<button class=\"tablink\" onclick=\"openPage('News', this, 'green')\" id=\"defaultOpen\">News</button>\n");
      out.write("<button class=\"tablink\" onclick=\"openPage('Contact', this, 'blue')\">Contact</button>\n");
      out.write("<button class=\"tablink\" onclick=\"openPage('About', this, 'orange')\">About</button>\n");
      out.write("\n");
      out.write("<div id=\"Home\" class=\"tabcontent\">\n");
      out.write("  <h3>Home</h3>\n");
      out.write("  <p>Home is where the heart is..</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"News\" class=\"tabcontent\">\n");
      out.write("  <h3>News</h3>\n");
      out.write("  <p>Some news this fine day!</p> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"Contact\" class=\"tabcontent\">\n");
      out.write("  <h3>Contact</h3>\n");
      out.write("  <p>Get in touch, or swing by for a cup of coffee.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"About\" class=\"tabcontent\">\n");
      out.write("</div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
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
