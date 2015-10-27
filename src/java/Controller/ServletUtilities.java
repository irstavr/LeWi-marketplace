/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.util.LinkedList;

/**
 *
 * @author lefas
 */
public class ServletUtilities {
    /**routine checks if the products p category exists in the list of products l
     * <br> preconditions :
     * <br> postconditions :returns true if p.category exists in some product on l list else false
     * @param p
     * @param l
     * @return returns true if p.category exists in some product on l list else false
     */
    public static boolean containsCategory(Product p , LinkedList l){
        Product temp;
        
        for (int i = 0 ; i < l.size(); i++){
            temp = (Product) l.get(i);
            if(p.getCategory().equals(temp.getCategory())){
                return true;
            }
        }
        return false;
    }
}
