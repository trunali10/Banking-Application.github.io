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
<div id="head" ><Center><h1>TRANSFER MONEY</h1></center>></div>
       
        
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


 
<form action ="PerformTransaction">
<center>    
    <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/cherish_bank"
         user = "root"  password = ""/>
         <sql:query dataSource = "${snapshot}" var = "result">
            SELECT name from `customerdetails`
         
         </sql:query>
            Select Sender : 
            <select  id="sender" name="sender"> 
                <c:forEach var = "row" items = "${result.rows}">
                   <option>${row.name}</option>
                </c:forEach>
                </select>
              <br>  <br>
            Select Reciever :  
            <select  id="reciever" name ="reciever"> 
                <c:forEach var = "row" items = "${result.rows}">
                   <option>${row.name}</option>
                </c:forEach>
                </select>  
                
            <br>  <br>
            Enter amount : <input type="text" name="amount" id="amount"></input>
    <br>  <br>
    <input type ="submit" value ="Transfer" name="Transfer">
</center>   
    </form>        
<!--    </td>
    
    <td class="con" valign="top">
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
