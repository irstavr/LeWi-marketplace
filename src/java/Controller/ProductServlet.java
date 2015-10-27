package Controller;

import Model.OnlineStoreDB;
import Model.Product;
import Model.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet for the web store site.
 * @author Irini
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

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
    {
        doGet(request,response);
        doPost(request,response);
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        
        String name = "id";
        String value = request.getParameter(name);
        int intValue = Integer.parseInt(value);
        Product p = new Product();
        Connection connection;
        String address = "/product.jsp";
        
        try
        {
            OnlineStoreDB.loadJDBCDriver();
            connection = OnlineStoreDB.makeConnection();
        
            if(ProductDAO.existsProduct(connection, intValue)  ){
                p = ProductDAO.findProduct(connection, intValue);
                request.setAttribute("Proion", p);
                OnlineStoreDB.closeConnection(connection);             
                RequestDispatcher dispatcher = request.getRequestDispatcher(address);
                dispatcher.forward(request, response);
            }
            else
            {
                throw new Exception("PRODUCT WITH ID = " + value + " NOT FOUND!");    
            }
        }
        catch(Exception e)
        {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            try 
            {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ProductServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>UNEXPECTED ERROR OCCURED (PRODUCT SERVLET) " + e.getMessage() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
            finally 
            {            
                out.close();
            }
        }
        
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        processRequest(request, response);
    }
    
}