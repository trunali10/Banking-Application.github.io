<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Global Banking ..</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function ctck()
{
var sds = document.getElementById("dum");

}
</script>

</head>

<body vertical-align= "middle">

<div id="top_links">
  

<div id="header">
	<h1>CHERISH BANK<span class="style1"></span></h1>
    <h2>A PENNY SAVED IS A PENNY EARNED </h2>	
</div>

<div id="navigation">
    <ul>
    <li><a href="index.jsp">HOME</a></li>
    <li><a href="New_ViewCustomer.jsp"> VIEW CUSTOMER </a></li>
    <li><a href="New_PerformTransaction.jsp"> TRANSFER MONEY </a></li>
    <li><a href="New_Transaction.jsp"> VIEW TRANSACTION </a></li>
    <li><a href="Contact.jsp"> CONTACT </a></li>
    
    </ul>
</div>

<!--<table cellpadding="0" cellspacing="0" id="content1"><tr align="CENTER">
	<td class="con" valign="top">
    </td>
    
    <td class="con" valign="top">-->
<div id="head" ><Center><h1>CONTACT US</h1></center></div>
       
        
    <%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%
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
%>

<form  id="ContactUs100" method="post">

<table style="width:100%;max-width:550px;border:0;" cellpadding="8" cellspacing="0">
<tr> <td>
<label for="Name">Name*:</label>
</td> <td>
<input name="Name" type="text" maxlength="60" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<label for="PhoneNumber">Phone number:</label>
</td> <td>
<input name="PhoneNumber" type="text" maxlength="43" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<label for="FromEmailAddress">Email address*:</label>
</td> <td>
<input name="FromEmailAddress" type="text" maxlength="90" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<label for="Comments">Comments*:</label>
</td> <td>
<textarea name="Comments" rows="7" cols="40" style="width:100%;max-width:350px;"></textarea>
</td> </tr> <tr> <td>
* - required fields
</td> </tr>
</table>
</form>
 
<!--    </td>
    
    <td class="con" valign="top">s
    	<div id="heade3">
            
        </div>
        
    </td>
</tr></table>-->


<div id="footer_top">
  <div id="footer_navigation">
  

  </div>
  
  <div id="footer_copyright" >
 		    <p>CHERISH BANK PVT.LTD.</p>
Copyright © Trunali Wagh </div>
</div>
<script type="text/javascript">
document.onload = ctck();
</script>
</div>

</body>
</html>
