package JDBC.Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 20.07.2016.
 * CREATE OR REPLACE PROCEDURE P1 AS
 BEGIN
 INSERT INTO Employee44 VALUES(123, 'RAHUL', 'SHARMA', 'Musician');
 UPDATE Employee44 SET FIRST_NAME = 'KIRANKIRANKIRAN' WHERE ID = 123;
 END;
 */
public class CallableInProcedure {

    static
    {
        //STEP 1 : Registering The Driver Class

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Unable To Load The Driver class");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Connection con = null;

        CallableStatement cstmt = null;

        try
        {
            //Database Credentials

            String URL = "jdbc:mysql://localhost/prog";

            String username = "root";

            String password = "12345";

            //STEP 2 : Creating The Connection Object

            con = DriverManager.getConnection(URL, username, password);

            //STEP 3 : Creating The CallableStatement Object

            cstmt = con.prepareCall("{call P1}");

            //STEP 4 : Executing The CallableStatement

            cstmt.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
         finally
        {
            //STEP 5 : Closing The DB Resources

            //Closing the CallableStatement object

            try
            {
                if(cstmt!=null)
                {
                    cstmt.close();
                    cstmt=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

            //Closing the Connection object

            try
            {
                if(con!=null)
                {
                    con.close();
                    con=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}

