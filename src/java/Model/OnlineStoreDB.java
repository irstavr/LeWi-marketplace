/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lefas
 */
public class OnlineStoreDB {
    
    private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String connectionURL = "jdbc:derby:";
    private static String dbName = "OnlineStoreDB";
    
    
    /**accesor method : routine loads the JDBC driver for the derby data base
     * <br> preconditions : 
     * <br> postconditions : loads apache derby JDBC driver
     * @throws ClassNotFoundException 
     */
    public static void loadJDBCDriver() throws ClassNotFoundException{
        try {   
                Class.forName(OnlineStoreDB.driver);
        } 
        catch (ClassNotFoundException e) {

                System.out.println("Where is your derby JDBC Driver?");
                System.err.println("ERROR msg : " + e.getMessage());
                throw e; 
        }
        System.out.println("derby JDBC Driver Registered!");
    }
    /**accesor method : routine establishes the connection with the derby data base. at first attemps to access the dbName data base
     * and if not found creates a data base with dbName and returns the Conection connection 
     * <br> preconditions : 
     * <br> postconditions : connection != null
     * @return the connection object of the data base with dbName or null if connection failed
     * @throws SQLException 
     */
    public static Connection makeConnection() throws SQLException{
        Connection connection = null;
                
        try {
                connection = DriverManager.getConnection(connectionURL + dbName +";","", "");
        } catch (SQLException e) {
                System.err.println("Connection Failed! Check output console,a try is attempted again!");
                if(e.getMessage().equals("Database '" + dbName +"' not found.")){
                    try {
                       connection = DriverManager.getConnection("jdbc:derby:"+dbName+";create=true","", "");
                    }
                    //ean petaxtei ayto to exception tote to prootho pros ta pano kai den iparxei sotiria gt den ksero pou brisketai to lathos sti sindesi
                    catch (SQLException ex){
                        System.out.println("Connection failed again! there is no hope!");
                        throw ex;
                    }
                }
        }
        
        //creation of tables
        ProductDAO.dbCreateTable(connection);
        MemberDAO.dbCreateTable(connection);
        
        if (connection != null) {
                System.out.println("You made it, take control your database now!");
                return connection;
        } else {
                System.err.println("Failed to make connection!");
                return null;
        }
    }
    /**transformer method : routine closes a connection
     * <br> preconditions : 
     * <br> postconditions : 
     * @param c
     * @throws SQLException 
     */
    public static void closeConnection(Connection c) throws SQLException{
        c.close();
    }
}
