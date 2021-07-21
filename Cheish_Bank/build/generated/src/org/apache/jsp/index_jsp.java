package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<body   vertical-align= \"middle\">\n");
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
      out.write("\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" id=\"content1\"><tr align=\"justify\">\n");
      out.write("\t<td class=\"con\" valign=\"top\">\n");
      out.write("    \t<div id=\"heade1\"><h1>Results</h1></div>\n");
      out.write("        <p>In the last two decades, the bank has witnessed a steady growth in business and also taken several strategic business initiatives such as undertaking business process reengineering initiative, merging seven cooperative banks and then consciously nurturing them. The bank tied up with VISA International for issuance of debit cards.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td class=\"con\" valign=\"top\">\n");
      out.write("    \t<div id=\"heade2\"><h1>Why Cherish</h1></div>\n");
      out.write("        <p>\n");
      out.write("            With 190 foreign offices in 36 countries, Cherish Bank has the highest number of overseas branches across all domestic banks and time zones. Typical international stint is for 3-5 years. The Bank ensures that you lead a comfortable life with your loved ones in the new country.With 190 foreign offices in 36 countries, SBI has the highest number of overseas branches across all domestic banks and time zones. Typical international stint is for 3-5 years. The Bank ensures that you lead a comfortable life with your loved ones in the new country.\n");
      out.write("        </p>\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td class=\"con\" valign=\"top\">\n");
      out.write("    \t<div id=\"heade3\"><h1>Solutions</h1></div>\n");
      out.write("        <p>The security of your accounts is of the top most priority for us. As a general precautionary measure CHERISH BANK has requested customer to change their Debit Card PIN. We also request you to follow these basic security tips: <br>    \n");
      out.write("* Never share your Debit Card PIN with anyone<br>\n");
      out.write("* Change your PIN regularly. Don?t keep easy to guess PIN<br>\n");
      out.write("* Transact online only at reputed and known online\n");
      out.write("    </td>\n");
      out.write("</tr></table>\n");
      out.write("\n");
      out.write("<table style=\"width:897px; background:#FFFFFF; margin:0 auto;\"><tr align=\"justify\">\n");
      out.write("\t<td width=\"299\" valign=\"top\" style=\"border-right:#666666 1px dotted;\">\n");
      out.write("    \t<div id=\"services\"><h1>Services</h1><br>\n");
      out.write("\t\t    <ul>\n");
      out.write("        \t<li><a href=\"#\">www.cherishindia.com</a></li>\n");
      out.write("            <li><a href=\"#\">www.cherismoney.com </a></li>\n");
      out.write("            <li><a href=\"#\">www.cherishstocks.com</a></li>\n");
      out.write("            </ul>\n");
      out.write("\t\t\t\n");
      out.write("       </div>\n");
      out.write("\t</td>\n");
      out.write("    \n");
      out.write("    <td width=\"299\" valign=\"top\">\n");
      out.write("    \t<div id=\"welcome\" style=\"border-right:#666666 1px dotted;\"><h1>Welcome</h1><br>\n");
      out.write("    \t    <center><img src=\"Images/globe_10.gif\" alt=\"business\" width=\"196\" height=\"106\"></center><br>\n");
      out.write("\t\t    <p> Welcome to the world of extraordinary privileges. Digital Wallet with free Virtual card and UPI which can be used to send/receive money, mobile/DTH recharge, pay bills and much more</p>\n");
      out.write("\t    </div>      \n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td width=\"299\" valign=\"top\">\n");
      out.write("   \t  <div id=\"news\"><h1>News &amp; Events</h1><br>\n");
      out.write("      \t<div class=\"img\"><img src=\"Images/globe_12.gif\" alt=\"Business\"></div>\n");
      out.write("        <h2>Jul. 20, 2021.</h2>\n");
      out.write("        <p>SBI, HDFC, CHERISH Bank move SC against disclosing information under RTI.</p><br>\n");
      out.write("        <div class=\"img\"><img src=\"Images/globe_16.gif\" alt=\"Business\"></div>\n");
      out.write("        <h2>Jul. 21, 2021.</h2>\n");
      out.write("        <p>Retail sales grow over 50% YoY; chains plan expansion as Covid situation improves.</p>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("        \t\n");
      out.write("     </td>\n");
      out.write("</tr></table>\n");
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
      out.write("\n");
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
