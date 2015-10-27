/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author lefas
 */
public class ControllerExceptions {
    public class ProductServletException extends Exception{
        String exceptionMsg;
        public ProductServletException(){
            this.exceptionMsg = "ERROR IN PRODUCT SERVLET!";
        }
        public ProductServletException(String msg){
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
}
