package Model;

import java.io.IOException;
import java.util.LinkedList;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Irini
 */
public class ServiceCatTagHandler extends SimpleTagSupport 
{
    private LinkedList items;
    private int size;
    private String attributeName;

    public void setItems(LinkedList items) {
        this.items = items;
    }
    
    public void setVar(String attributeName) throws ProductInvalidCategoryException {
        this.attributeName = attributeName;
    }
    
    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException , IOException 
    {
        JspWriter out = getJspContext().getOut();
        
        try {
            size = items.size();

            if (size<5) //an ta services Categories einai ligotera apo 5 ok... print ola
            {           //gt an tou kanw print kateu8eian ta 5 tote tha petaei null sta kena
                for(int i=0; i<size; i++)
                {
                    getJspContext().setAttribute("serviceCat", items.get(i) );
                    getJspBody().invoke(null);
                }
            }
            else    //an ta services einai perissotera... tote print mono 5
            {
                for(int i=0; i<5; i++)
                {
                    getJspContext().setAttribute("serviceCat", items.get(i) );
                    getJspBody().invoke(null);
                }
            }
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
        } catch (java.io.IOException ex) {
            throw new JspException("Error in ServiceCatTagHandler tag", ex);
        }
    }
}
