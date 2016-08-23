package JDBC;

import java.sql.*;

/**
 * Created by Admin on 20.07.2016.
 */
public class ResultSetMetaDataExampla {
    static {


        try {
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
             ResultSetMetaData rsmeta = rs.getMetaData();
            int columnsRes = rsmeta.getColumnCount();
            System.out.println(" results in " + columnsRes + " columns ");
            for(int i = 0; i<columnsRes;i++){
                  String colName = rsmeta.getColumnName(i);
                  String colType = rsmeta.getColumnTypeName(i);
                System.out.println(" clumn " + colName + " is type of " + colType);

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
