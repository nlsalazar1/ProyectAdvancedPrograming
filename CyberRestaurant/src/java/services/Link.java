
package services;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Client;
import model.Saucer;
import model.User;
import model.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Purchase;

public class Link {
    
    ///Search URIS
    private String sqlGetUser = "SELECT * from user WHERE ";
    private String sqlGetSaucer = "SELECT * from  saucer WHERE ";
    private String sqlGetClient = "SELECT * from  cliente WHERE ";
    private String sqlGetMenu = "SELECT * from  menu WHERE ";
    ///Register URIS
    private String sqlIncerUser = "INSERT INTO user(nameUser,passUser,typeUser) ";
    private String sqlIncerSaucer = "INSERT INTO saucer(idSaucer,idMenu,nameSaucer,costSaucer,qualification) ";
    private String sqlIncerClient = "INSERT INTO cliente(idCliente,firstname,lastname,telephone,mail) ";
    private String sqlIncerMenu = "INSERT INTO menu(idMenu,nameMenu) ";
    private String sqlIncerPurchase = "INSERT INTO purchase(idPurchase,namePurchase,costPurchase,qualification,tiket) ";
    

    private Conexion conexion = new Conexion();
    Random rnd = new Random();
    
    private final List<User> listUser = new ArrayList<User>();
    private final List<Saucer> listSaucer = new ArrayList<Saucer>();
    private final List<Client> listClient = new ArrayList<Client>();
    private final List<Menu> listMenu = new ArrayList<Menu>();
    private final List<Purchase> listPurchase = new ArrayList<Purchase>();
    
