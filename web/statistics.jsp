<%-- 
    Document   : statistics
    Created on : 24 Απρ 2012, 10:42:54 μμ
    Author     : Irini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LeWii Online Store</title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
        <link rel="stylesheer" type="text/css" href="statistics.css"/>
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
            
                
                <div id="mainColumn">
                    <div id="path">
                        <a class="headerNavigation" href="signup.jsp">Αρχική</a>
                    </div>
                    <br>
                    
                    <!-- dika mou arxi -->
                    <div id="post">
                        
                        <div class="postHeader"></div>
                        <div class="postPostBody">
                            <h1>Statistics</h1><br><br>
                        
                            <strong>The most famous adverts:</strong>                    
                            <!-- 1st product --> 
                            <div id="prs">
                                <img id="pr_img1"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img2"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img3"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img4"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img5"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img6"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img7"  width="50" height="60" alt="Product Title" src="aba.jpg">
                                <img id="pr_img8"  width="50" height="60" alt="Product Title" src="aba.jpg">
                            </div>
                            <br>

                            <h3>The most famous sellers:</h3>                    
                            <div id="prs1">
                                <img id="pr_img1"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img2"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img3"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img4"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img5"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img6"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img7"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img8"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                            </div>
                            <br>

                            <h3>The most famous members:</h3>
                            <div id="prs2">
                                <img id="pr_img1"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img2"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img3"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img4"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img5"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img6"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img7"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                                <img id="pr_img8"  width="50" height="60" alt="Product aegageae Title" src="irvine.jpg">
                            </div>
                        </div>
                        <div class="postFooter"></div>
                    </div><!-- post telos -->
                    
                </div><!-- main telos -->
            </div><!-- content telos -->
                    
            <!--  footer field -->            
            <jsp:include page="footer.html" flush="true"/>                     
            
        </div><!--div wrapper ends -->
        
        <!--  copyright field -->
        <jsp:include page="cipyrightDiv.html" flush="true" />            
            
    </body>
</html>
