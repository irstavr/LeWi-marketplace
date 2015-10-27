

/* function called when user clicks on 
 * the drop-menu with countries and 
 * chooses one of them 
 */
function changeTowns()
{
     document.getElementById('town').disabled = false;
     
     if (document.getElementById('country').value == "Argentina")
     {
            document.getElementById('argentinian-towns').disabled = false ;
            document.getElementById('greek-towns').disabled = true ;
            document.getElementById('spanish-towns').disabled = true;
            document.getElementById('dutch-towns').disabled = true;
     }
     if (document.getElementById('country').value == "Hellas")
     {
            document.getElementById('argentinian-towns').disabled = true ;
            document.getElementById('greek-towns').disabled = false ;
            document.getElementById('spanish-towns').disabled = true;
            document.getElementById('dutch-towns').disabled = true;
     }
     if (document.getElementById('country').value == "Spain")
     {
            document.getElementById('argentinian-towns').disabled = true ;
            document.getElementById('greek-towns').disabled = true ;
            document.getElementById('spanish-towns').disabled = false;
            document.getElementById('dutch-towns').disabled = true;
     }
     if (document.getElementById('country').value == "Holland")
     {
            document.getElementById('argentinian-towns').disabled = true ;
            document.getElementById('greek-towns').disabled = true ;
            document.getElementById('spanish-towns').disabled = true;
            document.getElementById('dutch-towns').disabled = false;
     } 
}

/* function called when user submits the form */
function submitform()
{       
    
        /* check if user entered firstname */
        if ( document.getElementById('firstname').value == "" ) 
        {   
            document.getElementById('error-firstname').innerHTML = "Insert your first name!";
            return false;
        }
        else
        {   /* realname validation... */ 
            var firstname = document.getElementById('firstname').value;
            if (!firstname.match("^[a-zA-Z]{2,20}$") ) 
            {  
                document.getElementById('error-firstname').innerHTML ="Invalid first name. Please try again!\n ";
                return false;
            }        
        }
        
        /* check if user entered realname */
        if ( document.getElementById('lastname').value == "" ) 
        {   
            document.getElementById('error-lastname').innerHTML = "Insert your last name!";
            return false;
        }
        else
        {   /* lastname validation... */ 
            var lastname = document.getElementById('lastname').value;
            if (!lastname.match("^[a-zA-Z]{2,20}$") ) 
            {  
                document.getElementById('error-lastname').innerHTML ="Invalid last name. Please try again!\n ";
                return false;
            }        
        }
        
        /* check if user entered password */
        if ( document.getElementById('password').value == "" ) 
        {   
            document.getElementById('error-pass').innerHTML = "Insert your password!";
            return false;
        }
        else
        {   /* password validation... */ 
            var password = document.getElementById('password').value;
            if (!password.match("^[a-zA-Z0-9]{6,10}$") ) 
            {  
                document.getElementById('error-pass').innerHTML ="Invalid password. Please try again!\n ";
                return false;
            }        
        }      
        
        /* check if user entered e-mail */
        if ( document.getElementById('email').value == "" ) 
        {   
            document.getElementById('error-email').innerHTML = "Insert your e-mail!";
            return false;
        }
        else
        {   /* email validation... */ 
            var email = document.getElementById('email').value;
            if (!email.match("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)") ) 
            {  
                document.getElementById('error-email').innerHTML ="Invalid email. Please try again!\n ";
                return false;
            }        
        }  
        
        /* check if user entered age */
        if ( document.getElementById('age').value == "" ) 
        {   
            document.getElementById('error-age').innerHTML = "Insert your age!";
            return false;
        }
        else
        {   /* age validation... */ 
            var age = document.getElementById('age').value;
            if(isNaN(parseFloat(age)) || parseInt(age)<18)
            {
                document.getElementById('error-age').innerHTML = "Invalid age.Insert must be numeric and over 18.Please try again!/n ";
                return false;
            }
        }
                
        /* check if user entered town */
        if ( document.getElementById('town').disabled == true ) 
        {   
            document.getElementById('error-town').innerHTML = "select country and then town!\n Insert your town!";
            return false;
        }      
        
              
        
        /* photo validation */
        if ( document.getElementById("avatar").value != "" ) 
        {                                   
                    var avatar = document.getElementById("avatar").value;
                    var extension = new Array();
                    extension[0] = "png";
                    extension[1] = "gif";
                    extension[2] = "jpg";
                    extension[3] = "jpeg";
                    extension[4] = "bmp";
                    
                    // No other customization needed.
                    var j = 0;
                    var myextension = avatar.split('.').pop();
                    for(var i = 0; i < extension.length; i++)
                    {
                        if( myextension == extension[i]){ 
                            j++;
                            break; 
                        }
                    }
                   
                    if ( j == 0) /* has not found any valid extension */
                    { 
                        alert("Invalid photo input.\nValid extensions: png, gif, jpg, jpeg, bmp\nPlease try again!");
                        return false;
                    }
        }
       
               
        alert("All infos needed!\nThank you! :))");
        return true;
}
