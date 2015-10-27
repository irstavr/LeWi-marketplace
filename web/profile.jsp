<%-- 
    Document   : profile
    Created on : 30 Απρ 2012, 2:41:12 μμ
    Author     : Irini
--%>
<%@page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% Integer userId = (Integer)session.getAttribute("currentSessionUserId"); %> 
<c:set var="currentUser" value="<%=userId%>"/>  
<c:set var="user" value="${User.id}"/> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta content="text/html; charset=iso-8859-1" http-equiv="Content-Type">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>                
                <c:choose>
                    <c:when test="${  user == currentUser }"> 
                        Your Profile ;)
                    </c:when>
                    <c:otherwise>                                                
                        ${User.firstname}'s Profile ;)                                              
                    </c:otherwise>
                </c:choose>          
        </title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
    </head>

    <body>
        <!-- main part of the page -->
        <div id="wrapper">
            
            <!-- header part -->           
            <jsp:include page="header.jsp" flush="true"/>            
            
            <!-- content: the rest of the page under header -->
            <div id="content">
                
                <!-- the left Column -->
                <jsp:include page="sideBarLeft.jsp" flush="true"/>   
            
                <!-- the right Column -->
                <jsp:include page="sideBarRight.jsp" flush="true"/>   
            
                <div id="mainColumn">
                    <div id="path">
                        <a class="headerNavigation" href="signup.jsp">Αρχική</a>
                        <a class="headerNavigation" href="">>Προφίλ</a>
                    </div>
                    <br>
                    
                    <!-- photo + details div-->
                    <div id="post">  
                        <div class="postHeader"></div>
                        <div class="postTitle">
                            <h1> ${User.firstname} ${User.lastname}       
                            <c:choose>
                                <c:when test="${  user == currentUser }"> 
                                    <a align="centre" href="editProfile.jsp?id=${User.id}">
                                      <img width="90" height="22" border="0" alt="Details" src="edit_profile.gif">
                                    </a>
                                </c:when>
                                <c:otherwise>                                                
                                    <a align="centre" href="subscribe.jsp?id=${User.id}">
                                      <img width="90" height="22" border="0" alt="Details" src="subscribe.gif">
                                    </a>
                                </c:otherwise>
                            </c:choose>
                            <br><br></h1>
                            <img id="img" src="irvine.jpg"/><br><br>
                            <c:choose>
                                <c:when test="${  user == currentUser }"> 
                                    <a align="centre" href="editAdvert?id=${Product1.id}">
                                      <img width="90" height="20" border="0" alt="Details" src="edit_avatar.gif">
                                    </a>
                                </c:when>
                                <c:otherwise>                                                

                                </c:otherwise>
                            </c:choose>
                        </div>
                        
                        <div class="postBody"><br>                                    
                                    <h2>Name:  ${User.firstname} ${User.lastname}</h2>
                                    <h2>Type:</h2>
                                    <h2>Age: ${User.age}</h2>
                                    <h2>Location: ${User.country}</h2>
                                    <h2>E-mail: ${User.email}</h2>
                                    <h2>Member Since: ${User.registrydate}</h2><br> 
                        </div>   <!-- postBody ends-->                     
                        <div class="postFooter"></div>                        
                    </div> <!-- post ends-->   
                                       
                    
                    <!-- user's active adverts div-->
                    <div id="productContainer">
                        
                        <div id="post">
                            <div class="postHeader"></div>
                            <div class="postTitle">
                                <h1>Active Adverts:
                                    <c:choose>
                                        <c:when test="${  user == currentUser }"> 
                                            <a style="position: right" align="right" title="" href="newAdvert.jsp" >
                                                <img width="85" height="20" alt="New Advert" src="new_advert.gif"> 
                                            </a>
                                        </c:when>
                                    </c:choose>                                        
                                </h1>
                            </div>
                            <div class="postFooter"></div>
                        </div>
                        
                        <!-- iterate list with productsOffered from the user -->
                        <c:forEach var="advert" items="${User.productsOffered}">
                            <!-- advert -->        
                            <div id="product1" class="productThumb">
                                <table cellspacing="0" cellpadding="0" border="0">
                                    <tbody>
                                        <tr>
                                            <td class="productThumbHeader"></td>
                                        </tr>
                                        <tr>
                                            <td class="productThumbImage" valign="top">
                                                <div class="thumbImg">
                                                    <div>                                                    
                                                        <a title="" href="ProductServlet?id=${advert.id}">
                                                            <img width="91" height="130" alt="${advert.name}" src="images/product_images/${advert.name}.jpg"> 
                                                        </a>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr> 
                                            <c:choose>                                            
                                                <c:when test="${  user == currentUser }">                                               
                                                    <td class="productName nobreak"> 
                                                        <a href="editAdvert?id=${advert.id}">
                                                            <img width="80" height="18" border="0" alt="Details" src="edit_button.gif">
                                                        </a>
                                                    </td>
                                                </c:when>
                                                <c:otherwise>                                                
                                                    <td class="productName nobreak">
                                                        <a href="ProductServlet?id=${advert.id}">${advert.description}</a>
                                                    </td>                                               
                                                </c:otherwise>
                                            </c:choose>                                                                                
                                        </tr>
                                        <tr>
                                            <td class="lproductPrice7 productPrice">
                                                <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                                    <tbody>
                                                        <tr>
                                                            <c:choose>
                                                                <c:when test="${  user == currentUser }"> 
                                                                    <td align="left"> 
                                                                        <a href="deleteAdvert?id=${advert.id}">
                                                                            <img width="80" height="18" border="0" alt="Details" src="del_button.gif">
                                                                        </a>
                                                                    </td>
                                                                </c:when>
                                                                <c:otherwise>                                                
                                                                    <td align="left"> ${advert.price} </td>                                              
                                                                </c:otherwise>
                                                            </c:choose>                                                        
                                                            <td align="right">
                                                                <a href="ProductServlet?id=${advert.id}">
                                                                    <img width="80" height="18" border="0" alt="Details" src="button_details.gif">
                                                                </a>
                                                            </td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="productThumbFooter"></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div> <!-- 1st product closes -->
                        </c:forEach>
                            
                        <!-- appear only for "my profile" -->
                        <c:choose>
                            <c:when test="${  user == currentUser }"> 
                                <div id="post">
                                    <div class="postHeader"></div>
                                    <div class="postTitle">
                                        <h1>Subscribers List: </h1>
                                    </div>
                                    <div class="postFooter"></div>
                                </div>
                                
                                <!-- iterate list with subscribers from the user -->
                                <c:forEach var="subscriber" items="${User.subscribers}">
                                    <!-- subscriber -->        
                                    <div id="product1" class="productThumb">
                                        <table cellspacing="0" cellpadding="0" border="0">
                                            <tbody>
                                                <tr>
                                                    <td class="productThumbHeader"></td>
                                                </tr>
                                                <tr>
                                                    <td class="productThumbImage" valign="top">
                                                        <div class="thumbImg">
                                                            <div>                                                    
                                                                <a title="" href="ProfileServlet?id=${subscriber.id}">
                                                                    <img width="91" height="130" alt="${subscriber.name}" src="images/avatars/${subscriber.id}.jpg"> 
                                                                </a>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr> 
                                                    <td class="productName nobreak">
                                                        <a href="ProfileServlet?id=${subscriber.id}">${subscriber.firstname} ${subscriber.lastname}</a>
                                                    </td>                                                                               
                                                </tr>
                                                <tr>
                                                    <td class="lproductPrice7 productPrice">
                                                        <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                                            <tbody>
                                                                <tr>                                                                    
                                                                    <td align="left"> 
                                                                        ${subscriber.starsDegree}
                                                                    </td>                                                                                                                               
                                                                    <td align="right">
                                                                        <a href="ProfileServlet?id=${subscriber.id}">
                                                                            <img width="80" height="18" border="0" alt="Details" src="button_details.gif">
                                                                        </a>
                                                                    </td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="productThumbFooter"></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div> <!-- 1st product closes -->
                                </c:forEach>
                                    
                                    
                                
                                
                            </c:when>
                        </c:choose>     
                            
                    </div>    <!-- user's active adverts div ends-->
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