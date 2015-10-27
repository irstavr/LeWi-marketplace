<%-- 
    Document   : signup
    Created on : 30 Απρ 2012, 2:42:26 μμ
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
        <title>LeWii Online Store</title>
        <meta content="text/css" http-equiv="Content-Style-Type">        
        <link rel="stylesheet" type="text/css" href="mainCss.css" /> 
        
        <!-- lefas css-->
        <link rel="stylesheet" type="text/css" href="signup.css"/>
        
        <!-- javascipt code file-->
        <script type="text/javascript" src="signupJS.js"></script>
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
                                
                                <h1> SIGN UP</h1>                                
                                <!-- my form  -->
                                <form action="SignUpServlet" id="SignUpForm" method="post" onsubmit="javascript: return submitform();" autocomplete="off" name="SignUpForm" enctype="multipart/form-data" >
                                    <div  id ="myform" accept-charset="UTF-8">
                                  
                                        <!-- input for firstname  -->
                                        <label id="name_label" style="padding-left:0px">First Name : </label>
                                        <input type="text" name="firstname" id ="firstname">
                                        
                                        <div id="error-firstname" class="error-firstname"></div>
                                        <p class="hint">2-20 latin characters </p>
                                        <p></p>
                                        
                                        <!-- input for lastname  -->
                                        <label id="name_label" style="padding-left:0px">Last Name : </label>
                                        <input type="text" name="lastname" id ="lastname">
                                        
                                        <div id="error-lastname" class="error-lastname"></div>
                                        <p class="hint">2-20 latin characters </p>
                                        <p></p> 
                                        
                                        <!-- input for password  -->
                                        <label id="password_label" style="padding-left:0px">Password :</label>
                                        <input type="password" name="password" id="password" >
                                                                                
                                        <div id="error-pass" class="error-pass"></div>
                                        <p class="hint">6-10 latin characters and digits</p>
                                        <p></p>                                       
                                                                               
                                        
                                        <!-- Email address  -->
                                        <label id="email_label" style="padding-left:0px">Email : </label>
                                        <input type="text" id="email" name="email">      
                                        
                                        <div id="error-email" class="error-email"></div>
                                        <p class="hint">Your real e-mail address. </p>
                                        <p></p>
                                        
                                        <!-- age   -->
                                        <label id="email_label" style="padding-left:0px">Age : </label>
                                        <input type="text" id="age" name="age">  
                                        
                                        <div id="error-age" class="error-age"></div>
                                        <p class="hint">You should be over 18years old. ;) </p>
                                        <p></p>

                                        <!-- member type radio buttons -->                                        
                                        <table id="table-type"> 
                                                <tr>
                                                    <td>
                                                        <label id="member_label" style="padding-left:0px">Choose your member type:</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                            <label id="private_label">Individual:</label>
                                                            <input type="radio" name="type" id="individual" value="individual" checked> 
                                                    </td>
                                                    <td>                                                        
                                                            <!-- radio button for shop  -->
                                                            <label id="shop_label">Company:</label>
                                                            <input type="radio" name="type" id="company" value="company" >                                                     
                                                    </td>
                                                </tr>
                                        </table>
                                        
                                        <!-- drop down menu for counties  -->
                                        <p></p>
                                        <div id="title-country">
                                            <label id="country_label">Select country :</label>  
                                            <select id="country" name="country" onmouseup="javascript: changeTowns();">
                                                <option id="Argentina" value="Argentina">Argentina</option>
                                                <option id="Hellas" value="Hellas">Hellas</option>
                                                <option id="Holland" value="Holland">Holland</option>
                                                <option id="Spain" value="Spain">Spain</option>
                                            </select>
                                            <div id="error-country" class="error-country"></div>
                                        </div>

                                        <!-- drop down menu for city  -->
                                         <div id="title-town">
                                            <label id="city_label">Select your city:</label> 
                                            <select id="town" disabled>
                                                <optgroup label="Argentinian Towns" id="argentinian-towns">
                                                    <option value="buenos-aires">Buenos Aires</option>
                                                    <option value="santa-fe">Santa-Fe</option>
                                                </optgroup>
                                                <optgroup label="Greek Towns" id="greek-towns" disabled>
                                                    <option value="Athens">Athens</option>
                                                    <option value="Heraklio">Heraklio</option>
                                                </optgroup>
                                                <optgroup label="Dutch Towns" id="dutch-towns" disabled>
                                                    <option value="Amsterdam">Amsterdam</option>
                                                    <option value="Rotterdam">Rotterdam</option>
                                                </optgroup>
                                                <optgroup label="Spanish Towns" id="spanish-towns" disabled>
                                                    <option value="Barcelona">Barcelona</option>
                                                    <option value="Valencia">Valencia</option>
                                                </optgroup>
                                            </select>
                                        <div id="error-town" class="error-town"></div>
                                        </div><br>    
                                        
                                        <!-- foto  -->
                                        <label id="foto_label">Upload Photo for Avatar : </label>
                                        <input id="avatar" type="file" accept="image/jpeg">
                                        <div id="error-avatar" class="error-avatar"></div><p></p>

                                        <!-- submit button  -->
                                        <center>
                                            <input type="submit" value="Sign up" id="submit_button">
                                            <div id="success" class="success"></div>
                                        </center>
                                    </div>
                                </form>
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

