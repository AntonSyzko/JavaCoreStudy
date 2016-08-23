package JDBC;

import java.sql.*;

/**
 * Created by Admin on 19.07.2016.
 */
public class PreparedStmtOpeartions {
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
        PreparedStatement prepstmn = null;

        try{
            conn = DriverManager.getConnection(url,username,pass);
            prepstmn = conn.prepareStatement("INSERT INTO Employee44 VALUES (?,?,?,?)");

            for(int i = 0; i<10; i++){
                prepstmn.setInt(1,i);
                prepstmn.setString(2,"empl_name"+i);
                prepstmn.setString(3,"empl_surname"+i);
                prepstmn.setString(4,"empl_designation"+i);

                int j = prepstmn.executeUpdate();
                if(j!=0){
                    System.out.println(" prepared statement has affected the row ");
                }else{
                    System.out.println(" no results ");
                }


            }

            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT * FROM Employee44");
            while (rs.next()){
                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("FIRST_NAME"));
                System.out.println(rs.getString("SURNAME"));
                System.out.println(rs.getString("DESIGNATION"));
            }


            prepstmn = conn.prepareStatement("UPDATE Employee44 SET FIRST_NAME=? WHERE ID=?");
            prepstmn.setString(1,"VASCO");
            prepstmn.setString(2,"1");
            int a = prepstmn.executeUpdate();
            if(a!=0){
                System.out.println(" updated");
            }else{
                System.out.println(" not updated ");
            }

            prepstmn = conn.prepareStatement("DELETE FROM Employee44 WHERE ID=?");
            prepstmn.setString(1,"1");
            int r = prepstmn.executeUpdate();
            if(r!=0){
                System.out.println(" deleted ");
            }else{
                System.out.println(" not deleted ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if(prepstmn!=null){
                    prepstmn.close();
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
