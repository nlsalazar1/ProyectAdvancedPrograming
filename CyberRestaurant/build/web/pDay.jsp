<%-- 
    Document   : pDay
    Created on : 05/06/2019, 3:11:26
    Author     : Luvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        <%@page import="java.lang.*"%>
        <%
            ///DB
            String db = "restaurant";
            String URL = "jdbc:mysql://localhost:3306/" + db;
            String USERNAME = "root";
            String PASSSWORD = "admin";

            String qwery;
            Connection con = null;
            Statement consult = null;
            ResultSet res= null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(URL, USERNAME, PASSSWORD);
                
                qwery = "SELECT * FROM purchase";
                
                consult = con.createStatement();
                res = consult.executeQuery(qwery);
                float costPurchase = 0;
                
                while (res.next()){
                    costPurchase += res.getFloat("costPurchase");
                }
                
                out.println("<h1>The PURCHASE of day is [ " + costPurchase + " ]</h1>");
 
            } catch (Exception e) {
                out.println("<script>alert('USER NO REGISTER');</script>");
                out.println("<META HTTP-EQUIV='REFRESH' CONTENT='0;URL=index.html'>");
            }
        %>
    </body>
</html>
