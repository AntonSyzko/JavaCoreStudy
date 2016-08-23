package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 18.07.2016.
 */
public class CreateStatement {

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/prog";
        String username = "root";
        String pass = "12345";
        Connection conn = null;
        Statement st = null;

        try{
            conn = DriverManager.getConnection(url,username,pass);
            st = conn.createStatement();
            String sqlQuery = "CREATE TABLE Employee44("+
                                "ID INT NOT NULL, "+
                                "FIRST_NAME VARCHAR(20), "+
                                "SURNAME VARCHAR(20), "+
                                "DESIGNATION VARCHAR(20))";

            int i = st.executeUpdate(sqlQuery);

            if(i==0){
                System.out.println(" table employee44 was created");
            }else{
                System.out.println(" no table was created");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(st!=null)
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try{
                if(conn!=null)
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
