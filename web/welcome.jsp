<%-- 
    Document   : welcome
    Created on : 26 Μαϊ 2012, 2:21:28 πμ
    Author     : Irini
--%>

<%@page session="true" %>
<%Member user =(Member)session.getAttribute("currentSessionUser");%>
<%String currentSessionUserFirstName =(String)session.getAttribute("currentSessionUserFirstName");%>
<%String currentSessionUserLastName =(String)session.getAttribute("currentSessionUserLastName");%>

<%@page import="Model.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome abroad <%= currentSessionUserFirstName %>!</title>
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
                            <h1>Welcome <%= currentSessionUserFirstName %>!</h1>
                        </div>
                        <div class="postBody">
                            <br>
                            <center> 
                                <h1>You are now a member of our company!</h1>
                                <h3>Hello, <%=currentSessionUserFirstName%> <%=  currentSessionUserLastName %>.<br>
                                From now on you are a member of our store! <br>
                                You can edit your profile, upload adverts and make offers <br>
                                as every member of LeWii Online Store!
                                </h3>
                                <h2> Have Fun! See ya!</h2>
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