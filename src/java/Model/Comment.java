/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lefas
 */
public class Comment {
    private int memberId;
    private String comment;
    
    /**contractor method : routine creates a new reference to a new comment attribute with values id and com
     * <br> preconditions : 
     * <br> postconditions : a new object reference is created
     * @param id
     * @param com 
     */
    public Comment(int id, String com){
        this.memberId = id;
        this.comment = com;
    }
    /**contractor method : routine creates a new reference to a new comment attribute with default values
     * <br> preconditions : 
     * <br> postconditions : a new object reference is created
     */
    public Comment(){
    }
    /**transformer method : routine sets this objects memberId attribute to id
     * <br> preconditions :id >= 0
     * <br> postconditions : 
     * @param id
     * @throws CommentInvalidException 
     */
    public void setId(int id) throws CommentInvalidException{
        if(id < 0)
            throw new CommentInvalidException("ERROR : invalid memberid in comment");
        this.memberId = id;
    }
    /**transformer method : routine sets this objects comment attribute to com
     * <br> preconditions : com != null
     * <br> postconditions : 
     * @param com
     * @throws CommentInvalidException 
     */
    public void setComment(String com) throws CommentInvalidException{
        if(com == null)
            throw new CommentInvalidException("ERROR : invalid comment in comment");
        this.comment = com;
    }
    /**accesor method : routine returns this objects memberId attribute
     * <br> preconditions :
     * <br> postconditions : int is returned
     * @return this objects memberId attribute
     */
    public int getMemberId(){
        return this.memberId;
    }
    /**accesor method : routine returns this objects comment attribute
     * <br> preconditions :
     * <br> postcondtions : String is returned 
     * @return this objects comment attribute
     */
    public String getComment(){
        return this.comment;
    }
    
}
