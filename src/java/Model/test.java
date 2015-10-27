/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author lefas
 */


public class test 
{
    public static void main(String[] args) 
    {
        DB db = new DB();
        
        Connection conn = db.dbConnect("jdbc:jtds:sqlserver://localhost:8080/tempdb","sa","");
       // db.createTables(conn);
    }
}

class DB
{
    public DB() {}

    public Connection dbConnect(String db_connect_string,
  String db_userid, String db_password)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
    db_connect_string, db_userid, db_password);
            System.out.println("connected");
            return conn;
            
        }
        catch (Exception e)
        {
            System.out.println("mpika edo!");
            e.printStackTrace();
            return null;
        }
    }

    public void createTables(Connection conn)
    {
        String query;
        Statement stmt;
        
        try
        {
                query = "create table cust_profile " +
                        "(name varchar(32), " +
                        "address1 varchar(50), " +
                        "city varchar(50), " +
                        "state varchar(50), " +
                        "country varchar(50))";
                stmt = conn.createStatement();
                stmt.executeUpdate(query);
                stmt.close();
                conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
};