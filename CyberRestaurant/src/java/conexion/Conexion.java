
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String db = "restaurant";
    private static final String URL = "jdbc:mysql://instanciamdb1.c8t145bpfcn2.us-east-1.rds.amazonaws.com:3306/" + db;
    private static final String USERNAME = "root";
    private static final String PASSSWORD = "espe2017";

    public  Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSSWORD);
            System.out.println("Conexion realizada con exito");
        } catch (Exception e) {
            System.out.println("Conexion Fallida...");
        }
        return connection;
    }
    

}
