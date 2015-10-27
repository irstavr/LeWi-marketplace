

/* function called when user clicks on 
 * the Produvt/Service radio.
 * enables other options 
 */
function changePro()
{    
    var radioButtons = document.getElementsByName("type");
    var length = radioButtons.length;    
    var selection;
    
    var j;
    for ( j = 0; j < length; j++) 
    { 
        if (radioButtons[j].checked) 
        {
            selection = radioButtons[j].value;   
            break;
        }
   }
   
   
   if(selection == "product")
   { 
        document.getElementById('table_type').hidden = false ;
        document.getElementById('Quantity').hidden = false ;         
        
        document.getElementById('product_categories').disabled = false ;
        document.getElementById('service_categories').disabled = true ;
   }
   else if(selection == "service")
   { 
        document.getElementById('table_type').hidden = true ;
        document.getElementById('Quantity').hidden = true ;   
        
        document.getElementById('product_categories').disabled = true ;
        document.getElementById('service_categories').disabled = false ;
   }     
}

function checkName()
{
    /* check if user entered name */
        if ( document.getElementById('name').value == "" ) 
        {   
            document.getElementById('error-firstname').innerHTML = "Insert advert name!";
            return false;
        }
        else
        {   /* name validation... */ 
            var name = document.getElementById('name').value;
            if (!name.match("^[a-zA-Z' ']") ) 
            {  
                document.getElementById('error-firstname').innerHTML ="Invalid name. Please try again!\n ";
                return false;
            }        
        }
        return true;
}


function checkDescription()
{
    /* check if user entered description */
        if ( document.getElementById('description').value == "" ) 
        {   
            document.getElementById('error-lastname').innerHTML = "Insert advert description!";
            return false;
        }
        else
        {   /* description validation... */ 
            var description = document.getElementById('description').value;
            if (!description.match("^[a-zA-Z' ']") ) 
            {  
                document.getElementById('error-lastname').innerHTML ="Invalid description. Please try again!\n ";
                return false;
            }        
        }
        return true;
}

function checkPrice()
{   
        /* check if user entered password */
        if ( document.getElementById('price').value == "" ) 
        {   
            document.getElementById('error-pass').innerHTML = "Insert advert price!";
            return false;
        }
        else
        {   /* price validation... */ 
            var price = document.getElementById('price').value;
            if (!price.match("^[0-9]") ) 
            {  
                document.getElementById('error-pass').innerHTML ="Invalid price. Please try again!\n ";
                return false;
            }        
        }  
        return true;
}

function checkType()
{
        /* type validation... */ 
        var radioButtons = document.getElementsByName("type");
        var length = radioButtons.length;    
        var selection="";

        var j;
        for ( j = 0; j < length; j++) 
        {if (radioButtons[j].checked) 
            {
                selection = radioButtons[j].value;   
                break;
            }
        }

        if(selection == "")
        {
            alert("You forgot to insert type. Please try again!\n ");
            return false;
        }
        return true;
}


function checkQuantity()
{
    
        /* type validation... check if user selected product
         * if he did, only then check quantity*/ 
        var radioButtons = document.getElementsByName("type");
        var length = radioButtons.length;    
        var selection="";

        var j;
        for ( j = 0; j < length; j++) 
        {if (radioButtons[j].checked) 
            {
                selection = radioButtons[j].value;   
                break;
            }
        }

        if(selection == "product")
        {
            /* check if user entered quantity */
            if ( document.getElementById('quantity').value == "" ) 
            {   
                document.getElementById('error-email').innerHTML = "Insert advert quantity!";
                return false;
            }
            else
            {   /* quantity validation... */ 
                var quantity = document.getElementById('quantity').value;
                if (!quantity.match("^[0-9]") ) 
                {  
                    document.getElementById('error-email').innerHTML ="Invalid quantity. Please try again!\n ";
                    return false;
                }        
            }  
            return true;
        }
        return true;
    
    
}

function checkCategory()
{
        /* check if user entered town */
        if (  document.getElementById('category').value=="" ) 
        {   
            document.getElementById('error-town').innerHTML = "Insert advert category!";
            return false;
        } 
        return true;
}

function checkAvatar()
{
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
        return true;
}

/* function called when user submits the form */
function submitform()
{       
        if (checkName())
        {
            if (checkDescription())
            {
                if (checkPrice())    
                {
                    if (checkType())      
                    {                        
                        if(checkQuantity())
                        {                        
                            if(checkCategory())
                            {
                                if(checkAvatar())
                                {
                                    alert("All infos needed!\nThank you! :))");
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;        
}