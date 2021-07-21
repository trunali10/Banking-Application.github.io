<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

<body vertical-align= "middle" >

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
<br>
<div id="head" ><center><h1>TRANSACTIONS</h1></center></div>
       <br>
        
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


<table id="table" border="1"  style="text-align:center" color="white" com.mysql.jdbc.Driver">
<tr>
<td>NO</td>
<td>SENDER</td>
<td>RECIEVER</td>
<td>PREVIOUS BALANCE</td>
<td>TRANSACTION AMT</td>
<td>MODE</td>
<td>CURRENT BALANCE</td>
<td>REMARK</td>
</tr>
    
   
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="SELECT * FROM `transactions`";
//String sql ="SELECT `id`, `cust_id`, `sender`, `reciever`, `previous_balance`, `transaction_amt`, `transaction_type`, `current_balance`, `remark` FROM `transactions'";
//String sql ="SELECT `id`, `cust_id`, `cust_name`, `previous_balance`, `transaction_amt`, `transaction_type`, `current_balance`, `remark` FROM `transactions`";
resultSet = statement.executeQuery(sql);
int i=1;
while(resultSet.next()){
i++;

    %>
<tr>
 <td><%=i%></td>   
<td><%=resultSet.getString("sender") %></td>
<td><%=resultSet.getString("reciever") %></td>
<td><%=resultSet.getString("previous_balance") %></td>
<td><%=resultSet.getString("transaction_amt") %></td>
<td><%=resultSet.getString("transaction_type") %></td>
<td><%=resultSet.getString("current_balance") %></td>
<td><%=resultSet.getString("remark") %></td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
 
        
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
