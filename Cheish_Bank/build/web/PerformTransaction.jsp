<%-- 
    Document   : PerformTransaction
    Created on : 20 Jul, 2021, 4:10:08 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form action ="PerformTransaction">
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
              <br>  
            Select Reciever :  
            <select  id="reciever" name ="reciever"> 
                <c:forEach var = "row" items = "${result.rows}">
                   <option>${row.name}</option>
                </c:forEach>
                </select>  
                
            <br>
            Enter amount : <input type="text" name="amount" id="amount"></input>
    <br>
    <input type ="submit" value ="Transfer" name="Transfer">
        </form>
    </body>
</html>
