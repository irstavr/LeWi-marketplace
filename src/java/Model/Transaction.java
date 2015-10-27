package Model;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Irini
 */
public class Transaction 
{
    private Member buyerId;
    private Member sellerId;
    private LinkedList<Product> productId;
    private String type;
    private BigDecimal amount;
    private String date;            
    private int starsDegree;  /* to kanei set MONO o buyer*/
    
    /**contractor method : routine creates a new reference to a Transaction 
     * object with default attribute values
     */
    public Transaction(){
        this.productId = new LinkedList();
    }
    /**transformer method : routine sets the buyerId attribute of this transactions object
     * to buyerId
     * <br> preconditions : buyerId != null
     * <br> postconditions : 
     * @param buyerId
     * @throws TransactionInvalidBuyerIdException 
     */
    public void setBuyerId(Member buyerId) throws TransactionInvalidBuyerIdException {
        if(buyerId == null)
            throw new TransactionInvalidBuyerIdException();
        this.buyerId = buyerId;
    }
    /**transformer method : routine sets the sellerId attribute of this transactions object
     * to sellerId
     * <br> preconditions : sellerId != null
     * <br> postconditions : 
     * @param sellerId
     * @throws TransactionInvalidSellerIdException 
     */
    public void setSellerId(Member sellerId) throws TransactionInvalidSellerIdException {
        if(sellerId == null)
            throw new TransactionInvalidSellerIdException();
        this.sellerId = sellerId;
    }
    /**tranformer method : routine sets productID list attribute of this transaction object to productId list
     * <br> preconditions : productId != null
     * <br> postconditions : 
     * @param productId
     * @throws TransactionInvalidProductIdException 
     */
    public void setProductId(LinkedList productId) throws TransactionInvalidProductIdException {
        if(productId == null)
            throw new TransactionInvalidProductIdException();
        this.productId = productId;
    }
    /**transformer method : routine inserts productId product object to this transactions productId list attribute
     * object
     * <br> preconditions : productId != null
     * <br> postconditions :
     * @param productId
     * @throws TransactionInvalidProductIdException 
     */
    public void insertProductId(Product productId) throws TransactionInvalidProductIdException{
        if(productId == null)
            throw new TransactionInvalidProductIdException("ERROR : Invalid Product id of transaction!");
        this.productId.add(productId);
    }
    /**transformer method :  routine removes productId product object to this transactions productId list attribute
     * object
     * <br> preconditions : p != null
     * <br> postconditions :
     * @param p
     * @throws TransactionInvalidProductIdException 
     */
    public void removeProductId(Product p) throws TransactionInvalidProductIdException{
        if(p == null)
            throw new TransactionInvalidProductIdException("ERROR : invalid product to remove from product id list of transaction");
        this.productId.remove(p);
    }
    /**transformer method : routine sets this transaction objects type attribute to type
     * <br> preconditions : type != null
     * <br> postconditions :
     * @param type
     * @throws TransactionInvalidTypeException 
     */
    public void setType(String type) throws TransactionInvalidTypeException {
        if(type == null)
            throw new TransactionInvalidTypeException();
        this.type = type;
    }
    /**transformer method : routine sets this transactions objects amount attribute to amount
     * <br> preconditions : amount != null
     * <br> postconditions :
     * @param amount
     * @throws TransactionInvalidAmountException 
     */
    public void setAmount(BigDecimal amount) throws TransactionInvalidAmountException {
        if(amount == null)
            throw new TransactionInvalidAmountException();
        this.amount = amount;
    }
    /**transformer method : routine sets this transactions objects date attribute to date
     * <br> preconditions : date != null && date.toString() != null
     * <br> postconditions :
     * @param date
     * @throws TransactionInvalidDateException 
     */
    public void setDate(Date date) throws TransactionInvalidDateException {
        if(date == null || date.toString() == null)
            throw new TransactionInvalidDateException();
        this.date = date.toString();
    }
    /**transformer method : routine sets this transactions objects starsDegree attribute to starsDegree
     * <br> preconditions : starsDegree >= 0
     * <br> postconditions :
     * @param starsDegree
     * @throws TransactionInvalidStarsDegreeException 
     */
    public void setStarsDegree(int starsDegree) throws TransactionInvalidStarsDegreeException {
        if(starsDegree < 0)
            throw new TransactionInvalidStarsDegreeException();
        this.starsDegree = starsDegree;
    }
    /**accesor method : routine returns this objects buyerId attribute
     * <br> preconditions : 
     * <br> postconditions : returns Member object
     * @return the buyerId attribute of this object
     */
    public Member getBuyerId() {
        return this.buyerId;
    }
    /**accesor method : routine returns this objects sellerId attribute
     * <br> preconditions : 
     * <br> postconditions : returns Member object
     * @return the sellerId attribute of this object
     */
    public Member getSellerId() {
        return this.sellerId;
    }
    /**accesor method : routine returns this objects productId list attribute
     * <br> preconditions : 
     * <br> postconditions : returns LinkedList object
     * @return the productId list attribute of this object
     */
    public LinkedList getProductId() {
        return this.productId;
    }
    /**accesor method : routine returns the first element of this objects productId list
     * <br> preconditions : 
     * <br> postconditions : returns Product object
     * @return the first element of productId list attribute of this object
     */
    public Product getFirstProductId(){
        return this.productId.getFirst();
    }
    /**accesor method : routine returns the last element of this objects productId list
     * <br> preconditions : 
     * <br> postconditions : returns Product object
     * @return the last element of productId list attribute of this object
     */
    public Product getLastProductId(){
        return this.productId.getLast();
    }
    /**accesor method : routine returns the indexed element of this objects productId list
     * <br> preconditions : 
     * <br> postconditions : returns Product object
     * @return the indexed element of productId list attribute of this object
     */
    public Product getIndexedProductId(int index){
        return this.productId.get(index);
    }
    /**accesor method : routine returns this objects type attribute
     * <br> preconditions : 
     * <br> postconditions : returns String object
     * @return the type attribute of this object
     */
    public String getType() {
        return this.type;
    }
    /**accesor method : routine returns this objects amount attribute
     * <br> preconditions : 
     * <br> postconditions : returns BigDecimal object
     * @return the amount attribute of this object
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**accesor method : routine returns this objects date attribute
     * <br> preconditions : 
     * <br> postconditions : returns String object
     * @return the date attribute of this object
     */
    public String getDate() {
        return this.date;
    }
    /**accesor method : routine returns this objects starsDegree attribute
     * <br> preconditions : 
     * <br> postconditions : returns int
     * @return the starsDegree attribute of this object
     */
    public int getStarsDegree() {
        return this.starsDegree;
    }         
    
    
}
