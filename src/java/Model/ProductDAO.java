package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 * A DAO class which does all the nasty JDBC work.
 * Connects Product class with database.
 * 
 * @author Irini
 */
                  
public class ProductDAO 
{
    public static int counterId=0;
    
     /**READY
     * Returns the product from the database matching the given ID, otherwise null.
     * @param id The ID of the product.
     * @return The product from the database matching the given ID, otherwise null.
     */
    public static Product findProduct(Connection connection , int id) throws SQLException{
            String query = "SELECT * FROM Products WHERE id ="+ id + "";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            System.out.println("---------TABLE RESULTS----------------");
            Product p = new Product();
            LinkedList multimedia , comments;

            while(rs.next())
            {
                System.out.println("[" + rs.getString("typeProduct") + ","+rs.getString("id") + "," + rs.getString("name") 
                        + "," + rs.getString("description") + "," +rs.getString("price") + "," + rs.getString("quantity")
                        + "," + rs.getString("state") + "," + rs.getString("category") +","+ rs.getString("starsDegree")+","
                        + rs.getString("views")+ "," + rs.getString("regdate")  +"]");
                
                try
                {
                    p.setCategory(rs.getString("category"));
                    p.setDescription(rs.getString("description"));
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setQuantity(rs.getInt("quantity"));
                    p.setStarsDegree(rs.getInt("starsDegree"));
                    p.setState(rs.getString("state"));//na tsekaro to exception pou petaei
                    p.setTypeProduct(rs.getString("typeProduct"));
                    p.setViews(rs.getInt("views"));
                    p.setDate(rs.getString("regdate"));
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("---------TABLE RESULTS----------------");
            stmnt.close();
            rs.close();
            
            multimedia = dbSelectMultimedia(connection , id);
            try 
            {
                p.setMultimedia(multimedia);
            } 
            catch (ProductInvalidMultimediaException ex) 
            {
                ex.printStackTrace();
            }
            
            comments = dbSelectComments(connection , id);
            try
            {
                p.setComments(comments);
            } 
            catch (ProductInvalidCommentsException ex) 
            {
                ex.printStackTrace();
            }
            
            return p;
    }
   
    /**READY
     * Returns the product from the database matching the given name, otherwise null.
     * @param name The name of the product.
     * @return The product from the database matching the given name, otherwise null.
     */
    public static Product findProduct(Connection connection , String name) throws SQLException
    {
            String query = "SELECT * FROM Products WHERE name ='"+ name + "'";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            System.out.println("---------PRODUCT RESULTS (findProduct me name) ----------------");
            Product p = new Product();
            LinkedList multimedia , comments;
            int id = 0;
            
            while(rs.next())
            {
                System.out.println("[" + rs.getString("typeProduct") + ","+rs.getString("id") + "," + rs.getString("name") 
                        + "," + rs.getString("description") + "," +rs.getString("price") + "," + rs.getString("quantity")
                        + "," + rs.getString("state") + "," + rs.getString("category") +","+ rs.getString("starsDegree")
                        +","  + rs.getString("views")+ "," + rs.getString("regdate")  +"]");
                
                try
                {
                    p.setCategory(rs.getString("category"));
                    p.setDescription(rs.getString("description"));
                    p.setId(rs.getInt("id"));
                    id = rs.getInt("id");
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setQuantity(rs.getInt("quantity"));
                    p.setStarsDegree(rs.getInt("starsDegree"));
                    p.setState(rs.getString("state"));//na tsekaro to exception pou petaei
                    p.setTypeProduct(rs.getString("typeProduct"));
                    p.setViews(rs.getInt("views"));
                    p.setDate(rs.getString("regdate"));
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("---------TABLE RESULTS----------------");
            stmnt.close();
            rs.close();
            
            multimedia = dbSelectMultimedia(connection , id);
            try 
            {
                p.setMultimedia(multimedia);
            } 
            catch (ProductInvalidMultimediaException ex) 
            {
                ex.printStackTrace();
            }
            
            comments = dbSelectComments(connection , id);
            try
            {
                p.setComments(comments);
            } 
            catch (ProductInvalidCommentsException ex) 
            {
                ex.printStackTrace();
            }
            
            return p;
    }
    
    /**routine returns a list with the multimedia items of products id
     * <br> preconditions :
     * <br> postconditions : 
     * @param connection
     * @param id
     * @return a list with the multimedia of the product with id id
     * @throws SQLException 
     */
    public static LinkedList dbSelectMultimedia(Connection connection , int id) throws SQLException{
            String query = "SELECT * FROM Multimedia WHERE multimediaid=" + id;
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            LinkedList multimedia = new LinkedList();
            String temp;
            
            System.out.println("---------MULTIMEDIA TABLE----------------");
            System.out.println("[multimedia , multimediaid]");
            while(rs.next()){
                temp = rs.getString("multimedia");
                multimedia.add(temp);
                System.out.println("[" + temp  + ",\t" + rs.getString("multimediaid") + "\t]");
            }
            
            System.out.println("---------TABLE----------------");
            stmnt.close();
            rs.close();
            
            return multimedia;
    }
    /**routine returns a list with the comments items of products id
     * <br> preconditions :
     * <br> postconditions : 
     * @param connection
     * @param id
     * @return a list with the comments of the product with id id
     * @throws SQLException 
     */
    public static LinkedList dbSelectComments(Connection connection , int id) throws SQLException{
            String query = "SELECT * FROM Comments WHERE commentid=" + id;
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            LinkedList comments = new LinkedList();
            Comment c ;
            
            System.out.println("---------COMMENTS TABLE----------------");
            System.out.println("[comment , memberid , commentid]");
            while(rs.next()){
                c = new Comment(rs.getInt("memberid") , rs.getString("comment"));
                comments.add(c);
                System.out.println("[" + rs.getString("comment")  + ",\t" + rs.getString("memberid") + "\t ," + rs.getString("commentid") + "]");
            }
            
            System.out.println("---------TABLE----------------");
            stmnt.close();
            rs.close();
            
            return comments;
    }

    /** AYTI PREPEI NA EXEI PAIXTEI LATHOS :P
     * Returns the product from the database matching the given memberID and productId, otherwise null.
     * @param memberID The ID of the member that sells this product.
     * @param productID The ID of the product to be sold.
     * @return The member from the database matching the given email and password, otherwise null.
     */
    public Product findProduct(Long memberID , Long productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    /** READY
     * Create the given product in the database. 
     * The product ID must be null, otherwise it will throw IllegalArgumentException. 
     * After creating, the DAO will set the obtained ID in the given member.
     * 
     * @param product The product to be created in the database.
     * @throws IllegalArgumentException If the member ID is not null
     */
    public static void createProduct(Connection connection,Product product) throws IllegalArgumentException{
        
        try{
            dbInsertTable(connection, product.getTypeProduct(),product.getId(),product.getName(),product.getDescription(),product.getPrice(),product.getQuantity(),
                    product.getState(),product.getCategory(),product.getStarsDegree(),product.getViews(),product.getMultimedia(),product.getDate(),product.getComments());
        }
        catch(Exception e){
            System.err.println("CREATE PRODUCT IN DAO");
            System.err.println(e.getMessage());
        }
    }
    
    
    /**routine inserts entries to Products table of the data base
     * <br> preconditions : 
     * <br> postconditions :
     * @param connection
     * @param typeProduct
     * @param id
     * @param name
     * @param description
     * @param price
     * @param quantity
     * @param state
     * @param category
     * @param starsDegree
     * @param views
     * @param multimedia
     * @param d
     * @param comments
     * @throws SQLException 
     */
    public static void dbInsertTable(Connection connection,String typeProduct,int id,String name,String description 
            , double price,int quantity,String state,String category,int starsDegree,int views,LinkedList multimedia,String date,LinkedList comments) throws SQLException
    {
        counterId++;
        Statement stmnt = connection.createStatement();
        String query = "INSERT INTO Products (typeProduct, id, name, description,price,quantity,state,category,starsDegree,views,regdate)"
                    + "VALUES ('"+ typeProduct +"'," + counterId + ", '" + name + "','" + description + "'," + price + "," + quantity + 
                    ",'" + state + "','" + category + "'," + starsDegree + "," + views + ",'" + date +"')" ;

        int rs = stmnt.executeUpdate(query);
        
        stmnt.close();
        dbInsertMultimediaTable(connection , counterId , multimedia);
        dbInsertCommentsTable(connection , counterId , comments);
        System.out.println("INSERT db complete!");
    }
    
    
    /**routine inserts entries to multimedia table of the database
     * <br> preconditions :
     * <br> postconditions :
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertMultimediaTable(Connection connection,int id , LinkedList l) throws SQLException{
            int rs;
            Statement stmnt = connection.createStatement();
            while(!l.isEmpty()){
                String query = "INSERT INTO Multimedia (multimedia , multimediaid) VALUES('" + (String)l.getFirst() + "'," + id + ")";
                l.removeFirst();
                rs = stmnt.executeUpdate(query);
                System.out.println("INSERT subscribers db complete!");
            }
            stmnt.close();
    }
    /**routine inserts entries to comments table of the database
     * <br> preconditions :
     * <br> postconditions :
     * @param connection
     * @param id
     * @param l
     * @throws SQLException 
     */
    public static void dbInsertCommentsTable(Connection connection,int id , LinkedList l) throws SQLException{
            int rs;
            Statement stmnt = connection.createStatement();
            while(!l.isEmpty()){
                Comment c = (Comment) l.getFirst();
                String query = "INSERT INTO Comments (comment , memberid , commentid) VALUES('" + c.getComment() + "'," + c.getMemberId() + "," + id + ")";
                l.removeFirst();
                rs = stmnt.executeUpdate(query);
                System.out.println("INSERT comments db complete!");
            }
            stmnt.close();
    }
    /**DEN KATALABA me to id to kano search kai kano set
     * Update the given product in the database. 
     * The product ID must not be null, otherwise it will throw IllegalArgumentException. 
     * 
     * Note: 
     * 
     * @param product The product to be updated in the database.
     * @throws IllegalArgumentException If the member ID is null.
     */
    public static void updateProduct(Connection connection , int id , int newquantity) throws SQLException {
        Statement stmnt = connection.createStatement();
        String query = "UPDATE Products SET quantity=" + newquantity + " WHERE id="+ id + "";
        
        int rs = stmnt.executeUpdate(query);
        System.out.println("UPDATE product db complete!");
        stmnt.close();
    }

    /** READY
     * Delete the given product from the database. 
     * After deleting, the DAO will set the ID of the given product to null.
     * 
     * @param product The product to be deleted from the database.
     */
    public static void deleteProduct(Connection connection , Product product){
        try{
            dbDeleteEntry(connection , product.getId());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    /**routine deletes the entry with id value id from the products table of the database
     * <br> preconditions :
     * <br> postconditions : 
     * @param connection
     * @param id
     * @throws SQLException 
     */
    public static void dbDeleteEntry(Connection connection,int id) throws SQLException{
            
            String query = "DELETE FROM Products WHERE id=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete products table completed! rs = " + rs);
            dbDeleteMultimedia(connection,id);
            dbDeleteComments(connection,id);
    }
    /**routine deletes the entry with id id from the multimedia table of the database
     * <br> preconditions :
     * <br> postconditions :
     * @param connection
     * @param id
     * @throws SQLException 
     */
     public static void dbDeleteMultimedia(Connection connection,int id) throws SQLException{
            
            String query = "DELETE FROM Multimedia WHERE multimediaid=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete multimedia table completed! rs = " + rs);
     }
     /**routine deletes the entry with id id from the comments table of the database
     * <br> preconditions :
     * <br> postconditions :
     * @param connection
     * @param id
     * @throws SQLException 
     */
     public static void dbDeleteComments(Connection connection,int id) throws SQLException{
            
            String query = "DELETE FROM Comments WHERE commentid=" + id + "";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete multimedia table completed! rs = " + rs);
     }
     /**routine deletes the entry with id id and multimidia multimedia values from the multimedia table of the database
      * 
      * @param connection
      * @param id
      * @param multimedia
      * @throws SQLException 
      */
     public static void dbDeleteMultimedia(Connection connection,int id,String multimedia) throws SQLException{
            String query = "DELETE FROM Multimedia WHERE multimediaid=" + id + ", AND multimedia='" + multimedia + "'";
            Statement stmnt = connection.createStatement();
            int rs = stmnt.executeUpdate(query);
            stmnt.close();
            System.out.println("delete multimedia table completed! rs = " + rs);
     }
     
    /**READY
     * Returns true if the given product exist in the database.
     * @param name The name which is to be checked in the database.
     * @return True if the given email address exist in the database.
     */
     public static boolean existsProduct(Connection connection , String name)
     {
        int i = 0;
        
        try
        {
            String query = "SELECT * FROM Products WHERE name ='"+ name + "'";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);

            while(rs.next())
                i++;

            stmnt.close();
            rs.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
     
     public static boolean existsProduct(Connection connection , int id){
        int i = 0;
        try{
            String query = "SELECT * FROM Products WHERE id ="+ id + "";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);

            while(rs.next())
                i++;
            stmnt.close();
            rs.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
    
    /**routine prints all the contents of the data base, and returns a list of all products of the Products table in database
     * <br> preconditions :
     * <br> postconditions : a list of all products ftom data base in products table is returned. check if list is empty
     * @param connection
     * @return a list of all products ftom data base in products table is returned.
     * @throws SQLException 
     */
     public static LinkedList dbSelectTable(Connection connection) throws SQLException{
            String query = "SELECT * FROM Products";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            Product p ;
            LinkedList l = new LinkedList();
            LinkedList l1 , l2; 
            
            System.out.println("---------PRODUCTS TABLE----------------");
            while(rs.next()){
                System.out.println("[" + rs.getString("typeProduct") + ","+rs.getString("id") + "," + rs.getString("name") 
                        + "," + rs.getString("description") + "," +rs.getString("price") + "," + rs.getString("quantity")
                        + "," + rs.getString("state") + "," + rs.getString("category") +","+ rs.getString("starsDegree")+","
                        + rs.getString("views")+ "," + rs.getString("regdate") + "]");
                try{
                    p = new Product();
                    p.setCategory(rs.getString("category"));
                    p.setDescription(rs.getString("description"));
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setQuantity(rs.getInt("quantity"));
                    p.setStarsDegree(rs.getInt("starsDegree"));
                    p.setState(rs.getString("state"));//na tsekaro to exception pou petaei
                    p.setTypeProduct(rs.getString("typeProduct"));
                    p.setViews(rs.getInt("views"));
                    p.setDate(rs.getString("regdate"));
                    l1 = dbSelectMultimedia(connection , rs.getInt("id"));
                    l2 = dbSelectComments(connection , rs.getInt("id"));
                    p.setMultimedia(l1);
                    
                    p.setComments(l2);
                    l.add(p);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
            System.out.println("---------TABLE----------------");
            stmnt.close();
            rs.close();
            
            return l;
     }
     /**routine returns a list of products from data base with typeproduct typeProduct value
      * <br> preconditions : 
      * <br> postconditions : linked list is returned
      * @param connection
      * @param typeProduct
      * @return
      * @throws SQLException 
      */
     public static LinkedList dbSelectTable(Connection connection,String typeProduct) throws SQLException{
            String query = "SELECT * FROM Products WHERE typeProduct='" + typeProduct + "'";
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            Product p ;
            LinkedList l = new LinkedList();
            LinkedList l1 , l2; 
            
            System.out.println("---------PRODUCTS TABLE----------------");
            while(rs.next()){
                System.out.println("[" + rs.getString("typeProduct") + ","+rs.getString("id") + "," + rs.getString("name") 
                        + "," + rs.getString("description") + "," +rs.getString("price") + "," + rs.getString("quantity")
                        + "," + rs.getString("state") + "," + rs.getString("category") +","+ rs.getString("starsDegree")+","
                        + rs.getString("views")+ "," + rs.getString("regdate") + "]");
                try{
                    p = new Product();
                    p.setCategory(rs.getString("category"));
                    p.setDescription(rs.getString("description"));
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getDouble("price"));
                    p.setQuantity(rs.getInt("quantity"));
                    p.setStarsDegree(rs.getInt("starsDegree"));
                    p.setState(rs.getString("state"));//na tsekaro to exception pou petaei
                    p.setTypeProduct(rs.getString("typeProduct"));
                    p.setViews(rs.getInt("views"));
                    p.setDate(rs.getString("regdate"));
                    l1 = dbSelectMultimedia(connection , rs.getInt("id"));
                    l2 = dbSelectComments(connection , rs.getInt("id"));
                    p.setComments(l2);
                    p.setMultimedia(l1);
                    l.add(p);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
            System.out.println("---------TABLE----------------");
            stmnt.close();
            rs.close();
            
            return l;
     }
     /**routine creates a table with name Products and typeProduct varchar(255),
         * id int,name varchar(255),description varchar(255),price int,
         * quantity int,state varchar(255),category varchar(255),starsDegree int,views int
         * as cols
         * <br> preconditions :
         * <br> postconditions : 
         * @param connection
         * @throws SQLException 
         */
        public static void dbCreateTable(Connection connection){
            //creation of Products table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE Products(typeProduct varchar(255),"
                            + "id int,name varchar(255),description varchar(255),price double,"
                            + "quantity int,state varchar(255),category varchar(255),starsDegree int,views int , regdate varchar(255))";

                    int resultSet = stmnt.executeUpdate(query);
                    System.out.println("eftiaksa to table!"+resultSet);
                    stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'PRODUCTS' already exists"))
                    e.printStackTrace();
            }
            //creation of Multimedia table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE Multimedia(multimedia varchar(255),multimediaid int)";

                    int resultSet = stmnt.executeUpdate(query);
                    System.out.println("eftiaksa to table!"+resultSet);
                    stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'MULTIMEDIA' already exists"))
                    e.printStackTrace();
            }
            //creation of Comments table
            try{
                Statement stmnt = connection.createStatement();
                String query = "CREATE TABLE Comments(comment varchar(255),memberid int,commentid int)";

                    int resultSet = stmnt.executeUpdate(query);
                    System.out.println("eftiaksa to table!"+resultSet);
                    stmnt.close();
            }
            catch(SQLException e){
                if(!e.getMessage().contains("'COMMENTS' already exists"))
                    e.printStackTrace();
            }
        }
        /**routine destroyes all data in the Products table of the database
         * <br> preconditions :
         * <br> postconditions :
         * @param connection
         * @throws SQLException 
         */
        public static void dbDeleteTableData(Connection connection) throws SQLException{
            Statement stmnt = connection.createStatement();
            String query = "TRUNCATE TABLE Products";
            String query1 = "TRUNCATE TABLE Multimedia";
            String query2 = "DROP TABLE Products";
            String query3 = "DROP TABLE Multimedia";
            String query4 = "TRUNCATE TABLE Comments";
            String query5 = "DROP TABLE Comments";
            stmnt.executeUpdate(query);
            stmnt.executeUpdate(query1);
            stmnt.executeUpdate(query4);
            //stmnt.executeUpdate(query2);
            //stmnt.executeUpdate(query3);
            //stmnt.executeUpdate(query5);
            stmnt.close();
            System.out.println("dbDeleteData complete!");
        }
        
}
