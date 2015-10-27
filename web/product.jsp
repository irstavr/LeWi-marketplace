<%--
    Document   : product
    Created on : 2 Μαϊ 2012, 1:35:53 πμ
    Author     : Irini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
        <title>Product Info</title>        
        <link rel="stylesheet" type="text/css" href="mainCss.css" />         
        <script type="text/javascript" src="basket.js"></script> <!-- JS used for the basket -->
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
                
                <!-- the Right Column -->
                <jsp:include page="sideBarRight.jsp" flush="true"/>
        
                
                <div id="mainColumn">
                    <div id="path">
                        <a class="headerNavigation" href="index.html">Αρχική</a>
                        »
                        <a class="headerNavigation" href="category.jsp/catID">${Proion.category}</a>
                        »
                        <a class="headerNavigation" href="product.jsp">${Proion.name}</a>
                    </div>
                    <br>
                    <div>
                        <form id="cart_quantity" method="post">
                            
                            <table id="productInfo" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td class="productInfoHeader" colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td class="productInfoImage" align="center">
                                            <div id="productInfoImageImage">
                                                <div style="position:relative;left:0px;top:0px">
                                                    <img id="productInfoImage" alt="Product Image" src="images/product_images/info_images/923_0.jpg">
                                                </div>
                                            </div>
                                        </td>
                                        <td class="productInfoBody" valign="top">
                                            <div class="textHeadline">
                                                <h1>${Proion.name} [${Proion.typeProduct}]</h1>                                     
                                            </div>
                                            <div id="stars">
                                                <h3 style="padding-left:8px">${Proion.starsDegree} stars                                           
                                                                            , sold by:  <a href="ProfileServlet?id=1"></a> 
                                                </h3>
                                                <h2 style="padding-left:8px">This advert is for </h2>
                                            </div>
                                            
                                           
                                            <br><br>
                                            <div id="description">
                                                <h2 style="padding-left:8px">Product Description:</h2>                                                
                                                <h3 style="padding-left:8px">State: ${Proion.state}</h3> 
                                                <h3 style="padding-left:8px">Category: ${Proion.category} </h3> 
                                                <h3 style="padding-left:8px">${Proion.description}   </h3> 
                                                                            <!-- AYTO GIA TO STATE MONO GIA PRODUCTS -->
                                            </div>                                            
                                            <br><br>                                      
                                            
                                            <table cellspacing="0" cellpadding="0" border="0">
                                                <tbody>
                                                    <tr>
                                                        <td>
                                                            <h2 style="padding-left:8px">Price: </h2>
                                                        </td>
                                                        <td>
                                                            <h3> ${Proion.price}€</h3>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <h2 style="padding-left:8px">Quantity:</h2>
                                                        </td>
                                                        <td>
                                                            <h3> ${Proion.quantity} items</h3> 
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td style="padding-left:8px"> <!-- AYTO MONO AN EINAI PWLHSHS -->
                                                                <input class="imageBtn" type="image" alt="BuyNow" src="BuyNow.png" href="buyNow.jsp">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td style="padding-left:8px"> <!-- AYTO MONO AN EINAI PWLHSHS -->
                                                            <input class="imageBtn" type="image" alt="Add to Basket" src="addtobasket.PNG" onclick="addRow('orderDetails');">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td style="padding-left:8px">
                                                                <input class="imageBtn" type="image" alt="Offer" src="offer.png" href="offer.jsp">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td style="padding-left:8px"> 
                                                                <input class="imageBtn" type="image" alt="Exchange" src="exchange.png" href="exchange.jsp">
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                                        <br><br>
                                            
                                            <!-- mini thumbs pics for the product -->
                                            <table cellspacing="0" cellpadding="0" border="1">
                                                <tbody>
                                                    <tr>
                                                        <td class="miniThumbs" width="75" valign="middle" align="center">
                                                            <a onclick="return showImg('productInfoImage', 'images/product_images/info_images/923_0.jpg',false)" href="javascript:;">
                                                                <img width="57" height="82" border="0" alt="2nd Picture" src="images/product_images/info_images/923_0.jpg">
                                                            </a>
                                                        </td>
                                                        <td width="15">
                                                            <img width="15" alt="" src="images/pixel_trans.gif">
                                                        </td>
                                                        <td class="miniThumbs" width="75" align="center">
                                                            <a onclick="return showImg('productInfoImage', 'images/product_images/info_images/923_1.jpg',false)" href="javascript:;">
                                                                <img width="57" height="82" border="0" alt="3rd Picture" src="images/product_images/info_images/923_1.jpg">
                                                            </a>
                                                        </td>
                                                        <td width="15">
                                                            <img width="15" alt="" src="images/pixel_trans.gif">
                                                        </td>
                                                        <td class="miniThumbs" width="75" align="center">
                                                            <a onclick="return showImg('productInfoImage', 'images/product_images/info_images/923_2.jpg',false)" href="javascript:;">
                                                                <img width="57" height="82" border="0" alt="4th Picture" src="images/product_images/info_images/923_2.jpg">
                                                            </a>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="productInfoFooter" colspan="2"></td>
                                    </tr>
                                </tbody>
                            </table>                                                     
                        </form>
                        <!--#include virtual="footer.html" -->
                    </div> <!-- div inside main ends-->
                    
                    <div id="post">
                        <div class="postHeader"></div>
                        <div class="postTitle">
                            <h1>Comment #1</h1>
                        </div>
                        <div class="postBody">
                            <br>
                            <div>User commented:</div>
                            <textarea>What a spectacular extraordinary product! WOW! </textarea>
                            <br>
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


