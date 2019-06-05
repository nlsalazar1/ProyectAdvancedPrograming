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
                
                while (res.next()){
                    String idPurchase = res.getString("idPurchase");
                    String namePurchase = res.getString("namePurchase");
                    float costPurchase = res.getFloat("costPurchase");
                    int qualification = res.getInt("qualification");
                    String tiket = res.getString("tiket");
                    
                    out.println("<h1>- -- :: PURCHASE :: -- -</h1>"
                        + "ID:\t" + idPurchase + "<br>"
                        + "NAME:\t" + namePurchase + "<br>"
                        + "COST:\t" + costPurchase + "<br>"
                        + "QUALIFICATION:\t" + qualification + "<br>"
                        + "TIKET:" + tiket + "<br><br>");
                }
 
            } catch (Exception e) {
                out.println("<script>alert('USER NO REGISTER');</script>");
                out.println("<META HTTP-EQUIV='REFRESH' CONTENT='0;URL=index.html'>");
            }
        %>
    </body>
</html>
