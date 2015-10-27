package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This interface represents a contract for a DAO for the {@link Member} model.
 * Note that all methods which returns the {@link Member} from the DB, 
 * will not fill the model with the password, due to security reasons.
 * 
 * @author Irini
 */
public class MemberDAO
{
     private static int idCounter = 0;
     
    /**ready
     * Returns the member from the database matching the given ID, otherwise null.
     * @param id The ID of the member to be returned.
     * @return The member from the database matching the given ID, otherwise null.
     */
    public static Member findMember(Connection connection,int id) throws SQLException, Exception
    {
        String query = "SELECT * FROM Members WHERE id ="+ id ;
        
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        System.out.println("---------MEMBERS TABLE RESULTS (findMember me id) ----------------");
        Member m = new Member();
        
        while(rs.next())
        {
            System.out.println("[" + rs.getInt("id") + ","+rs.getInt("age") + "," + rs.getString("country") 
                + "," + rs.getString("typemember") + "," +rs.getString("email") + "," + rs.getString("password")
                + "," + rs.getString("firstname") + "," + rs.getString("lastname") +","+ rs.getString("date")+","
                + rs.getString("starsDegree")+ "]");
            try{
                    m.setEmail(rs.getString("email"));
                    m.setFirstname(rs.getString("firstname"));
                    m.setLastname(rs.getString("lastname"));
                    m.setPassword(rs.getString("password"));
                    m.setStarsDegree(rs.getInt("starsDegree"));
                    m.setAge(rs.getInt("age"));
                    m.setId(rs.getInt("id"));
                    m.setCountry(rs.getString("country"));
                    m.setTypeMember(rs.getString("typemember"));
                    m.setDate(new Date());
                    //edo ftiaxno ta lists
                    m.setProductsBuyed(dbSelectProductsBuyedTable(connection,rs.getInt("id")));
                    m.setProductsOffered(dbSelectProductsOfferedTable(connection,rs.getInt("id")));
                    m.setProductsWanted(dbSelectProductsWantedTable(connection,rs.getInt("id")));
                    m.setSubscribers(dbSelectSubscribersTable(connection,rs.getInt("id")));
                    
                }
                catch(Exception e){
                    throw e;
                }
        }
        System.out.println("---------TABLE RESULTS----------------");
        stmnt.close();
        rs.close();
        
        return m;
    }

    
    /**routine returns the member with password and email values from the database
     * 
     * @param connection
     * @param email
     * @param password
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public static Member findMember(Connection connection,String email,String password) throws SQLException, Exception
    {
        String query = "SELECT * FROM Members WHERE email ='"+ email + "' AND password ='"+password+"'";
        Statement stmnt = connection.createStatement();        
        ResultSet rs = stmnt.executeQuery(query);        
        Member m = new Member();
        int i = 0;
        
        System.out.println("---------MEMBERS TABLE RESULTS (findMember me mail k pass)----------------");
        while(rs.next())
        {
            System.out.println("[" + rs.getInt("id") + ","+rs.getInt("age") + "," + rs.getString("country") 
                                + "," + rs.getString("typemember") + "," +rs.getString("email") + "," + rs.getString("password")
                                + "," + rs.getString("firstname") + "," + rs.getString("lastname") +","+ rs.getString("date")+","
                                + rs.getString("starsDegree")+ "]");
            try
            {
                    m.setEmail(rs.getString("email"));
                    m.setFirstname(rs.getString("firstname"));
                    m.setLastname(rs.getString("lastname"));
                    m.setPassword(rs.getString("password"));
                    m.setStarsDegree(rs.getInt("starsDegree"));
                    m.setAge(rs.getInt("age"));
                    m.setId(rs.getInt("id"));
                    m.setCountry(rs.getString("country"));
                    m.setTypeMember(rs.getString("typemember"));
                    m.setDate(new Date());
                    //edo ftiaxno ta lists
                    m.setProductsBuyed(dbSelectProductsBuyedTable(connection,rs.getInt("id")));
                    m.setProductsOffered(dbSelectProductsOfferedTable(connection,rs.getInt("id")));
                    m.setProductsWanted(dbSelectProductsWantedTable(connection,rs.getInt("id")));
                    m.setSubscribers(dbSelectSubscribersTable(connection,rs.getInt("id")));
                    i++;
            }
            catch(Exception e)
            {
                throw e;
            }
        }
        System.out.println("---------MEMBER TABLE RESULTS----------------");
        stmnt.close();
        rs.close();
        
        if(i == 0)
            return null;
        else
            return m;
    }
    
    
    /**routine returns the subscribers list of the member with id id
     * <br> preconditions : 
     * <br> postconditions : liked list of the subscribers is returned
     * @param connection
     * @param id
     * @return
     * @throws SQLException 
     */
    public static LinkedList dbSelectSubscribersTable(Connection connection ,int id) throws SQLException{
        String query = "SELECT * FROM Subscribers WHERE subscriberid =" + id;
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        LinkedList l = new LinkedList();
        int temp;
        
        System.out.println("---------SUBSCRIBERS TABLE----------------");
        System.out.println("[subscriberid , memberid]");
        while(rs.next()){
            temp = rs.getInt("memberid");
            System.out.println("[" + temp + ",\t\t" + rs.getString("subscriberid") + "\t]");
            l.add(temp);
        }

        System.out.println("---------TABLE----------------");
        stmnt.close();
        rs.close();
        
        return l;
    }
    
    
    /**routine returns the products offered list of the member with id id
     * <br> preconditions :
     * <br> postconditions : linked list of the productsoffered is returned
     * @param connection
     * @param id
     * @return
     * @throws SQLException 
     */
    public static LinkedList dbSelectProductsOfferedTable(Connection connection, int id) throws SQLException
    {
        String query = "SELECT * FROM ProductsOffered WHERE productid=" + id;
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        LinkedList l = new LinkedList();
        int temp;
        
        System.out.println("---------ProductsOffered TABLE----------------");
        System.out.println("[productid , productsofferedid]");
        
        while(rs.next())
        {
            temp = rs.getInt("productid");
            System.out.println("[" + temp + ",\t\t" + rs.getString("productsofferedid") + "\t]");
            l.add(temp);
        }

        System.out.println("---------TABLE----------------");
        stmnt.close();
        rs.close();
        return l;
    }
    
    
    /**routine returns the products buyed list of the member with id id
     * <br> preconditions :
     * <br> postconditions : linked list of the productsbuyed is returned
     * @param connection
     * @return
     * @throws SQLException 
     */
    public static LinkedList dbSelectProductsBuyedTable(Connection connection, int id) throws SQLException{
        String query = "SELECT * FROM ProductsBuyed WHERE productid=" + id;
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        LinkedList l = new LinkedList();
        int temp;
        
        System.out.println("---------ProductsBuyed TABLE----------------");
        System.out.println("[productid , productsbuyedid]");
        while(rs.next()){
            temp =  rs.getInt("productid");
            System.out.println("[" + temp + ",\t\t" + rs.getString("productsbuyedid") + "\t]");
            l.add(temp);
        }

        System.out.println("---------TABLE----------------");
        stmnt.close();
        rs.close();
        return l;
    }
    
    
    /**routine returns the products wanted list of the member with id id
     * <br> preconditions :
     * <br> postconditions : linked list of the products wanted is returned
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static LinkedList dbSelectProductsWantedTable(Connection connection,int id) throws SQLException{
        String query = "SELECT * FROM ProductsWanted WHERE productid=" + id;
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        LinkedList l = new LinkedList();
        int temp;
        
        System.out.println("---------ProductsWanted TABLE----------------");
        System.out.println("[productid , productswantedid]");
        while(rs.next()){
            temp = rs.getInt("productid");
            System.out.println("[" + temp + ",\t\t" + rs.getString("productswantedid") + "\t]");
            l.add(temp);
        }

        System.out.println("---------TABLE----------------");
        stmnt.close();
        rs.close();
        return l;
    }

    /**
     * Returns a list of all members from the database ordered by member ID. 
     * The list is never null and is empty when the database does not contain any member.
     * @return A list of all members from the database ordered by member ID.
     */
    public LinkedList<Member> showMembersList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Create the given member in the database. 
     * The member ID must be null, otherwise it will throw
     * IllegalArgumentException. 
     * After creating, the DAO will set the obtained ID in the given member.
     * @param member The member to be created in the database.
     * @throws IllegalArgumentException If the member ID is not null
     */
    public static void createMember(Connection connection, Member member) throws IllegalArgumentException{
        try 
        {
            dbInsertTable(connection,member.getId(),member.getAge(),member.getCountry(),member.getTypeMember(),member.getEmail()
                    ,member.getPassword(),member.getFirstname(),member.getLastname(),new Date(),member.getStarsDegree(),member.getSubscribers(),
                    member.getProductsOffered(),member.getProductsBuyed(),member.getProductsWanted());
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**routine creates entry in all member table related tables about member member
     * <br> preconditions :
     * <br> postconditions : a new entry is created in all member related tables about member
     * @param connection
     * @param id
     * @param age
     * @param country
     * @param typemember
     * @param email
     * @param password
     * @param firstname
     * @param lastname
     * @param date
     * @param starsDegree
     * @param subscribers
     * @param productsoffered
     * @param productsbuyed
     * @param productswanted
     * @throws SQLException 
     */
    public static void dbInsertTable(Connection connection,int id,int age,String country,String typemember,String email,
        String password,String firstname,String lastname,Date date,int starsDegree,LinkedList subscribers,LinkedList productsoffered,
        LinkedList productsbuyed , LinkedList productswanted) throws SQLException
    {
        idCounter++;
        Statement stmnt = connection.createStatement();
        String query = "INSERT INTO Members (id, age, country,typemember,email,password,firstname,lastname,date,starsDegree)"
             + "VALUES ("+ idCounter +"," + age + ", '" + country + "','" + typemember + "','" + email + "','" + password + 
             "','" + firstname + "','" + lastname + "','" + date.toString() + "'," + starsDegree + ")" ;

        int rs = stmnt.executeUpdate(query);
        System.out.println("INSERT db complete!");
        stmnt.close();

        dbInsertSubscribersTable(connection , id , subscribers);
        dbInsertProductsOfferedTable(connection , id, productsoffered);
        dbInsertProductsBuyedTable(connection , id, productsbuyed);
        dbInsertProductsWantedTable(connection , id, productswanted);
    }
    
    
    /**routine inserts an entry to the subscribers table
     * <br> preconditions :
     * <br> postconditions : a new entry is created in subscribers table
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertSubscribersTable(Connection connection,int id , LinkedList l) throws SQLException{
        int rs,a;
        Statement stmnt = connection.createStatement();
        Integer i;
        
        while(!l.isEmpty()){
            i = (Integer) l.getFirst();
            String query = "INSERT INTO Subscribers (memberid , subscriberid) VALUES(" + i.intValue() + "," + id + ")";
            l.removeFirst();
            rs = stmnt.executeUpdate(query);
            System.out.println("INSERT subscribers db complete!");
        }
        stmnt.close();
    }
    
    
    /**routine inserts a new entry in products offered table
     * <br> preconditions :
     * <br> postconditions : a new entry if created in products offred table
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertProductsOfferedTable(Connection connection,int id , LinkedList l) throws SQLException{
        int rs;
        Statement stmnt = connection.createStatement();
        Integer i;
        
        while(!l.isEmpty()){
            i = (Integer) l.getFirst();
            String query = "INSERT INTO ProductsOffered (productid , productsofferedid) VALUES(" + i.intValue() + "," + id + ")";
            l.removeFirst();
            rs = stmnt.executeUpdate(query);
            System.out.println("INSERT ProductsOffered db complete!");
        }
        stmnt.close();
    }
    
    
    /**routine creates a new entry on products buyed table
     * <br> preconditions :
     * <br> postconditions : new entry is inserted to productsbuyed table
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertProductsBuyedTable(Connection connection,int id , LinkedList l) throws SQLException{
        int rs;
        Statement stmnt = connection.createStatement();
        Integer i;
        while(!l.isEmpty()){
            i = (Integer) l.getFirst();
            String query = "INSERT INTO ProductsBuyed (productid , productsbuyedid) VALUES(" + i.intValue() + "," + id + ")";
            l.removeFirst();
            rs = stmnt.executeUpdate(query);
            System.out.println("INSERT Productsbuyed db complete!");
        }
        stmnt.close();
    }
    /**routine creates a new entry on the productswanted table
     * <br> preconditions :
     * <br> postconditions : a new entry is created in productswanted table
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertProductsWantedTable(Connection connection,int id , LinkedList l) throws SQLException
    {
        int rs;
        Statement stmnt = connection.createStatement();
        Integer i;
        while(!l.isEmpty()){
            i = (Integer) l.getFirst();
            String query = "INSERT INTO ProductsWanted (productid , productswantedid) VALUES(" + i.intValue() + "," + id + ")";
            l.removeFirst();
            rs = stmnt.executeUpdate(query);
            System.out.println("INSERT Productswanted db complete!");
        }
        stmnt.close();
    }
    
    /**
     * Update the given member in the database. 
     * The member ID must not be null, otherwise it will throw
     * IllegalArgumentException. 
     * 
     * Note: the password will NOT be updated. Use changePassword() instead.
     * 
     * @param member The member to be updated in the database.
     * @throws IllegalArgumentException If the member ID is null.
     */
    public void updateMember(Member member) throws IllegalArgumentException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Delete the given member from the database. 
     * After deleting, the DAO will set the ID of the given
     * member to null.
     * @param member The member to be deleted from the database.
     */
    public static void deleteMember(Connection connection , Member member)
    {
        try 
        {
            dbDeleteEntry(connection, member.getId());
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**routine deletes the entry with id value id
     * <br> preconditions : 
     * <br> postconditions : entry with id value id is removed from alla the member related databases
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteEntry(Connection connection,int id) throws SQLException{
            
            String query = "DELETE FROM Members WHERE id=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete member table completed! rs = " + rs);
            dbDeleteSubscribersEntry(connection , id);
            dbDeleteProductsOfferedEntry(connection , id);
            dbDeleteProductsBuyedEntry(connection , id);
            dbDeleteProductsWantedEntry(connection , id);
    }
    
    
    /**routine routine removes the entry with id and subscriber id values from the subscribers table
     * <br> preconditions :
     * <br> postconditions : routine routine removes the entry with id and subscriber id values from the subscribers table id found
     * @param connection
     * @param id
     * @param subscriberid
     * @throws SQLException 
     */
    public static void dbDeleteSubscribersEntry(Connection connection,int id,int subscriberid) throws SQLException{
            
            String query = "DELETE FROM Subscribers WHERE memberid=" + subscriberid + " AND subscriberid=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete completed subscribers table! rs = " + rs);
    }
    
    
    /**routine removes the entry with values id and productsofferedid from the productsoffered table
     *<br> preconditions :
     *<br> postconditions : *routine removes the entry with values id and productsofferedid from the productsoffered table if found
     * @param connection
     * @param id
     * @param productsofferedid
     * @throws SQLException 
     */
    public static void dbDeleteProductsOfferedEntry(Connection connection,int id,int productsofferedid) throws SQLException{
            
            String query = "DELETE FROM ProductsOffered WHERE productid=" + productsofferedid + " AND productsofferedid=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete completed productsoffered table! rs = " + rs);
        }
    
    
    /**routine removes the entry with id and productsbuyedid from the productsbuyed table
     * <br> preconditions :
     * <br> postconditions : routine removes the entry with id and productsbuyedid from the productsbuyed table if found
     * @param connection
     * @param id
     * @param productsofferedid
     * @throws SQLException 
     */
    public static void dbDeleteProductsBuyedEntry(Connection connection,int id,int productsofferedid) throws SQLException{

        String query = "DELETE FROM ProductsBuyed WHERE productid=" + productsofferedid + " AND productsbuyedid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed productsbuyed table! rs = " + rs);
    }
   
    
    /**routine removes the entry with id and productswanted values from the productswanted table 
     * <br> preconditions :
     * <br> postconditions : routine removes the entry with id and productswanted values from the productswanted table  if found
     * @param connection
     * @param id
     * @param productsofferedid
     * @throws SQLException 
     */
    public static void dbDeleteProductsWantedEntry(Connection connection,int id,int productsofferedid) throws SQLException{

        String query = "DELETE FROM ProductsWanted WHERE productid=" + productsofferedid + " AND productswantedid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed productswanted table! rs = " + rs);
    }
    /**routine removes the entry with id value from the subscribers table
     * <br> preconditions : 
     * <br> postconditions : routine removes the entry with id value from the subscribers table if found
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteSubscribersEntry(Connection connection,int id) throws SQLException{
        String query = "DELETE FROM Subscribers WHERE subscriberid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed subscribers table! rs = " + rs);
    }
    /**routine removes the entry with id value from the products offeredid table
     * <br> preconditions :
     * <br> postconditions : routine removes the entry with id value from the products offeredid table if found
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteProductsOfferedEntry(Connection connection,int id) throws SQLException{
        String query = "DELETE FROM ProductsOffered WHERE productsofferedid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed productsofferedid table! rs = " + rs);
    }
    
    /**routine removes the entry with id value from the productsbuyed table
     * <br> preconditions : 
     * <br> postconditions : routine removes the entry with id value from the productsbuyed table if found
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteProductsBuyedEntry(Connection connection,int id) throws SQLException{
        String query = "DELETE FROM ProductsBuyed WHERE productsbuyedid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed productsbuyed table! rs = " + rs);
    }
   
    
    /**routine removes the entry with id value from the products wanted table
     * <br> preconditions : 
     * <br> postconditions : routine removes the entry with id value from the products wanted table if found
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteProductsWantedEntry(Connection connection,int id) throws SQLException{
        String query = "DELETE FROM ProductsWanted WHERE productswantedid=" + id + "";
        Statement stmnt = connection.createStatement();
        int rs = stmnt.executeUpdate(query);
        stmnt.close();
        System.out.println("delete completed productswanted table! rs = " + rs);
    }
    
    
    /**
     * Returns true if the given email address exist in the database.
     * @param email The email address which is to be checked in the database.
     * @return True if the given email address exist in the database.
     */
    public static boolean existEmail(Connection connection , String email) throws SQLException{
        String query = "SELECT * FROM Members WHERE email ='"+ email + "'";
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery(query);
        int i = 0;

        while(rs.next())
            i++;

        stmnt.close();
        rs.close();

        if(i==0){
            System.out.println("ENTRY NOT FOUND!!");
            return false;
        }
        else
        {
            System.out.println("ENTRY EXISTS!!");
            return true;
        }
    }

    /**
     * Change the password of the given member. 
     * The member ID must not be null, otherwise it will throw
     * IllegalArgumentException.
     * @param member The member to change the password for.
     * @throws IllegalArgumentException If the member ID is null.
     */
    public void changePassword(Member member){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**routine creates the members table , subscribers table, products wanted table , products offered table, products buyed table
     * <br> preconditions : 
     * <br> postconditions : 
     * @param connection 
     */
    public static void dbCreateTable(Connection connection){
            //creation of members table
            try
            {
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE Members("
                            + "id int,age int,country varchar(255),typemember varchar(255),email varchar(255),password varchar(255),"
                            + "firstname varchar(255),lastname varchar(255),date varchar(255),starsDegree int,stid int)";

                int resultSet = stmnt.executeUpdate(query);
                System.out.println("eftiaksa to Member table!"+resultSet);;
                stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'MEMBERS' already exists"))
                    e.printStackTrace();
            }
            //creation of subscribers table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE Subscribers(memberid int , subscriberid int)";
                int resultSet = stmnt.executeUpdate(query);
                System.out.println("eftiaksa to Subscribers table!"+resultSet);
                stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'SUBSCRIBERS' already exists"))
                    e.printStackTrace();
            }
            //creation of products offered table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE ProductsOffered(productid int , productsofferedid int)";
                int resultSet = stmnt.executeUpdate(query);
                System.out.println("eftiaksa to ProductsOffered table!"+resultSet);
                stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'PRODUCTSOFFERED' already exists"))
                    e.printStackTrace();
            }
            //creation of products buyed table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE ProductsBuyed(productid int , productsbuyedid int)";
                int resultSet = stmnt.executeUpdate(query);
                System.out.println("eftiaksa to Productsbuyed table!"+resultSet);
                stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'PRODUCTSBUYED' already exists"))
                    e.printStackTrace();
            }
            //creation of products wanted table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE ProductsWanted(productid int , productswantedid int)";
                int resultSet = stmnt.executeUpdate(query);
                System.out.println("eftiaksa to Productswanted table!"+resultSet);
                stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'PRODUCTSWANTED' already exists"))
                    e.printStackTrace();
            }
            
        }
    /**routine deletes the data from all table related to member 
     * <br> preconditions : 
     * <br> postconditions : all tables data related to member table are deleted
     * @param connection
     * @throws SQLException 
     */
    public static void dbDeleteTableData(Connection connection) throws SQLException{
            Statement stmnt = connection.createStatement();
            String query = "TRUNCATE TABLE Members";
            String query1 = "TRUNCATE TABLE Subscribers";
            String query2 = "TRUNCATE TABLE ProductsOffered";
            String query3 = "TRUNCATE TABLE ProductsBuyed";
            String query4 = "TRUNCATE TABLE ProductsWanted";
            stmnt.executeUpdate(query);
            stmnt.executeUpdate(query1);
            stmnt.executeUpdate(query2);
            stmnt.executeUpdate(query3);
            stmnt.executeUpdate(query4);
            stmnt.close();
            System.out.println("dbDeleteData complete!");
   }
    
}