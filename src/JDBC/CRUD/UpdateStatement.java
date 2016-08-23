package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 18.07.2016.
 */
public class UpdateStatement {

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/prog";
        String user = "root";
        String pass = "12345";

        Connection conn = null;
        Statement st = null;

        try{
            conn = DriverManager.getConnection(url,user,pass);
            st = conn.createStatement();
            String query = "UPDATE Employee44 SET FIRST_NAME ='ALEX' ,SURNAME ='SOTH' "+
                           " WHERE ID=1";
            int i = st.executeUpdate(query);
            if(i !=0){
                System.out.println(" row was affected by update query ");
            }else{
                System.out.println(" no row was affected ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try{
                if(conn !=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
    }
