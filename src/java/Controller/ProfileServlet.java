package Controller;

import Model.*;
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
 *
 * @author Irini
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

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
            throws ServletException, IOException 
    {   
        //pairnw apo parameter to id tou user
        String name = "id";
        String value = request.getParameter(name);
        int id = Integer.parseInt(value);
        
        Member user = new Member();
        Connection connection;
        String address = "profile.jsp";
        
        try
        {
            OnlineStoreDB.loadJDBCDriver();
            connection = OnlineStoreDB.makeConnection();
            user = MemberDAO.findMember(connection, id);
        
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PROFILE SERVLET USER : " + user);
            if(user!=null )
            {
                request.setAttribute("User", user);
                OnlineStoreDB.closeConnection(connection);             
                RequestDispatcher dispatcher = request.getRequestDispatcher(address);
                dispatcher.forward(request, response);
            }
            else
            {
                throw new Exception("USER WITH ID = " + id + " NOT FOUND!");    
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
