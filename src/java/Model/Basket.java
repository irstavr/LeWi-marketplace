package Model;

import java.math.BigDecimal;
import java.util.LinkedList;

/**
 * NOTE: does NOT need BasketDAO class.
 * 
 * @author Irini
 */
public class Basket {
    
    private Member memberId;
    private LinkedList<Product> products;
    private BigDecimal amount;
    
    /**constructor method : routine cretes a new refenrece to a new Basket object 
     * with dwfault values initilized in its attributes
     */
    public Basket(){
        products = new LinkedList();
    }
    /**transformer method : routine sets this objects memberId attribute to m
     * <br> preconditions : m != null
     * <br> postconditions :
     * @param m
     * @throws BasketInvalidMemberIdException 
     */
    public void setMemberId(Member m) throws BasketInvalidMemberIdException {
        if(m == null)
            throw new BasketInvalidMemberIdException();
        this.memberId = m;
    }
    /**transformer method : routine sets this objects products list attribute to l
     * <br> preconditions : l != null
     * <br> postconditions :
     * @param l
     * @throws BasketInvalidMemberIdException 
     */
    public void setProducts(LinkedList l) throws BasketInvalidProductsListException {
        if(l == null)
            throw new BasketInvalidProductsListException();
        this.products = l;
    }
    /**transformer method : routine inserts p product element to this objects products list
     * <br> preconditions : p != null
     * <br> postconditions : 
     * @param p
     * @throws BasketInvalidProductsListException 
     */
    public void insertProduct(Product p) throws BasketInvalidProductsListException{
        if(p == null)
            throw new BasketInvalidProductsListException("ERROR : invalid product p to insert in basket");
        this.products.add(p);
    }
    /**tranformer method : routine removes p product from this objects products list if exists
     * <br> preconditions : p  != null
     * <br> postconditions :
     * @param p
     * @throws BasketInvalidProductsListException 
     */
    public void removeProduct(Product p) throws BasketInvalidProductsListException{
        if(p == null)
            throw new BasketInvalidProductsListException("ERROR : invalid product p to remove in basket");
        this.products.remove(p);
    }
    /**transformer method : routine sets this objects amount attribute to a
     * <br> preconditions : a != null
     * <br> postcondition : 
     * @param a
     * @throws BasketInvalidAmountException 
     */
    public void setAmount(BigDecimal a) throws BasketInvalidAmountException{
        if(a == null)
            throw new BasketInvalidAmountException();
        this.amount = a;
    }
    /**accesor method : routine return this objects memberId attribute
     * <br> preconditions : 
     * <br> postconditions : returns Member object
     * @return the memberId attribute of this object
     */
    public Member getMemberId() {
        return memberId;
    }
    /**accesor method : routine returns the products list attribute of this object
     * <br> preconditions :
     * <br> postcondition : returns LinkedList object
     * @return the products attribute of this object 
     */
    public LinkedList<Product> getProducts() {
            return products;
    }
    /**accesor method : routine returns the first element of product list attribute
     * of this object
     * <br> preconditions :
     * <br> postconditions : returns Product object
     * @return the first element of this products list attribute of this object
     */
    public Product getFirstProduct(){
        return this.products.getFirst();
    }
    /**accesor method : routine returns the last element of product list attribute
     * of this object
     * <br> preconditions :
     * <br> postconditions : returns Product object
     * @return the last element of this products list attribute of this object
     */
    public Product getLastProduct(){
        return this.products.getLast();
    }
    /**accesor method : routine returns the indexed element of product list attribute
     * of this object
     * <br> preconditions :
     * <br> postconditions : returns Product object
     * @return the indexed element of this products list attribute of this object
     */
    public Product getIndexedProduct(int index){
        return this.products.get(index);
    }
    /**accesor method : routine returns the amount attribute of this object
     * <br> preconditions : 
     * <br> postconditions : returns BigDecimal object
     * @return this objects amount attribute
     */
    public BigDecimal getAmount() {
        return amount;
    }
    /**accesor method : returns the size of this objects products list attribute
     * <br> preconditions :
     * <br> postconditions :returns int
     * @return the size of this objects products list attribute
     */
    public int getSize(){
        return this.products.size();
    }
    
    
}
