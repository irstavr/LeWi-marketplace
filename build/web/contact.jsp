<%-- 
    Document   : signup
    Created on : 30 Απρ 2012, 2:42:26 μμ
    Author     : Irini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta content="text/html; charset=iso-8859-1" http-equiv="Content-Type">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
    </head>

    <body>
        <!-- main part of the page -->
        <div id="wrapper">
            
            <!-- header part -->
            <jsp:include page="header.jsp" flush="true" />  
            
            
            <!-- content: the rest of the page under header -->
            <div id="content">
                
                <!-- the left Column -->
                <jsp:include page="sideBarLeft.jsp" flush="true" />            
            
                <!-- the right Column -->
                <jsp:include page="sideBarRight.jsp" flush="true" />            
            
                
                <div id="mainColumn">
                    <div id="path">
                        <a class="headerNavigation" href="index.html">Αρχική</a>
                        »
                        <a class="headerNavigation" href="category.jsp/catID">Product Category</a>
                        »
                        <a class="headerNavigation" href="product.jsp">Product Name</a>
                    </div>
                    <br>
                        
                    <div id="post">
                        <div class="postHeader"></div>
                        <div class="postBody">
                            <h1>Contact Us</h1>
                            <br>                            
                            LeWii Online Store
                            <br>
                            Creta<br>
                            171414 Heraklio<br>
                            Greece<br>
                            <br>

                            <h5>E-MAIL:  <a href="mailto:irstavr@csd.uoc.gr">Irini </a>
                             | <a href="mailto:benisis@csd.uoc.gr">Leuteris</a> </h5>
                            <h5>WEB:   <a href="www.lewii-onlinestore.gr">www.lewii-onlinestore.gr</a> </h5>  
  
                        </div>
                        <div class="postFooter"></div>
                    </div>
                </div>  <!-- main column ends-->
                        
                </div> <!-- div content ends-->            
                    
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="copyrightDiv.html" flush="true"/>
                     
    </body>
</html>

