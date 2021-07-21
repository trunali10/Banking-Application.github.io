<%-- 
    Document   : ViewCustomer
    Created on : 20 Jul, 2021, 2:37:54 PM
    Author     : ADMIN
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <H1>Transactions</h1>
    
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


<table id="table" border="1">
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
JOptionPane.showConfirmDialog(null, "Exception "+e);
}
%>
</table>
 
    </body>
</html>
