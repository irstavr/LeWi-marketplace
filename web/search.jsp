<%-- 
    Document   : search
    Created on : 30 Απρ 2012, 2:41:45 μμ
    Author     : Irini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
        <title>Searching...</title>        
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
                            <h1>Advanced Search</h1>
                            <br>
                            <form id="advanced_search" class="userForm" onsubmit="return check_form(this);" method="get" action="search_result.jsp">
                                <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                    <tbody>
                                        <tr>
                                            <td class="col1">
                                                <strong>Λέξη κλειδί:</strong>
                                            </td>
                                            <td class="col2">
                                                <input type="text" name="keywords">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td> </td>
                                            <td> </td>
                                        </tr>
                                        <tr>
                                            <td valign="top">
                                                <strong>Κατηγορίες:</strong>
                                            </td>
                                            <td>
                                                <select name="categories_id">
                                                    <option selected="selected" value="">Άλλη Κατηγορία</option>
                                                    <option value="24">Υπολογιστές</option>
                                                    <option value="22">Κάμερες</option>
                                                    <option value="2">Κινητά Τηλέφωνα</option>
                                                    <option value="3">Αθλητικά Είδη</option>
                                                    <option value="1">Οικιακά Είδη</option>
                                                    <option value="12">αμπα</option>
                                                    <option value="4">αμπα</option>
                                                </select>
                                                <br>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>Πωλητής:</strong>
                                            </td>
                                            <td>
                                                <select name="manufacturers_id">
                                                    <option selected="selected" value="">Άλλος πωλητής</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>Τιμή από:</strong>
                                            </td>
                                            <td>
                                                <input type="text" name="pfrom">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>Τιμή μέχρι:</strong>
                                            </td>
                                            <td>
                                                <input type="text" name="pto">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="center" colspan="2">
                                                <h3>Αναζήτηση</h3>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                </form>
                        </div>
                        <div class="postFooter"></div>
                    </div>
                </div>  <!-- main column ends-->
            </div>
                    
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="copyrightDiv.html" flush="true"/>
        
        
    </body>
</html>



