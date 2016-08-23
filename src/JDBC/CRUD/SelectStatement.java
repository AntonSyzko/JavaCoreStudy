package JDBC.CRUD;

import java.sql.*;

/**
 * Created by Admin on 18.07.2016.
 */
public class SelectStatement {

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
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);
            st = conn.createStatement();
            String query = "SELECT * FROM Employee44";
            rs = st.executeQuery(query);
            if(rs.next() == false){
                System.out.println("empty set ");
            }
            while (rs.next()){

                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("FIRST_NAME"));
                System.out.println(rs.getString("SURNAME"));
                System.out.println(rs.getString("DESIGNATION"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try{
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try{
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
    }