    public List<Purchase> listPurchaseSaucer(String namePurchase){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM purchase WHERE namePurchase= '" + namePurchase + "'";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String idPurchase = rs.getString("idPurchase");
                float costPurchase = rs.getFloat("costPurchase");
                int qualification = rs.getInt("qualification");
                String tiket = rs.getString("tiket");

                Purchase pu =  new Purchase(idPurchase, namePurchase, 
                        costPurchase, qualification, tiket);
                listPurchase.add(pu);
            }
            st.close();
            return listPurchase;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    
public List<Purchase> listPurchase(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM purchase";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String idPurchase = rs.getString("idPurchase");
                String namePurchase = rs.getString("namePurchase");
                float costPurchase = rs.getFloat("costPurchase");
                int qualification = rs.getInt("qualification");
                String tiket = rs.getString("tiket");

                Purchase pu =  new Purchase(idPurchase, namePurchase, 
                        costPurchase, qualification, tiket);
                listPurchase.add(pu);
            }
            st.close();
            return listPurchase;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
        public String PurchaseDay(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM purchase";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            float costPurchase = 0;
            while (rs.next()){
                costPurchase += rs.getFloat("costPurchase");

            }
            st.close();
            return "" + costPurchase;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public void deleteClient(String lastname){
        try {
            Conexion conect1 = new Conexion();
            Connection con = conect1.getConnection();
            
            String sql = "Delete From cliente where lastname = '" + lastname + "'";
            Statement st = con.createStatement();
            
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
        }
    }

    //envió de datos menu a borrar
    public void deleteMenu(String nameMenu){
        try {
            Conexion conect1 = new Conexion();
            Connection con = conect1.getConnection();
            
            String sql = "Delete From menu where nameMenu = '" + nameMenu + "'";
            Statement st = con.createStatement();
            
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
        }
    }

    public void deleteUser(String nameUser){
        try {
            Conexion conect1 = new Conexion();
            Connection con = conect1.getConnection();
            
            String sql = "Delete From user where nameUser = '" + nameUser + "'";
            Statement st = con.createStatement();
            
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
        }
    }
    
    public void deleteSaucer(String nameSaucer){
        try {
            Conexion conect1 = new Conexion();
            Connection con = conect1.getConnection();
            
            String sql = "Delete From saucer where nameSaucer = '" + nameSaucer + "'";
            Statement st = con.createStatement();
            
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
        }
    }
    
    public Purchase getPurchase(String nameSaucer, int qualification)
    {
        String tiket = "" + (char)(rnd.nextInt(91) + 65)
            + (char)(rnd.nextInt(65) + 65)
            + (char)(rnd.nextInt(65) + 65)
            + rnd.nextInt(10)
            + rnd.nextInt(10);
        
        String id = "P" + rnd.nextInt(10) + rnd.nextInt(10) 
                + rnd.nextInt(10) + rnd.nextInt(10);
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();

        String sql = sqlGetSaucer + "nameSaucer = '" + nameSaucer + "'";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Purchase pu = null;
            while(rs.next()){
                float costSaucer = rs.getFloat("costSaucer");

                String sqlA = sqlIncerPurchase 
                        + "VALUES ('" + id + "', '"
                        + nameSaucer + "', '"
                        + costSaucer + "', '"
                        + qualification + "', '"
                        + tiket + "')";
                Statement stA = con1.createStatement();
                stA.executeUpdate(sqlA);

                pu = new Purchase(id, nameSaucer, costSaucer, qualification, tiket);
            }
            //st.close();
            con1.close();
            return pu;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
//    public Purchase getPopular()
//    {
//        Conexion conect1 = new Conexion();
//        Connection con1 = conect1.getConnection();
//
//        String sql = "SELECT namesaucer from  saucer";
//        try
//        {
//            Statement st = con1.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            Purchase pu = null;
//            while(rs.next()){
//                float costSaucer = rs.getFloat("costSaucer");
//
//                String sqlA = sqlIncerPurchase 
//                        + "VALUES ('" + id + "', '"
//                        + nameSaucer + "', '"
//                        + costSaucer + "', '"
//                        + qualification + "', '"
//                        + tiket + "')";
//                Statement stA = con1.createStatement();
//                stA.executeUpdate(sqlA);
//
//                pu = new Purchase(id, nameSaucer, costSaucer, qualification, tiket);
//            }
//            //st.close();
//            con1.close();
//            return pu;
//        }    catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al registrar...");
//            return null;
//        }
//    }
    
public List<Menu> listMenu(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM menu";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String idMenu = rs.getString("idMenu");
                String nameMenu = rs.getString("nameMenu");

                Menu me =  new Menu(idMenu, nameMenu);
                listMenu.add(me);
            }
            st.close();
            return listMenu;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }


    public List<Client> listClient(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM cliente";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String idCliente = rs.getString("idCliente");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String telephone = rs.getString("telephone");
                String mail = rs.getString("mail");

                Client cl =  new Client(idCliente, firstname, lastname, telephone, mail);
                listClient.add(cl);
            }
            st.close();
            return listClient;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public List<Saucer> listSaucer(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM saucer";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String idSaucer = rs.getString("idSaucer");
                String nameSaucer = rs.getString("nameSaucer");
                float costSaucer = rs.getFloat("costSaucer");
                int qualification = rs.getInt("qualification");

                Saucer sa =  new Saucer(idSaucer, nameSaucer, costSaucer, qualification);
                listSaucer.add(sa);
            }
            st.close();
            return listSaucer;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }

