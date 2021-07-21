package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class New_005fContact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Global Banking ..</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function ctck()\n");
      out.write("{\n");
      out.write("var sds = document.getElementById(\"dum\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body vertical-align= \"middle\">\n");
      out.write("\n");
      out.write("<div id=\"top_links\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<h1>CHERISH BANK<span class=\"style1\"></span></h1>\n");
      out.write("    <h2>A PENNY SAVED IS A PENNY EARNED </h2>\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"navigation\">\n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("    <li><a href=\"New_ViewCustomer.jsp\"> VIEW CUSTOMER </a></li>\n");
      out.write("    <li><a href=\"New_PerformTransaction.jsp\"> TRANSFER MONEY </a></li>\n");
      out.write("    <li><a href=\"New_Transaction.jsp\"> VIEW TRANSACTION </a></li>\n");
      out.write("    <li><a href=\"Contact.jsp\"> CONTACT </a></li>\n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--<table cellpadding=\"0\" cellspacing=\"0\" id=\"content1\"><tr align=\"CENTER\">\n");
      out.write("\t<td class=\"con\" valign=\"top\">\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td class=\"con\" valign=\"top\">-->\n");
      out.write("<div id=\"head\" ><Center><h1>CONTACT US</h1></center></div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");

//String id = request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "cherish_bank";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("<form  id=\"ContactUs100\" method=\"post\">\n");
      out.write("\n");
      out.write("<table style=\"width:100%;max-width:550px;border:0;\" cellpadding=\"8\" cellspacing=\"0\">\n");
      out.write("<tr> <td>\n");
      out.write("<label for=\"Name\">Name*:</label>\n");
      out.write("</td> <td>\n");
      out.write("<input name=\"Name\" type=\"text\" maxlength=\"60\" style=\"width:100%;max-width:250px;\" />\n");
      out.write("</td> </tr> <tr> <td>\n");
      out.write("<label for=\"PhoneNumber\">Phone number:</label>\n");
      out.write("</td> <td>\n");
      out.write("<input name=\"PhoneNumber\" type=\"text\" maxlength=\"43\" style=\"width:100%;max-width:250px;\" />\n");
      out.write("</td> </tr> <tr> <td>\n");
      out.write("<label for=\"FromEmailAddress\">Email address*:</label>\n");
      out.write("</td> <td>\n");
      out.write("<input name=\"FromEmailAddress\" type=\"text\" maxlength=\"90\" style=\"width:100%;max-width:250px;\" />\n");
      out.write("</td> </tr> <tr> <td>\n");
      out.write("<label for=\"Comments\">Comments*:</label>\n");
      out.write("</td> <td>\n");
      out.write("<textarea name=\"Comments\" rows=\"7\" cols=\"40\" style=\"width:100%;max-width:350px;\"></textarea>\n");
      out.write("</td> </tr> <tr> <td>\n");
      out.write("* - required fields\n");
      out.write("</td> </tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write(" \n");
      out.write("<!--    </td>\n");
      out.write("    \n");
      out.write("    <td class=\"con\" valign=\"top\">s\n");
      out.write("    \t<div id=\"heade3\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("</tr></table>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer_top\">\n");
      out.write("  <div id=\"footer_navigation\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div id=\"footer_copyright\" >\n");
      out.write(" \t\t    <p>CHERISH BANK PVT.LTD.</p>\n");
      out.write("Copyright © Trunali Wagh </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("document.onload = ctck();\n");
      out.write("</script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
