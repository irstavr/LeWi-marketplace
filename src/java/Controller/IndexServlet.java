package Controller;

import Model.OnlineStoreDB;
import Model.Product;
import Model.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lefas
 */
@WebServlet(name = "IndexServlet", urlPatterns = {"/IndexServlet"})
public class IndexServlet extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
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
            throws ServletException, IOException 
    {
        LinkedList l;
        Product p = new Product();
        Connection connection;
        String address = "/index.jsp";
        
        //eftiaksa ta 10 beans gia to product kai ta ebala sto request gia na ginei forward sto index.jsp
        try
        {              
              ServletContext context = getServletContext(); //used for application scope
              OnlineStoreDB.loadJDBCDriver();
              connection = OnlineStoreDB.makeConnection();                   
              //ProductDAO.dbDeleteTableData(connection); //Gia na exw kathe fora diaforetika stoixeia.
                
             
             //edo ftiaxno ta beans gia ta products pou emfanizontai sto index page
             l = ProductDAO.dbSelectTable(connection);
             
             //send 12(at max) beans to jsp page
             for (int i = 0; i <12; i++)
             {
                 if(l.isEmpty())    //if list of products is empty
                 {   //Gia na apofygw to exception -- setName == "keno" --> to kanw catch sto jsp
                     Product n = new Product();
                     n.setName("keno");
                     context.setAttribute("Product"+(i+1)+"", n);
                 }
                 else
                 {
                    p = (Product) l.getLast();
                    l.removeLast();
                    context.setAttribute("Product"+ (i+1) +"",p);
                 }
             }      
             
             //send beans to sidebar for the products' categories
             l = ProductDAO.dbSelectTable(connection , "product");
             context.setAttribute("productsCats", l);
             
             //send beans to sidebar for the services' categories
             l = ProductDAO.dbSelectTable(connection , "service");
             context.setAttribute("servicesCats", l);
                          
             OnlineStoreDB.closeConnection(connection);             
             RequestDispatcher dispatcher = request.getRequestDispatcher(address);
             dispatcher.forward(request, response);
        }
        catch(Exception e)
        {            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ERORR </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <b>UNEXPECTED ERROR OCCURED! </b> :<br> " + e.getMessage() + "</h1>");
            out.println("</body>");
            out.println("</html>");            
            out.close();
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
