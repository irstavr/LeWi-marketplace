<%-- 
    Document   : mybasket
    Created on : 30 Απρ 2012, 2:40:46 μμ
    Author     : Irini
--%>

<script type="text/javascript" src="basket.js"></script>
<SCRIPT language="javascript">
        var gpa = 0.23;
        var sum = 0;        //telikh timh
        var sum_total_items = 0;    //telikh timh xwris gpa
        
        function updatePrices()
        {
            
            
            
            
            
            
        }     
                
        
        
 
        function deleteRow(tableID) 
        {
            try {
                var table = document.getElementById(tableID);
                var rowCount = table.rows.length;
                
                for(var i=0; i<rowCount; i++) 
                {
                    var row = table.rows[i];
                    var chkbox = row.cells[5].childNodes[1];
                    
                    if(null != chkbox && true == chkbox.checked) 
                    {
                        table.deleteRow(i);
                        rowCount--;
                        i--;
                    }
                }
            }catch(e) 
            {
                alert(e);
            }
        }
 
    </SCRIPT>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
        <title>Basket Info</title>        
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
                
                <!-- the Right Column -->
                <jsp:include page="sideBarRight.jsp" flush="true"/> 
                
                
                <div id="mainColumn">
                    <div id="path">
                        <a class="headerNavigation" href="index.html">Αρχική</a>
                    </div>
                    <br>
                    <div id="sectionImage"><img alt="Basket" src="basket.gif"> </div>
                    
                                           
                    <div id="post">
                        <div class="postHeader"></div>
                        <div class="postBody">
                            <h1>Your Shopping Cart</h1>                            
                            <br>
                            
                            <form id="cart_quantity" method="post" action="mybasket.jsp/action/update_product/info/productId_productName.html">
                                
                                <table id="columns-names-tab"  align="top-right" width="60%" cellspacing="1" cellpadding="0" border="0">
                                    <tbody>
                                        <tr id="columns-names">
                                            <th><strong>Ποσότητα    </strong></th>
                                            <th><strong>Περιγραφή   </strong></th>
                                            <th><strong>Τιμή (€)    </strong></th> 
                                            <th><strong>Συν.Τιμή (€)</strong></th>                                           
                                            <th><strong>Διαγραφή    </strong></th>
                                        </tr>
                                        <tr><td class="borderBottom" colspan="5"></td></tr>
                                    </tbody>
                               </table> 
                                
                               <table id="orderDetails" width="100%" cellspacing="0" cellpadding="0" border="1"> 
                                   <tbody>      
                                       <tr id="product#Num">
                                            <td id="product-photo">
                                                <img height="80" alt="Product image thumb" src="images/product_images/thumbnail_images/923_0.jpg">
                                            </td>
                                            <td id="product-quantity">
                                                <input type="text" size="3" value="1" name="cart_quantity[]">
                                            </td>
                                            <td id="product-name">
                                                <a href="product.jsp/${Product.id}">ProductName</a>                                            
                                            </td>
                                            <td id="orderPrice">21,99 </td>
                                            <td id="orderPriceSum">21,99 </td>
                                            <td align="right">
                                                <input id="del_checkbox" type="checkbox" onclick="deleteRow('orderDetails');" />
                                            </td>
                                        </tr>  
                                   </tbody>
                                </table>   
                                            
                                <table id="basket-sum-price" width="100%" cellspacing="5" cellpadding="0" border="0">
                                    <tbody>
                                        <tr><td class="borderBottom" colspan="6"></td></tr>
                                        <tr id="basket-sum">
                                            <td align="right" colspan="6">
                                                <div> 
                                                    <b><label>ΦΠΑ 23%:          </label></b>
                                                    <label id="gpa-price">3,50  </label>€
                                                </div>                                                
                                                <div>
                                                    <b><label>(Μερικό) Σύνολο:          </label></b>
                                                    <label id="products-price">21,50    </label>€
                                                </div>                                                
                                                <i>χωρίς τα <a href="shop_content.php"> Έξοδα Αποστολής</a></i>
                                            </td>
                                        </tr>
                                        
                                        <tr><td class="borderBottom" colspan="6"></td></tr>                                        
                                    </tbody>
                                </table>
                                                                
                                <div id="basket-buttons" style="margin-top:8px">
                                    <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                        <tbody><tr>
                                                <td align="right">
                                                    <a href="mybasket.jsp">
                                                        <img title="Ενημέρωση" alt="Ενημέρωση" src="button_update.gif">
                                                    </a>
                                                    <a href="checkout_shipping.jsp">
                                                        <img title="Αγορά" alt="Αγορά" src="button_buy.gif">
                                                    </a>
                                                </td>
                                        </tr></tbody>
                                    </table>
                                </div>
                                
                            </form>
                            
                        </div> <!-- postBody ends-->
                        <div class="postFooter"></div>
                    </div> <!-- div post ends-->
                </div>  <!-- main column ends-->
            </div>
                    
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="copyrightDiv.html" flush="true"/>        
        
    </body>
</html>