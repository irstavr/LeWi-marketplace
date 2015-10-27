package Controller;

import Model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Irini
 */
@WebServlet(name = "NewAdvertServlet", urlPatterns = {"/NewAdvertServlet"})
public class NewAdvertServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {   //kanw insert thn aggelia sto product
        //prosthetw to sundesmo sto transactionDAO
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name , type, description , price , quantity , state , category  , avatar;
        String address = "product.jsp?id=";
        Product p = null ;
        Connection connection;        
        
        try 
        {            
            name = request.getParameter("name");
            type = request.getParameter("type");
            description = request.getParameter("description");
            price = request.getParameter("price");
            quantity = request.getParameter("quantity");
            state = request.getParameter("state");
            category = request.getParameter("category");
            avatar = "not available yet";
            int quantityInt;
            double priceDouble = Double.parseDouble(price);
            
            if(type.equals("product"))
            {
                quantityInt = Integer.parseInt(quantity);
            }  
            else
            {
                quantityInt = 0;
                state = "none";
            }
            
            try 
            {                
                OnlineStoreDB.loadJDBCDriver();
                connection = OnlineStoreDB.makeConnection();                           
                
                //convert Date to string
                DateFormat formatter ; 
                Date date = new Date();
                formatter = new SimpleDateFormat("dd-MMM-yy");
                String dateString = formatter.format(date);
  
                System.err.println("_____________________DESCRIPTION:"+description);
                System.err.println("_____________________type:"+type);
                System.err.println("_____________________quantityInt:"+quantityInt);
                System.err.println("_____________________price:"+price);
                System.err.println("_____________________state:"+state);
                System.err.println("_____________________category:"+category);
                System.err.println("_____________________name:"+name);
                System.err.println("_____________________date:"+dateString);
                
                ProductDAO.dbInsertTable(connection,type,0,name,description, priceDouble,quantityInt,state,category,0,0,new LinkedList(),dateString, new LinkedList());
                p = ProductDAO.findProduct(connection, name);
                
                //add product to list of productsOffered of the user   
                HttpSession session = request.getSession(true);
                Integer userId = (Integer)session.getAttribute("currentSessionUserId"); //take his id from the session
                Member user = MemberDAO.findMember(connection, userId); //member object
                user.insertProductOffered(p.getId());
                
                OnlineStoreDB.closeConnection(connection);    
                session.setAttribute("Proion",p);
                response.sendRedirect(address);                 
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(SignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet SignUpServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>UNEXPECTED EXCEPTION OCCURED : " + ex.getMessage() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        } 
        finally 
        {            
            out.close();            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
