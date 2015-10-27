<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--products are here: -->
<div id="productContainer">

    <!-- 1st product -->        
    <c:if test="${Product1.name ne 'keno'}"> 
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
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product1.id}">
                                        <img width="91" height="130" alt="${Product1.name}" src="images/product_images/${Product1.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a href="ProductServlet?id=${Product1.id}" style="width:5px;">${Product1.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product1.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product1.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
    </c:if>
    
    
    <!-- 2nd product-->
    <c:if test="${Product2.name ne 'keno'}">  
        <div id="product2" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product2.id}">
                                        <img width="91" height="130" alt="${Product2.name}" src="images/product_images/${Product2.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a href="ProductServlet?id=${Product2.id}">${Product2.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product2.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product2.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 2nd product closes -->
    </c:if>
    
    
    <!--3rd product-->
    <c:if test="${Product3.name ne 'keno'}">  
        <div  id="product3" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product3.id}">
                                        <img width="91" height="130" alt="${Product3.name}" src="images/product_images/${Product3.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a href="ProductServlet?id=${Product3.id}">${Product3.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product3.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product3.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 3rd  product closes -->
    </c:if>
        
        
    <!-- 4th product --> 
    <c:if test="${Product4.name ne 'keno'}"> 
        <div  id="product4" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product4.id}">
                                        <img width="91" height="130" alt="${Product4.name}" src="images/product_images/${Product4.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a href="ProductServlet?id=${Product4.id}">${Product4.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product4.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product4.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 4th product closes -->
    </c:if>      
    
    
    <!-- 5th product --> 
    <c:if test="${Product5.name ne 'keno'}"> 
        <div  id="product5" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product5.id}">
                                        <img width="91" height="130" alt="${Product5.name}" src="images/product_images/${Product5.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a href="ProductServlet?id=${Product5.id}">${Product5.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product5.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product5.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 5th product closes -->
    </c:if>
        
    <!-- 6th product -->
    <c:if test="${Product6.name ne 'keno'}"> 
        <div  id="product6" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product6.id}">
                                        <img width="91" height="130" alt="${Product6.name}" src="images/product_images/${Product6.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a  href="ProductServlet?id=${Product6.id}">${Product6.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product6.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product6.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 6th product closes -->
    </c:if>
    
    <!-- 7th product -->
    <c:if test="${Product7.name ne 'keno'}">  
        <div  id="product7" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product7.id}">
                                        <img width="91" height="130" alt="${Product7.name}" src="images/product_images/${Product7.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a  href="ProductServlet?id=${Product7.id}">${Product7.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product7.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product7.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 7th product closes -->
    </c:if>
    
    <!-- 8th product -->
    <c:if test="${Product8.name ne 'keno'}"> 
        <div  id="product8" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product8.id}">
                                        <img width="91" height="130" alt="${Product8.name}" src="images/product_images/${Product8.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a title="Product name link to info" href="ProductServlet?id=${Product8.id}">${Product8.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product8.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product8.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 8th product closes -->
    </c:if>
    
    <!-- 9th product -->
    <c:if test="${Product9.name ne 'keno'}">
        <div id="product9" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product9.id}">
                                        <img width="91" height="130" alt="${Product9.name}" src="images/product_images/${Product9.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a title="Product name link to info" href="ProductServlet?id=${Product9.id}">${Product9.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product9.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product9.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 9th product closes -->
    </c:if>
    
    <!-- 10th product -->
    <c:if test="${Product10.name ne 'keno'}">
        <div  id="product10" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product10.id}">
                                        <img width="91" height="130" alt="${Product10.name}" src="images/product_images/${Product10.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a title="Product name link to info" href="ProductServlet?id=${Product10.id}">${Product10.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product10.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product10.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 10th product closes -->
    </c:if>
    
    <!-- 11th product -->
    <c:if test="${Product11.name ne 'keno'}">
        <div  id="product11" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product11.id}">
                                        <img width="91" height="130" alt="${Product11.name}" src="images/product_images/${Product11.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a title="Product name link to info" href="ProductServlet?id=${Product11.id}">${Product11.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product11.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product11.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 11th product closes -->
    </c:if>

    
    <!-- 12th product -->
    <c:if test="${Product12.name ne 'keno'}">
        <div  id="product12" class="productThumb">
            <table cellspacing="0" cellpadding="0" border="0">
                <tbody>
                    <tr>
                        <td class="productThumbHeader"></td>
                    </tr>
                    <tr>
                        <td class="productThumbImage" valign="top">
                            <div class="thumbImg">
                                <div>
                                    <input type="hidden"/>  
                                    <a title="" href="ProductServlet?id=${Product12.id}">
                                        <img width="91" height="130" alt="${Product12.name}" src="images/product_images/${Product12.name}.jpg"> 
                                    </a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="productName nobreak">
                            <a title="Product name link to info" href="ProductServlet?id=${Product12.id}">${Product12.description}</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="lproductPrice7 productPrice">
                            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                                <tbody>
                                    <tr>
                                        <td align="left"> ${Product12.price} </td>
                                        <td align="right">
                                            <a href="ProductServlet?id=${Product12.id}">
                                                <img width="90" height="18" border="0" alt="Details" src="button_details.gif">
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
        </div> <!-- 12th product closes -->
    </c:if>
    
</div> <!-- product container closes -->