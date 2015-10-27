package Model;
import java.util.LinkedList;

public class Product {
    
    private String typeProduct; //proion h' uphresia
    private int id;
    private String name;
    private String description;
    private double price; 
    private int quantity;   //mono gia proionta
    private String state;   //mono gia proionta
    private String category;    //kathgoria proiontos h' uphresias
    private LinkedList  multimedia; 
    private LinkedList comments;
    private int starsDegree;
    private int views;    
    private String date;
    
    /**constructor method : creates a new reference of a product object
     * with initialized attributes to default values
     * <br> preconditions : 
     * <br> postconditions : a new reference of a product object is created
     */
    public Product(){
        multimedia = new LinkedList();
        comments = new LinkedList();
    }
    
    
    /**tranformer method : routine sets id attribute of this Product
     * object to aLong
     * <br> preconditions : aLong >= 0
     * <br> postconditions : 
     * @param aLong
     * @throws ProductInvalidIdException 
     */
    public void setId(int aLong) throws ProductInvalidIdException {
        if(aLong < 0)
            throw new ProductInvalidIdException();
        this.id = aLong;
    }
    
    /**tranformer method : routine sets date attribute of this Product
     * object to d
     * <br> preconditions : date != null
     * <br> postconditions : 
     * @param d 
     * @throws ProductInvalidDateException
     */
    public void setDate(String d) throws ProductInvalidDateException{
        if(d == null)
            throw new ProductInvalidDateException();
        this.date = d;
    }
    /**tranformer method : routine sets name attribute of this Product
     * object to string
     * <br> preconditions : name != null
     * <br> postconditions :
     * @param string
     * @throws ProductInvalidNameException 
     */
    public void setName(String string) throws ProductInvalidNameException {
        if(string == null)
            throw new ProductInvalidNameException();
        this.name = string;
    }
    /**tranformer method : routine sets price attribute of this Product
     * object to bigDecimal
     * <br> preconditions : price >= 0
     * <br> postconditions :
     * @param bigDecimal
     * @throws ProductInvalidPriceException 
     */
    public void setPrice(double bigDecimal) throws ProductInvalidPriceException {
        if(bigDecimal < 0)
            throw new ProductInvalidPriceException();
        this.price = bigDecimal;
    }
    
    
    /**tranformer method : routine sets description attribute of this Product
     * object to string
     * <br> preconditions : string != null
     * <br> postconditions :
     * @param string
     * @throws ProductInvalidDescriptionException 
     */
    public void setDescription(String string) throws ProductInvalidDescriptionException {
        if(string == null)
            throw new ProductInvalidDescriptionException();
        this.description = string;
    }
    
    
    /**tranformer method : routine sets typeProduct attribute of this Product
     * object to string
     * <br> preconditions : typeProduct != null
     * <br> postconditions :
     * @param string
     * @throws ProductInvalidTypeException 
     */
    public void setTypeProduct(String string) throws ProductInvalidTypeException {
        if(string == null)
            throw new ProductInvalidTypeException();
        this.typeProduct = string;
    }
    
    
    /**tranformer method : routine sets quantity attribute of this Product
     * object to q
     * <br> preconditions : q >= 0
     * <br> postconditions :
     * @param q
     * @throws ProductInvalidQuantityException 
     */
    public void setQuantity(int q) throws ProductInvalidQuantityException {
        if(q < 0)
            throw new ProductInvalidQuantityException();
        this.quantity = q;
    }
    /**tranformer method : routine sets state attribute of this Product
     * object to string
     * <br> preconditions : string != null
     * <br> postconditions :
     * @param string
     * @throws ProductInvalidTypeException 
     */
    public void setState(String string) throws ProductInvalidTypeException {
        if(string == null)
            throw new ProductInvalidTypeException ();
        this.state = string;
    }
    /**tranformer method : routine sets category attribute of this Product
     * object to string
     * <br> preconditions : string != null
     * <br> postconditions :
     * @param string
     * @throws ProductInvalidCategoryException 
     */
    public void setCategory(String string) throws ProductInvalidCategoryException {
        if(string == null)
            throw new ProductInvalidCategoryException();
        this.category = string;
    }
    /**tranformer method : routine sets multimedia attribute of this Product
     * object to list
     * <br> preconditions : list != null
     * <br> postconditions :
     * @param list
     * @throws ProductInvalidMultimediaException 
     */
    public void setMultimedia(LinkedList list) throws ProductInvalidMultimediaException {
        if(list == null)
            throw new ProductInvalidMultimediaException();
        this.multimedia = list;
    }
    /**transformer method : routine sets comments attibute of this Product to list
     * <br> preconditions : list != null
     * <br> postconditions : 
     * @param list
     * @throws ProductInvalidCommentsException 
     */
    public void setComments(LinkedList list) throws ProductInvalidCommentsException {
        if(list == null)
            throw new ProductInvalidCommentsException();
        this.comments = list;
    }
    /**tranformer method : routine inserts a new multimedia url to the multimedia list
     * <br> preconditions : newMultimedia != null
     * <br> postconditions : 
     * @param newMultimedia
     * @throws ProductInvalidMultimediaException 
     */
    public void insertMultimedia(String newMultimedia) throws ProductInvalidMultimediaException{
        if(newMultimedia == null)
            throw new ProductInvalidMultimediaException("ERROR : invalid newMultimedia to insert in multimedia list");
        this.multimedia.add(newMultimedia);
    }
    /**tranformer method : routine inserts a new comment to comments list 
     * <br> preconditions : newcomment != null
     * <br> postcondtions : 
     * @param newcomment
     * @throws ProductInvalidCommentsException 
     */
    public void insertComments(Comment newcomment) throws ProductInvalidCommentsException {
        if(newcomment == null)
            throw new ProductInvalidCommentsException("ERROR : invalid newcomment to insert in comment list");
        this.comments.add(newcomment);
    }
    /**tranformer method : routine sets stars attribute of this Product
     * object to stars
     * <br> preconditions : stars >= 0
     * <br> postconditions :
     * @param stars
     * @throws ProductInvalidStarsDegreeException 
     */
    public void setStarsDegree(int stars) throws ProductInvalidStarsDegreeException {
        if(stars < 0)
            throw new ProductInvalidStarsDegreeException();
        this.starsDegree = stars;
    }
    /**tranformer method : routine sets views attribute of this Product
     * object to num
     * <br> preconditions : views >= 0
     * <br> postconditions :
     * @param num
     * @throws ProductInvalidViewsException 
     */
    public void setViews(int num) throws ProductInvalidViewsException {
        if(num < 0)
            throw new ProductInvalidViewsException();
        this.views = num;
    }
    /**accesor method : routine returns the first element of multimedia list
     * <br> preconditions : 
     * <br> postconditions : returns a url string of the multimedia
     * @return the first string element of the multimedia url
     */
    public String getFirstMultimedia(){
        return (String)this.multimedia.getFirst();
    }
    /**accesor method : routine returns the last element of multimedia list
     * <br> preconditions : 
     * <br> postconditions : returns a url string of the multimedia
     * @return the last string element of the multimedia url
     */
    public String getLastMultimedia(){
        return (String)this.multimedia.getLast();
    }
    /**accesor method : routine returns the indexed element of multimedia list
     * <br> preconditions :
     * <br> postconditions : returns a url string of the multimedia
     * @return the first string element of the multimedia url
     */
    public String getIndexMultimedia(int index){
        return (String)this.multimedia.get(index);
    }
    /**accesor method : routine returns the indexed element of comments list
     * <br> preconditions :
     * <br> postconditions : returns a string comment
     * @return the indexed element of comments list
     */
    public String getIndexComment(int index){
        return (String)this.comments.get(index);
    }
    /**accesor method : routine removes the indexed element of comments list
     * <br> preconditions :
     * <br> postconditions : removes a string comment
     */
    public void removeIndexComment(int index){
       this.comments.remove(index);
    }
    /**accesor method : routine returns the size of the multimedia list
     * <br> preconditions :
     * <br> postconditions : returns the int size of the multimedia list
     * @return returns the int size of the multimedia list
     */
    public int getSizeMultimedia(){
        return this.multimedia.size();
    }
    /**accesor method : routine returns the size of the comments list
     * <br> preconditions :
     * <br> postconditions : returns the int size of the comments list
     * @return returns the int size of the comments list
     */
    public int getSizeComments(){
        return this.multimedia.size();
    }
    /**accesor method : routine returns this product's object
     * id attribute
     * <br> preconditions :
     * <br> postconditions : returns int
     * @return this object id attribute (int)
     */
    public int getId() {
        return this.id;
    }
    /**accesor method : routine returns this product's object
     * name attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects name attribute (String)
     */
    public String getName() {
        return this.name;
    }
    /**accesor method : routine returns this product's object
     * date attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects date attribute (String)
     */
    public String getDate(){
        return this.date;
    }
    /**accesor method : routine returns this product's object
     * price attribute
     * <br> preconditions :
     * <br> postconditions : returns double
     * @return this objects price attribute (BigDecimal)
     */
    public double getPrice() {
        return this.price;
    }
    /**accesor method : routine returns this product's object
     * description attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects description attribute (String)
     */
    public String getDescription() {
        return this.description;
    }
    /**accesor method : routine returns this product's object
     * typeProduct attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects typeProduct attribute (String)
     */
    public String getTypeProduct() {
        return this.typeProduct;
    }
    /**accesor method : routine returns this product's object
     * quantity attribute
     * <br> preconditions :
     * <br> postconditions : returns int
     * @return this objects quantity attribute (int)
     */
    public int getQuantity() {
        return this.quantity;
    }
    /**accesor method : routine returns this product's object
     * state attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects state attribute (String)
     */
    public String getState() {
        return this.state;
    }
    /**accesor method : routine returns this product's object
     * category attribute
     * <br> preconditions :
     * <br> postconditions : returns String
     * @return this objects category attribute (String)
     */
    public String getCategory() {
        return this.category;
    }
    /**accesor method : routine returns this products object comments attribute
     * <br> preconditions :
     * <br> postconditions : linked list comments of this objects attribute is returned
     * @return this products object comments attribute
     */
    public LinkedList getComments(){
        return this.comments;
    }
    /**accesor method : routine returns this product's object
     * multimedia attribute
     * <br> preconditions :
     * <br> postconditions : returns LinkedList
     * @return this objects multimedia attribute (LInkedList)
     */
    public LinkedList getMultimedia() {
        return this.multimedia;
    }
    /**accesor method : routine returns this product's object
     * starsDegree attribute
     * <br> preconditions :
     * <br> postconditions : returns int
     * @return this objects starsDegree attribute (int)
     */
    public int getStarsDegree() {
        return this.starsDegree;
    }
    /**accesor method : routine returns this product's object
     * views attribute
     * <br> preconditions :
     * <br> postconditions : returns int
     * @return this objects views attribute (int)
     */
    public int getViews() {
        return this.views;
    }
}
