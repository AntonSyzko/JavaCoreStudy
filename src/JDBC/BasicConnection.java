package JDBC;

import java.sql.*;

/**
 * Created by Admin on 15.07.2016.
 */
public class BasicConnection {


    static {


//
//        try {
//            String url = "jdbc:mysql://localhost/prog";
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection conn = DriverManager.getConnection(url, "root", "12345");
//        } catch (ClassNotFoundException e) {
//            System.out.println(" unable to load  driver ");
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//

    }


    public static void main(String[] args) {

        try{
            String url = "jdbc:mysql://localhost/prog";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, "root", "12345");
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM contacts");

            while (rs.next()){
                System.out.println(rs.getString(3));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




}
