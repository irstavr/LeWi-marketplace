
<%@page import="java.sql.Connection"%>
<%@page import="Model.OnlineStoreDB"%>
<%@page import="Model.ProductDAO"%>
<%@page import="Model.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Integer currentSessionUserId =(Integer)session.getAttribute("currentSessionUserId");%>
<% System.err.println("KWDIKOS ID TOU CURRENT SESSION USER::"+currentSessionUserId);%>


<%@taglib uri="/WEB-INF/tlds/product-category.tld" prefix="productCategory"%>
<%@taglib uri="/WEB-INF/tlds/service-category.tld" prefix="serviceCategory"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            //focus
            $("#SearchInput").focus(function() 
            {
                if($("#SearchInput").val() == "Product Search")
                {
                    $("#SearchInput").val("");
                }
                $("#SearchInput").css("color", "#000000");
            });
            
            //blur
            $("#SearchInput").blur(function() 
            {
                if($("#SearchInput").val() == "")
                {
                    $("#SearchInput").val("Product Search");
                    $("#SearchInput").css("color", "#999999");
                }
                $("#SearchResults").slideUp();
            });
            
            //key pressin
            $("#SearchInput").keydown(function(e)
            {
                if(e.which == 8) {
                SearchText = $("#SearchInput").val().substring(0, $("#SearchInput").val().length-1);
                }
                else {
                SearchText = $("#SearchInput").val() + String.fromCharCode(e.which);
                }
                $("#SearchResults").load("ajax_search.php", { SearchInput: SearchText });
                $("#SearchResults").slideDown();
            }
            
        </script>
    </head>
    <body>
       <!-- sidebar on the left -->
       <div id="sidebarLeft">
                    <!-- search box-->
                    <div id="search" class="box">
                        
                        <form method="post" action="" >
                            <h3 class="boxHeadline">Αναζητηση</h3>                            
                            <div class="boxContent">
                                <table cellspacing="2" cellpadding="0" border="0">
                                    <tbody>
                                        <tr>
                                            <td>                                             
                                               <input id ="SearchInput" name="SearchInput" value="Product Search" type="text" maxlength="30" size="20">
                                                
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <table cellspacing="2" cellpadding="0" border="0">
                                                    <tbody>
                                                    <tr>
                                                        <td>
                                                            <input class="w90" type="image" alt="Ψάξε" src="button_find.gif">
                                                            
                                                        </td>
                                                        <td>
                                                            <img width="40" height="40" alt="" src="suche_klein.gif">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td></td>
                                                        <td>
                                                            <div style="position: relative; left: 20px; top: -48px;">
                                                            <div id="SearchResults"></div>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    </tbody>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="search.jsp">»Σύνθετη Αναζήτηση</a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>                                
                            </div> 
                        </form>                            
                    </div>
                    
                    <!-- login box-->
                    <!-- Emfanish toy efoson den uparxei session me userid -->
                    <c:if test="${empty currentSessionUser}">
                    <div id="login" class="box">
                                <form id="loginbox" action="LoginServlet" method="post">
                                    <h3 class="boxHeadline">LOGIN</h3>
                                    <div class="boxContent">
                                        <table cellspacing="2" cellpadding="0" border="0">
                                        <tbody>
                                            <tr><td>E-mail Address:</td></tr>
                                            <tr>
                                                <td>
                                                <input type="text" maxlength="50" size="25" name="mail">
                                                </td>
                                            </tr>
                                            <tr><td>Password:</td></tr>
                                            <tr>
                                                <td>
                                                <input type="password" maxlength="30" size="10" name="password">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>                                                
                                                    <input class="w130" type="image" src="login.gif">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <a href="signup.jsp">≫Εγγραφή</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                        </table>
                                    </div>
                            </form>
                        </div> <!-- login box ends-->
                    </c:if>
                        
                    <!-- profile/logout box --Emfanish toy efoson uparxei session me userid h' exei kanei signup-->
                    <c:if test="${not empty currentSessionUser}">
                        <div id="logout" class="box" >
                                <form id="logoutbox" action="logout.jsp" method="post">
                                    <h3 class="boxHeadline">Έχετε συνδεθεί</h3>
                                    <div class="boxContent">
                                        <table cellspacing="2" cellpadding="0" border="0">
                                        <tbody>
                                            <tr>
                                                <td>
                                                <a href="ProfileServlet?id=<%=currentSessionUserId%>">»Το προφίλ σου</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <input class="w130" type="image" src="logout.gif">
                                                </td>
                                            </tr>
                                        </tbody>
                                        </table>
                                    </div>
                            </form>
                        </div> <!-- logout box ends-->
                    </c:if>
                        
                        
                    <div class="box">
                        <h3 class="boxHeadline">Κατηγορίες Προιόντων</h3>
                        <div class="boxContent">
                            
                            <productCategory:catName items="${productsCats}" var="productCat">
                                   <a href="category.html">${productCat.category}</a>
                                   <br>
                            </productCategory:catName>
                        </div>
                    </div>
                    
                    <div class="box">
                        <h3 class="boxHeadline">Κατηγορίες Υπηρεσιών</h3>
                        <div class="boxContent">
                                    
                            <serviceCategory:servName items="${servicesCats}" var="serviceCat">
                                   <a href="category.html">${serviceCat.category}</a>
                                   <br>
                            </serviceCategory:servName>
                                
                        </div>
                    </div>
       </div><!--sidebarleft closes-->
    </body>
</html>
