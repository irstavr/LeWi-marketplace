/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lefas
 */
class ModelExceptions extends Exception{
}

class ProductInvalidIdException extends Exception{
    String exceptionMsg;
    public ProductInvalidIdException(){
        this.exceptionMsg = "ERROR : Invalid Id of Product!";
    }
    public ProductInvalidIdException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}

class ProductInvalidNameException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidNameException(){
        this.exceptionMsg = "ERROR : Invalid Name of Product!";
    }
    public ProductInvalidNameException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidPriceException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidPriceException(){
        this.exceptionMsg = "ERROR : Invalid Price of Product!";
    }
    public ProductInvalidPriceException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidDescriptionException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidDescriptionException(){
        this.exceptionMsg = "ERROR : Invalid Description of Product!";
    }
    public ProductInvalidDescriptionException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidTypeException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidTypeException(){
        this.exceptionMsg = "ERROR : Invalid Type of Product!";
    }
    public ProductInvalidTypeException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidQuantityException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidQuantityException(){
        this.exceptionMsg = "ERROR : Invalid Quantity of Product!";
    }
    public ProductInvalidQuantityException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidStateException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidStateException(){
        this.exceptionMsg = "ERROR : Invalid State of Product!";
    }
    public ProductInvalidStateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidCategoryException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidCategoryException(){
        this.exceptionMsg = "ERROR : Invalid Category of Product!";
    }
    public ProductInvalidCategoryException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidStarsDegreeException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidStarsDegreeException(){
        this.exceptionMsg = "ERROR : Invalid Stars Degree of Product!";
    }
    public ProductInvalidStarsDegreeException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidViewsException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidViewsException(){
        this.exceptionMsg = "ERROR : Invalid Views of Product!";
    }
    public ProductInvalidViewsException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidMultimediaException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidMultimediaException(){
        this.exceptionMsg = "ERROR : Invalid Multimedia list of Product!";
    }
    public ProductInvalidMultimediaException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidBuyerIdException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidBuyerIdException(){
        this.exceptionMsg = "ERROR : Invalid Buyer id of transaction!";
    }
    public TransactionInvalidBuyerIdException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidSellerIdException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidSellerIdException(){
        this.exceptionMsg = "ERROR : Invalid Seller id of transaction!";
    }
    public TransactionInvalidSellerIdException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidProductIdException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidProductIdException(){
        this.exceptionMsg = "ERROR : Invalid Product id list of transaction!";
    }
    public TransactionInvalidProductIdException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidTypeException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidTypeException(){
        this.exceptionMsg = "ERROR : Invalid type of transaction!";
    }
    public TransactionInvalidTypeException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidAmountException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidAmountException(){
        this.exceptionMsg = "ERROR : Invalid amount of transaction!";
    }
    public TransactionInvalidAmountException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidDateException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidDateException(){
        this.exceptionMsg = "ERROR : Invalid date of transaction!";
    }
    public TransactionInvalidDateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class TransactionInvalidStarsDegreeException extends Exception{
    String exceptionMsg;
    
    public TransactionInvalidStarsDegreeException(){
        this.exceptionMsg = "ERROR : Invalid stars degree of transaction!";
    }
    public TransactionInvalidStarsDegreeException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class BasketInvalidMemberIdException extends Exception{
    String exceptionMsg;
    
    public BasketInvalidMemberIdException(){
        this.exceptionMsg = "ERROR : Invalid memberId of basket!";
    }
    public BasketInvalidMemberIdException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class BasketInvalidProductsListException extends Exception{
    String exceptionMsg;
    
    public BasketInvalidProductsListException(){
        this.exceptionMsg = "ERROR : Invalid ProductsList of basket!";
    }
    public BasketInvalidProductsListException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class BasketInvalidAmountException extends Exception{
    String exceptionMsg;
    
    public BasketInvalidAmountException(){
        this.exceptionMsg = "ERROR : Invalid amount of basket!";
    }
    public BasketInvalidAmountException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidEmailException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidEmailException(){
        this.exceptionMsg = "ERROR : Invalid email of member!";
    }
    public MemberInvalidEmailException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidPasswordException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidPasswordException(){
        this.exceptionMsg = "ERROR : Invalid password of member!";
    }
    public MemberInvalidPasswordException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidFirstNameException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidFirstNameException(){
        this.exceptionMsg = "ERROR : Invalid first name of member!";
    }
    public MemberInvalidFirstNameException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidLastNameException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidLastNameException(){
        this.exceptionMsg = "ERROR : Invalid last name of member!";
    }
    public MemberInvalidLastNameException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidRegistryDateException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidRegistryDateException(){
        this.exceptionMsg = "ERROR : Invalid registry date of member!";
    }
    public MemberInvalidRegistryDateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidStarsDegreeException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidStarsDegreeException(){
        this.exceptionMsg = "ERROR : Invalid Stars Degree of member!";
    }
    public MemberInvalidStarsDegreeException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidSubscribersException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidSubscribersException(){
        this.exceptionMsg = "ERROR : Invalid Subscribers list of member!";
    }
    public MemberInvalidSubscribersException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidProductsOfferedException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidProductsOfferedException(){
        this.exceptionMsg = "ERROR : Invalid Products Offered list of member!";
    }
    public MemberInvalidProductsOfferedException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidProductsBuyedException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidProductsBuyedException(){
        this.exceptionMsg = "ERROR : Invalid Products buyed list of member!";
    }
    public MemberInvalidProductsBuyedException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidProductsWantedException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidProductsWantedException(){
        this.exceptionMsg = "ERROR : Invalid Products wanted list of member!";
    }
    public MemberInvalidProductsWantedException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvaliDateException extends Exception{
    String exceptionMsg;
    
    public MemberInvaliDateException(){
        this.exceptionMsg = "ERROR : Invalid date of member!";
    }
    public MemberInvaliDateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidTypeMemberException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidTypeMemberException(){
        this.exceptionMsg = "ERROR : Invalid typemember of member!";
    }
    public MemberInvalidTypeMemberException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidCountryException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidCountryException(){
        this.exceptionMsg = "ERROR : Invalid typemember of member!";
    }
    public MemberInvalidCountryException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class MemberInvalidDateException extends Exception{
    String exceptionMsg;
    
    public MemberInvalidDateException(){
        this.exceptionMsg = "ERROR : Invalid typemember of member!";
    }
    public MemberInvalidDateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidDateException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidDateException(){
        this.exceptionMsg = "ERROR : Invalid typemember of member!";
    }
    public ProductInvalidDateException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class CommentInvalidException extends Exception{
    String exceptionMsg;
    
    public CommentInvalidException(){
        this.exceptionMsg = "ERROR : Invalid comment of comment!";
    }
    public CommentInvalidException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}
class ProductInvalidCommentsException extends Exception{
    String exceptionMsg;
    
    public ProductInvalidCommentsException(){
        this.exceptionMsg = "ERROR : Invalid comments list of product!";
    }
    public ProductInvalidCommentsException(String msg){
        this.exceptionMsg = msg;
    }
    @Override
    public String getMessage(){
        return this.exceptionMsg;
    }
    public void showMessage(){
        System.err.println(this.exceptionMsg);
    }
}