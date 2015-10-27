package Model;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Irini & Lefas
 */
public class Member {
    
    //private static int idCounter = 0;
    private int id;
    private int age;
    private String country; 
    private String typemember;
    private String email; 
    private String password; 
    private String firstname;
    private String lastname; 
    private Date registrydate;
    private int starsDegree; 
    private LinkedList subscribers;
    private LinkedList productsOffered;
    private LinkedList productsBuyed;
    private LinkedList productsWanted;
    
    
    /**constructor method : creates a new reference to a member object with parameter values
     * and default list values
     * @param myid
     * @param myage
     * @param mycountry
     * @param mytypemember
     * @param myemail
     * @param mypassword
     * @param myfirstname
     * @param mylastname
     * @param mydate
     * @param mystars
     * @param mys
     * @param mypo
     * @param mypb
     * @param mypw
     * @throws MemberInvaliDateException
     * @throws MemberInvalidCountryException
     * @throws MemberInvalidDateException
     * @throws MemberInvalidEmailException
     * @throws MemberInvalidFirstNameException
     * @throws MemberInvalidLastNameException
     * @throws MemberInvalidPasswordException
     * @throws MemberInvalidStarsDegreeException
     * @throws MemberInvalidTypeMemberException 
     
    public Member(int myid , int myage , String mycountry , String mytypemember , String myemail , String mypassword , String myfirstname , String mylastname , 
            Date mydate , int mystars ) throws MemberInvaliDateException, MemberInvalidCountryException, MemberInvalidDateException, MemberInvalidEmailException, MemberInvalidFirstNameException, MemberInvalidLastNameException, MemberInvalidPasswordException, MemberInvalidStarsDegreeException, MemberInvalidTypeMemberException
    {
        this.setId(idCounter);
        this.setAge(myage);
        this.setCountry(mycountry);
        this.setDate(mydate);
        this.setEmail(myemail);
        this.setFirstname(myfirstname);
        this.setLastname(mylastname);
        this.setPassword(mypassword);
        this.setStarsDegree(mystars);
        this.setTypeMember(mytypemember);
        subscribers = new LinkedList();
        productsOffered = new LinkedList();
        productsBuyed = new LinkedList();
        productsWanted = new LinkedList();
        //idCounter++;
    }
    */
    
