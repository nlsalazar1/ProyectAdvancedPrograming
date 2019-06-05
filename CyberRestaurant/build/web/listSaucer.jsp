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
                
                qwery = "SELECT * FROM saucer";
                
                consult = con.createStatement();
                res = consult.executeQuery(qwery);
                
                while (res.next()){
                    String idSaucer = res.getString("idSaucer");
                    String nameSaucer = res.getString("nameSaucer");
                    float costSaucer = res.getFloat("costSaucer");
                    int qualification = res.getInt("qualification");
                    
                    out.println("<h1>- -- :: SAUCERS :: -- -</h1>"
                        + "ID:\t" + idSaucer + "<br>"
                        + "NAME:\t" + nameSaucer + "<br>"
                        + "COST:\t" + costSaucer + "<br>"
                        + "QUALIFICATION:" + qualification + "<br><br>");
                }
 
            } catch (Exception e) {
                out.println("<script>alert('USER NO REGISTER');</script>");
                out.println("<META HTTP-EQUIV='REFRESH' CONTENT='0;URL=index.html'>");
            }
        %>
    </body>
</html>
