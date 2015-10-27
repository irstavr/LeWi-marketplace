<%-- 
    Document   : newAdvert
    Created on : 27 Μαϊ 2012, 12:20:45 μμ
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
        <title>New Advert</title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
        
        <!-- lefas css-->
        <link rel="stylesheet" type="text/css" href="signup.css"/>
        
        <!-- javascipt code file-->
        <script type="text/javascript" src="newAdvertJS.js"></script>
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
                        <a class="headerNavigation" href="">Αρχική</a>
                    </div>
                    <br>
                    
                       <div id="post">
                            <div class="postHeader"></div>
                            <div class="postBody">   
                                
                                <h1> NEW ADVERT</h1>                                
                                <!-- my form  -->
                                <form action="NewAdvertServlet" id="NewAdvertForm" method="post" onsubmit="javascript: return submitform();" autocomplete="off" name="SignUpForm" enctype="multipart/form-data" >
                                    <div  id ="myform" accept-charset="UTF-8">
                                  
                                        <!-- offer/demand   -->                                       
                                        <table id="table-type"> 
                                                <tr>
                                                    <td>
                                                        <label id="member_label" style="padding-left:0px">Choose your advert type:</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                            <label id="private_label">I Offer:</label>
                                                            <input type="radio" name="askOffer" id="offer" value="offer" checked> 
                                                    </td>
                                                    <td>                                                        
                                                            <!-- radio button for shop  -->
                                                            <label id="shop_label">I Demand:</label>
                                                            <input type="radio" name="askOffer" id="demand" value="demand" >                                                     
                                                    </td>
                                                </tr>
                                        </table>
                                        <br>
                                        
                                        <!-- input for name  -->
                                        <label id="name_label" style="padding-left:0px">Name : </label>
                                        <input type="text" name="name" id ="name">                                        
                                        <div id="error-firstname" class="error-firstname"></div>
                                        <p></p>
                                        
                                        <!-- input for description  -->
                                        <label id="name_label" style="padding-left:0px">Description : </label>
                                        <input type="text" name="description" id ="description">                                        
                                        <div id="error-lastname" class="error-lastname"></div>
                                        <p></p> 
                                        
                                        <!-- input for price  -->
                                        <label id="password_label" style="padding-left:0px">Price :</label>
                                        <input type="text" name="price" id="price">                                                                                
                                        <div id="error-pass" class="error-pass"></div>
                                        <p></p>                          
                                                                               
                                        
                                        
                                        <!-- product/service   -->                                       
                                        <table id="table-type">
                                                <tr>
                                                    <td>
                                                        <label id="member_label"  style="padding-left:0px">Choose your advert type:</label>
                                                    </td>
                                                </tr>
                                                <tr>    <form id="myform" name="myform">
                                                    <td>
                                                            <label id="private_label">It's a Product</label>
                                                            <input type="radio" name="type" id="product" value="product" onclick="javascript: changePro();"> 
                                                    </td>
                                                    <td>                                           
                                                            <!-- radio button for shop  -->
                                                            <label id="shop_label">It's a Service</label>
                                                            <input type="radio" name="type" id="service" value="service" onclick="javascript: changePro();">                                                     
                                                    </td>
                                                        </form>                
                                                </tr>
                                        </table>                 
                                        
                                        
                                        <!-- state of product New/Used  -->                                       
                                        <table id="table_type" hidden> 
                                                <tr>
                                                    <td> <label id="member_label" style="padding-left:0px">State of product:</label></td>
                                                </tr>
                                                <tr>
                                                    <td><label id="private_label">It's New</label>
                                                        <input type="radio" name="state" id="new" value="new" checked> 
                                                    </td>
                                                    <td><!-- radio button for shop  -->
                                                        <label id="shop_label">It's already Used</label>
                                                        <input type="radio" name="state" id="used" value="used" >                                                     
                                                    </td>
                                                </tr>
                                                <br>
                                        </table>
                                        
                                        
                                        <!-- quantity  -->
                                        <div id="Quantity" hidden>
                                            <label id="email_label" style="padding-left:0px" >Quantity : </label>
                                            <input type="text" id="quantity" name="quantity"> 
                                            <div id="error-email" class="error-email"></div>
                                        </div><p></p>
                                        
                                        <p></p>

                                        <!-- drop down menu for categories  -->
                                         <div id="title_town" >
                                            <label id="city_label">Select category:</label> 
                                            <select id="category" name="category" >
                                                <optgroup label="productCategories"  id="product_categories" disabled>
                                                    <option value="electronics">Electronics</option>
                                                    <option value="books">Books</option>
                                                    <option value="music">Music, Games, Films</option>
                                                    <option value="computers">Computers</option>
                                                    <option value="home">Home, Garden & Pets</option>
                                                    <option value="clothes">Clothes, Shoes </option>
                                                    <option value="sports">Sports & Outdoors</option>
                                                    <option value="health">Health & Beauty</option>  
                                                    <option value="car">Car & Tools</option>                                                   
                                                    <option value="other">Other</option>
                                                </optgroup>
                                                <optgroup label="serviceCategories" id="service_categories"  disabled>
                                                    <option value="painting">Painting</option>
                                                    <option value="cleaning">Cleaning</option>
                                                    <option value="teaching">Teaching</option>
                                                    <option value="web_Sites">Web Sites </option>
                                                    <option value="baby_Sitting">Baby Sitting</option>
                                                    <option value="maintaining">Maintaining</option>
                                                    <option value="logistics">Logistics</option>
                                                    <option value="other">Other</option>
                                                </optgroup>
                                            </select>
                                        <div id="error-town" class="error-town"></div>
                                        </div><br>    
                                        
                                        <!-- foto  -->
                                        <label id="foto_label">Upload Photo: </label>
                                        <input id="avatar" type="file" accept="image/jpeg">
                                        <div id="error-avatar" class="error-avatar"></div><p></p>

                                        <!-- submit button  -->
                                        <center>
                                            <input type="submit" value="Submit" id="submit_button">
                                            <div id="success" class="success"></div>
                                        </center>                                        
                                    </div>
                                </form>
                                <br>
                            </div>
                            <div class="postFooter"></div>
                       </div>  <!--post ends-->
                                    
                </div>  <!-- main column ends-->                        
            </div> <!-- div content ends-->            
                    
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="copyrightDiv.html" flush="true"/>
                     
    </body>
</html>