    /**contractor of member object : creates a new reference to a member object with
     * default values initialized to its attributes
     */
    public Member(){
       // idCounter++;
        //subscribers = new LinkedList();
        //productsOffered = new LinkedList();
       // productsBuyed = new LinkedList();
        //productsWanted = new LinkedList();
    }
    
    
    /**transformer method : routine sets this members object id iattribute to id
     * <br> preconditions : 
     * <br> postconditions : 
     * @param id 
     */
    public void setId(int id){
        this.id = id;
    }
    
    
    /**transformer method : routine sets this members object age iattribute to age
     * <br> preconditions : age > 0
     * <br> postconditions :
     * @param age 
     * @throws MemberInvalidageException 
     */
    public void setAge(int age) throws MemberInvaliDateException{
        if(age <= 0)
            throw new MemberInvaliDateException();
        this.age = age;
    }
    
    
    /**transformer method : routine sets this members object typemember iattribute to typeMember
     * <br> preconditions : typeMember != null
     * <br> postconditions :
     * @param typeMember 
     * @throws MemberInvalidMemberException
     */
    public void setTypeMember(String typeMember) throws MemberInvalidTypeMemberException{
        if(typeMember == null)
            throw new MemberInvalidTypeMemberException();
        this.typemember = typeMember;
    }
    
    
    /**transformer method : routine sets this members object country attribute to country
     * <br> preconditions : country != null
     * <br> postconditions :
     * @param country 
     * @throws MemberInvalidCountryException
     */
    public void setCountry(String country) throws MemberInvalidCountryException{
        if(country == null)
            throw new MemberInvalidCountryException();
        this.country = country;
    }
    
    
    /**transformer method : routine sets this members object registrydate attribute to date
     * <br> preconditions : date != null
     * <br> postconditions : 
     * @param date 
     */
    public void setDate(Date date) throws MemberInvalidDateException{
        if(date == null){
            throw new MemberInvalidDateException();
        }
        this.registrydate = date;
    }
    
    
    /**transformer method : routine sets email attribute of this meber object to email
     * <br> preconditions : email != null
     * <br> postconditions :
     * @param email
     * @throws MemberInvalidEmailException 
     */
    public void setEmail(String email) throws MemberInvalidEmailException {
        if(email == null)
            throw new MemberInvalidEmailException();
        this.email = email;
    }
    
    
    /**transformer method : routine sets password attribute of this meber object to password
     * <br> preconditions : password != null
     * <br> postconditions :
     * @param password
     * @throws MemberInvalidPasswordException 
     */
    public void setPassword(String password) throws MemberInvalidPasswordException {
        if(password == null)
            throw new MemberInvalidPasswordException();
        this.password = password;
    }
    
    
    /**transformer method : routine sets firstname attribute of this member object to firstname
     * <br> preconditions : firstname != null
     * <br> postconditions :
     * @param firstname
     * @throws MemberInvalidFirstNameException 
     */
    public void setFirstname(String firstname) throws MemberInvalidFirstNameException {
        if(firstname == null)
            throw new MemberInvalidFirstNameException();
        this.firstname =  firstname;
    }
    
    
    /**transformer method : routine sets lastname attribute of this member object to lastname
     * <br> preconditions : lastname != null
     * <br> postconditions :
     * @param lastname
     * @throws MemberInvalidLastNameException 
     */
    public void setLastname(String lastname) throws MemberInvalidLastNameException {
        if(firstname == null)
            throw new MemberInvalidLastNameException();
        this.lastname =  lastname;
    }
    
    
    /**transformer method : routine sets registrydate attribute of this member object to registrydate
     * <br> preconditions : registrydate != null
     * <br> postconditions :
     * @param registryDate
     * @throws MemberInvalidRegistryDateException 
     */
    public void setRegistrydate(Date registryDate) throws MemberInvalidRegistryDateException {
        if(registryDate == null)
            throw new MemberInvalidRegistryDateException();
        this.registrydate = registryDate;
    }
    
    
    /**transformer method : routine sets starsDegree attribute of this member object to stars
     * <br> preconditions : stars >= 0
     * <br> postconditions :
     * @param stars
     * @throws MemberInvalidStarsDegreeException 
     */
    public void setStarsDegree(int stars) throws MemberInvalidStarsDegreeException {
        if(stars < 0)
            throw new MemberInvalidStarsDegreeException();
        this.starsDegree = stars;
    }
    
    
    /**transformer method : routine sets subscribers list attribute of this member object to sunscribers
     * <br> preconditions : subscribers != null
     * <br> postconditions :
     * @param subscribers
     * @throws MemberInvalidSubscribersException 
     */
    public void setSubscribers(LinkedList subscribers) throws MemberInvalidSubscribersException {
        if(subscribers == null)
            throw new MemberInvalidSubscribersException();
        this.subscribers = subscribers;
    }
    
    
    /**transformer method : routine inserts m (subscribers id) object to this objects subscribers list
     * <br> preconditions : 
     * <br> postconditions :
     * @param m
     */
    public void insertSubscriber(int m){
        this.subscribers.add(m);
    }
    
    
    /**transformer method : routine removes m (subscribers id) object to this objects subscribers list if exists
     * <br> preconditions : 
     * <br> postconditions :
     * @param m
     */
    public void removeSubscriber(int m){
        this.subscribers.remove(m);
    }
    
    
    /**transformer method : routine sets this objects productsOffered list attribute to productsOffered
     * <br> preconditions : 
     * <br> postconditions :
     * @param productsOffered
     * @throws MemberInvalidProductsOfferedException 
     */
    public void setProductsOffered(LinkedList productsOffered) throws MemberInvalidProductsOfferedException {
        if(productsOffered == null)
            throw new MemberInvalidProductsOfferedException();
        this.productsOffered = productsOffered;
    }
    
    
    /**transformer method : routine inserts product id p to this objects oprductsOffered list attribute
     * <br> preconditions : 
     * <br> postconditions :
     * @param p
     */
    public void insertProductOffered(int p) {
        this.productsOffered.add(p);
    }
    
    
    /**transformer method : routine removes product id p to this objects oprductsOffered list attribute
     * <br> preconditions : 
     * <br> postconditions :
     * @param p
     * @throws MemberInvalidProductsOfferedException 
     */
    public void removeProductOffered(int p){
        this.productsOffered.remove(p);
    }
    
    
    /**transformer method : routine sets this objects productsBuyed list attribute to productsBuyed
     * <br> predonditions : productsBuyed != null
     * <br> postconditions :
     * @param productsBuyed
     * @throws MemberInvalidProductsBuyedException 
     */
    public void setProductsBuyed(LinkedList<Product> productsBuyed) throws MemberInvalidProductsBuyedException {
        if(productsBuyed == null)
            throw new MemberInvalidProductsBuyedException();
        this.productsBuyed = productsBuyed;
    }
    
    
    /**tranformer method : routine inserts Product id p to this objects productsBuyed list attribute
     * <br> preconditions :
     * <br> postconditions :
     * @param p
     */
    public void insertProductsBuyed(int p){
        this.productsBuyed.add(p);
    }
    
    
    /**tranformer method : routine removes Product id p to this objects productsBuyed list attribute if exists
     * <br> preconditions :
     * <br> postconditions :
     * @param p
     */
    public void removeProductsBuyed(int p){
        this.productsBuyed.remove(p);
    }
    
    
    /**tranformer method : routine sets this objects productsWanted list attribute to productsWanted
     * <br> preconditions : productsWanted != null
     * <br> postconditions :
     * @param productsWanted
     * @throws MemberInvalidProductsWantedException 
     */
    public void setProductsWanted(LinkedList<Product> productsWanted) throws MemberInvalidProductsWantedException {
        if(productsWanted == null)
            throw new MemberInvalidProductsWantedException();
        this.productsWanted = productsWanted;
    }
    
    
    /**transformer method : routine inserts product id p to this objects productsWanted list attribute
     * <br> preconditions :
     * <br> postconditions :
     * @param p
     */
    public void insertProductsWanted(int p) {
        this.productsWanted.add(p);
    }
    
    
    /**transformer method : routine removes product id p to this objects productsWanted list attribute if exists
     * <br> preconditions :
     * <br> postconditions :
     * @param p
     */
    public void removeProductsWanted(int p){
        this.productsWanted.remove(p);
    }
    
    
    /**accesor method : routine returns this objects id attribute
     * <br> preconditions :
     * <br> postconditions : Long is returned
     * @return id attribute of this object
     */
    public int getId() {
        return this.id;
    }
    
    
    /**accesor method : routine returns this objects age attribute
     * <br> preconditions :
     * <br> postconditions : Integer is returned
     * @return age attribute of this object
     */
    public Integer getAge() {
            return this.age;
    }
    
    
    /**accesor method : routine returns this objects country attribute
     * <br> preconditions :
     * <br> postconditions : String is returned
     * @return country attribute of this object
     */
    public String getCountry() {
        return this.country;
    }
    
    
    /**accesor method : routine returns this objects typemember attribute
     * <br> preconditions :
     * <br> postconditions : String is returned
     * @return typemember attribute of this object
     */
    public String getTypeMember() {
        return this.typemember;
    }
    
    
    /**accesor method : routine returns this objects email attribute
     * <br> preconditions : 
     * <br> postconditions : String is returned
     * @return email attribute of this object
     */
    public String getEmail() {
        return this.email;
    }
    
    
    /**accesor method : routine returns this objects password attribute
     * <br> preconditions :
     * <br> postconditions : String is returned
     * @return password attribute of this object
     */
    public String getPassword() {
        return this.password;
    }
    
    
    /**accesor method : routine returns this objects firtsname attribute
     * <br> preconditions : 
     * <br> postconditions : String is returned
     * @return firtstname attribute of this object
     */
    public String getFirstname() {
        return this.firstname;
    }
    
    
    /**accesor method : routine returns this objects lastsname attribute
     * <br> preconditions : 
     * <br> postconditions : String is returned
     * @return lastname attribute of this object
     */
    public String getLastname() {
        return this.lastname;
    }
    
    
    /**accesor method : routine returns this objects registrydate attribute
     * <br> preconditions :
     * <br> postconditions : Date is returned
     * @return registrydate attribute of this object
     */
    public Date getRegistrydate() {
        return this.registrydate;
    }  
    
    
    /**accesor method : routine returns this objects starsDegree attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return starsDegree attribute of this object
     */
    public int getStarsDegree() {
        return this.starsDegree;
    }
    
    
    /**accesor method : routine returns this objects subscribers list attribute
     * <br> preconditions :
     * <br> postconditions : LinkedList is returned
     * @return subscribers list attribute of this object
     */
    public LinkedList getSubscribers() {
        return this.subscribers;
    }
    
    
    /**accesor method : routine returns the first member id  of this objects subscribers list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return the first element of this objects subscribers list attribute
     */
    public Object getFirstSubscriber(){
        return this.subscribers.getFirst();
    }
    
    
    /**accesor method : routine returns the last member id of this objects subscribers list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return the last element of this objects subscribers list attribute
     */
    public Object getLastSubscriber(){
        return this.subscribers.getLast();
    }
    
    
    /**accesor method : routine returns the indexed member id of this objects subscribers list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @param index
     * @return the indexed element of this objects subscribers list attribute
     */
    public Object getIndexedSubscriber(int index){
        return this.subscribers.get(index);
    }
    
    
    /**accesor method : routine returns the size of this objects subscribers list attribute
     * <br> preconditions : 
     * <br> postconditions : returns int
     * @return the size of this ibjects subscribers list attribute 
     */
    public int getSubscribersListSize(){
        return this.subscribers.size();
    }
    
    
    /**accesor method : routine returns this objects productsOffered list attribute
     * <br> preconditions :
     * <br> postconditions : LinkedList is returned
     * @return this objects productsOffered list attribute
     */
    public LinkedList getProductsOffered() {
        return this.productsOffered;
    }
    
    
    /**accesor method : routine returns the first Product id element of this objects productsOffered list attribute
     * <br> preconditions :
     * <br> postconditions :int is returned
     * @return the first element of this productsOffered list attribute
     */
    public Object getFirstProductsOffred(){
        return this.productsOffered.getFirst();
    }
    
    
    /**accesor method : routine returns the last Product id element of this objects productsOffered list attribute
     * <br> preconditions :
     * <br> postconditions :int is returned
     * @return the last element of this productsOffered list attribute
     */
    public Object getLastProductsOffred(){
        return this.productsOffered.getLast();
    }
    
    
    /**accesor method : routine returns the Indexed Product id  element of this objects productsOffered list attribute
     * <br> preconditions :
     * <br> postconditions :int is returned
     * @param index
     * @return the indexed element of this productsOffered list attribute
     */
    public Object getIndexedProductsOffred(int index){
        return this.productsOffered.get(index);
    }
    
    
    /**accesor method : routine returns the size of this objects productsOffered list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return the size of this objects productsOffered list attribute
     */
    public int getProductsOfferedSize(){
        return this.productsOffered.size();
    }
    
    
    /**accesor method : routine returns this objects productsBuyed list attribute
     * <br> preconditions :
     * <br> postconditions : LinkedList is returned
     * @return this objects productsBuyed list attribute
     */
    public LinkedList getProductsBuyed() {
        return this.productsBuyed;
    }
    
    
    /**accesor method : routine returns the first element of this objects productsBuyed list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @return the first element of this objects productsBuyes list attribute
     */
    public Object getFirstProductBuyed(){
        return this.productsBuyed.getFirst();
    }
    
    
    /**accesor method : routine returns the last element of this objects productsBuyed list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @return the last element of this objects productsBuyes list attribute
     */
    public Object getLastProductBuyed(){
        return this.productsBuyed.getLast();
    }
    
    
    /**accesor method : routine returns the indexed element of this objects productsBuyed list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @param index
     * @return the indexed element of this objects productsBuyes list attribute
     */
    public Object getIndexedProductBuyed(int index){
        return this.productsBuyed.get(index);
    }
    
    
    /**accesor method : routine returns the size of this objects productsBuyed list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return the size of this objects productsBuyed list attribute
     */
    public int getProductsBuyedListSize(){
        return this.productsBuyed.size();
    }
    
    
    /**accesor method : routine returns this objects productsWanted list attribute
     * <br> preconditions : 
     * <br> postconditions : LinkedList object is returned
     * @return this objects productsWanted list attribute
     */
    public LinkedList getProductsWanted() {
        return this.productsWanted;
    }
    
    
    /**accesor method : routine returns the first element of this objects productsWanted list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @return the first element of this objects productsWanted list attribute
     */
    public Object getFirstProductsWanted(){
        return this.productsWanted.getFirst();
    }
    
    
    /**accesor method : routine returns the last element of this objects productsWanted list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @return the last element of this objects productsWanted list attribute
     */
    public Object getLastProductsWanted(){
        return this.productsWanted.getLast();
    }
    
    
    /**accesor method : routine returns the indexed element of this objects productsWanted list attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @param index
     * @return the indexed element of this objects productsWanted list attribute
     */
    public Object getIndexedProductsWanted(int index){
        return this.productsWanted.get(index);
    }
    
    
    /**accesor method : routine returns the size of this objects productsWanted list attribute
     * <br> preconditions : 
     * <br> postconditions : int is returned
     * @return the size of this objects productsWanted list attribute
     */
    public int getProductsWantedListSize(){
        return this.productsWanted.size();
    }
    
    
    /**accesor method : routine returns a string representation of this member object
     * <br> preconditions :
     * <br> postconditions : string is returned
     * @return the string represantaion of this member object
     */
    @Override
    public String toString() 
    {
        return String.format("User[id=%d,email=%s,firstname=%s,lastname=%s,birthdate=%s]", 
            id, email, firstname, lastname, registrydate);
    }

}