    // función para la consulta de lista de usuarios
    public List<User> listUser(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM user";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String nameUser = rs.getString("nameUser");
                String passUser = rs.getString("passUser");
                String typeUser = rs.getString("typeUser");

                User us =  new User(nameUser, passUser, typeUser);
                listUser.add(us);
            }
            st.close();
            return listUser;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public List<User> listUserAdmin(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM user WHERE typeUser= 'admin'";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String nameUser = rs.getString("nameUser");
                String passUser = rs.getString("passUser");
                String typeUser = rs.getString("typeUser");

                User us =  new User(nameUser, passUser, typeUser);
                listUser.add(us);
            }
            st.close();
            return listUser;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public List<User> listUserEmployee(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM user WHERE typeUser= 'employee'";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String nameUser = rs.getString("nameUser");
                String passUser = rs.getString("passUser");
                String typeUser = rs.getString("typeUser");

                User us =  new User(nameUser, passUser, typeUser);
                listUser.add(us);
            }
            st.close();
            return listUser;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public Menu getMenu(String nameMenu)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetMenu + "nameMenu= '" + nameMenu+ "'";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);

                Menu me = null;
                while(rs.next()){
                    me = new Menu(rs.getString("idMenu"), nameMenu);
                }
                con1.close();
                return me;
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar...");
                return null;
        }
    }
    
    // función para generar consulta de un usuario
    public User getUser(String nameUser)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetUser + "nameUser= '" + nameUser+ "'";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);

                User u = null;
                while(rs.next()){
                    u = new User(nameUser, rs.getString("passUser"), rs.getString("typeUser"));
                }
                con1.close();
                return u;
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar...");
                return null;
        }
    }

    public Saucer getSaucer(String nameSaucer)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetSaucer + "nameSaucer= '" + nameSaucer+ "'";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);

                Saucer sa = null;
                while(rs.next()){
                    sa = new Saucer(rs.getString("idSaucer"), nameSaucer, 
                            rs.getFloat("costSaucer"), 
                            rs.getInt("qualification"));
                }
                con1.close();
                return sa;
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar...");
                return null;
        }
    }
    
    public String getSaucerCost(String nameSaucer)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetSaucer + "nameSaucer= '" + nameSaucer+ "'";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);
                Saucer sa = null;
                while(rs.next()){
                    sa = new Saucer(rs.getString("idSaucer"), nameSaucer, 
                            rs.getFloat("costSaucer"), 
                            rs.getInt("qualification"));
                    return rs.getString("costSaucer");
                }
                con1.close();
                return "SAUCER FAILURE...";
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar...");
                return null;
        }
    }
    
    public Client getCliente(String firstname, String lastname)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetClient + "(firstname= '" + firstname + "' "
                    + "and lastname= '" + lastname + "')";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);

                Client cl = null;
                while(rs.next()){
                    cl = new Client(rs.getString("idCliente"), firstname, 
                            lastname, rs.getString("telephone"), 
                            rs.getString("mail"));
                }
                con1.close();
                return cl;
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar...");
                return null;
        }
    }
    
    public Menu setMenu(String idMenu, String nameMenu)
    {
        Connection con = conexion.getConnection();
        Statement st;
        //System.out.println("+++");
        String sql = sqlIncerMenu
                + "VALUES ('" + idMenu + "', '"
                + nameMenu + "')";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            Menu me = new Menu(idMenu, nameMenu);
            return me;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
    public User setUserOBJ(User user)
    {
        Connection con = conexion.getConnection();
        Statement st;
        //System.out.println("+++");
        String sql = sqlIncerUser
                + "VALUES ('" + user.getUsername() + "', '"
                + user.getPassword() + "', '"
                + user.getType() + "')";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            return user;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
    public User setUser(String nameUser, String passUser, String typeUser)
    {
        Connection con = conexion.getConnection();
        Statement st;
        //System.out.println("+++");
        String sql = sqlIncerUser
                + "VALUES ('" + nameUser + "', '"
                + passUser + "', '"
                + typeUser + "')";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            User u = new User(nameUser, passUser, typeUser);
            return u;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
    public Saucer setSaucer(String idSaucer, String nameSaucer, 
            float costSaucer)
    {
        Connection con = conexion.getConnection();
        Statement st;
        String sql = sqlIncerSaucer
                + "VALUES ('" + idSaucer + "', '"
                + "B01', '"
                + nameSaucer + "', '"
                + costSaucer + "', '"
                + "8')";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            Saucer s = new Saucer(idSaucer, nameSaucer, costSaucer);
            return s;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
    public Client setClient(String idClient, String firstname, 
            String lastname, String telephone, String mail)
    {
        Connection con = conexion.getConnection();
        Statement st;
        String sql = sqlIncerClient
                + "VALUES ('" + idClient + "', '"
                + firstname + "', '"
                + lastname + "', '"
                + telephone + "', '"
                + mail + "')";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            Client cl = new Client(idClient, firstname, lastname, telephone, mail);
            return cl;
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar...");
            return null;
        }
    }
    
}
