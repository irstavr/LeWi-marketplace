package Controller;

import Model.Member;
import Model.MemberDAO;
import Model.OnlineStoreDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
public class SignUpServlet extends HttpServlet {

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
        //doGet(request, response);
        doPost(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUpServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String firstname , lastname , password , email , age , type , country , avatar;
        String address = "welcome.jsp";
        Member m ;
        Connection connection;        
        
        try 
        {            
            firstname = request.getParameter("firstname");
            lastname = request.getParameter("lastname");
            password = request.getParameter("password");
            email = request.getParameter("email");
            age = request.getParameter("age");
            type = request.getParameter("type");
            country = request.getParameter("country") + " , " + request.getParameter("town");
            avatar = "not available yet";
            
            try 
            {                
                OnlineStoreDB.loadJDBCDriver();
                connection = OnlineStoreDB.makeConnection();
                //MemberDAO.dbDeleteTableData(connection);
                
                //creation of the new member object:: AUTO HTAN PRIN::
                //m = new Member(0,Integer.parseInt(age),country,type,email,password,firstname,lastname,new Date(), 0);
                //MemberDAO.createMember(connection, m);
                
                int ageInt = Integer.parseInt(age);           
                m = MemberDAO.findMember(connection, email, password); 
                if( m !=null) // uparxei hdh to member auto
                {
                    response.sendRedirect("error-signup.jsp"); //try again
                }
                else //epistrefei null ara den uparxei --> insert it
                {
                    MemberDAO.dbInsertTable(connection,0,ageInt,country,type,email,password,firstname,lastname,new Date(),0,new LinkedList(),new LinkedList(),new LinkedList(),new LinkedList());                     
                    m = MemberDAO.findMember(connection, email,password);                

                    OnlineStoreDB.closeConnection(connection);             

                    HttpSession session = request.getSession(true);
                    session.setAttribute("currentSessionUser",m);                
                    session.setAttribute("currentSessionUserId",m.getId());
                    session.setAttribute("currentSessionUserFirstName",m.getFirstname());
                    session.setAttribute("currentSessionUserLastName",m.getLastname());
                    response.sendRedirect(address);
                }                
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
