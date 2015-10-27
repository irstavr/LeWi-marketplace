<%-- 
    Document   : index
    Created on : 24 Απρ 2012, 10:42:54 μμ
    Author     : Irini
--%>

<%@page import="Model.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Login!</title>
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
                
                <!-- sidebar on the right -->
                <jsp:include page="sideBarRight.jsp" flush="true" />                
                
                <!-- main column of the page -->
                <div id="mainColumn">
                    <!-- on the left top of the page a link to the home page -->
                    <div id="path">
                        <a class="headerNavigation" href="">Αρχική</a>
                    </div>
                    <br>                   
                        <div id="post">
                        <div class="postHeader"></div>
                        <div class="postTitle">
                            <h1>WRONG LOGIN</h1>
                        </div>
                        <div class="postBody">
                            <br>
                            <center> 
                                <center>
                                    <h3>Sorry, there is no such an entry on our DB, <br>
                                        you are either not a registered user or inserted wrong datas!<br>
                                        <br>
                                        If you forgot to <a href="signup.jsp">sign up</a>, please do it now!
                                    </h3> 
                                </center>
                            </center>
                            <br>
                        </div>
                        <div class="postFooter"></div>
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