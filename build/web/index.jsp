<%-- 
    Document   : index
    Created on : 24 Απρ 2012, 10:42:54 μμ
    Author     : Irini
--%>

<%@page import="Controller.IndexServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@page import="java.sql.*" %>
<%
  try {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  }
  catch (ClassNotFoundException e) {
     System.out.println(e.toString());
  }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home - LeWii Online Store</title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
    </head>

    <body onload=" checkBeans();">
        <!-- main part of the page -->
        <div id="wrapper">
            
            <!-- header part -->
            <jsp:include page="header.jsp" flush="true" />            
            
           <!-- content: the rest of the page under header -->
           <div id="content">
                                
                <!-- the left Column -->
                <jsp:include page="sideBarLeft.jsp" flush="true" />
                
                <!-- sidebar on the right -->
                <jsp:include page="sideBarRight.jsp" flush="true" />                
                
                <!-- main column of the page -->
                <div id="mainColumn">
                    <!-- on the left top of the page a link to the home page -->
                    <div id="path">
                        <a class="headerNavigation" href="">Αρχική</a>
                    </div>
                    <br>  
                    
                    <!--  products fields -->            
                    <jsp:include page="productsDiv.jsp" flush="true"/>
                    
                    <div>    
                    <div style="clear: both"></div>   
                    </div>
                </div> <!-- main column closes -->               
            </div> <!--div content ends -->
 
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="copyrightDiv.html" flush="true"/>
                     
    </body>
</html>