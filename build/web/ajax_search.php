<?php
    mysql_connect('localhost','root',''); 
    mysql_select_db('OnlineStoreDB');
    
    if(isset($_POST['SearchInput'])) 
    {
        $SearchInput = strtolower($_POST['SearchInput']);
        $Products = mysql_query('select * from Product where name like "%'.$SearchInput.'%" order by price desc limit 10');        

        while($Product = mysql_fetch_assoc($Products)) 
        {
            $Name = utf8_encode($Product['name']);
            $Name = str_replace($SearchInput, '<span class="highlight">'.$SearchInput.'</span>', $Name);
            $Name = str_replace(ucfirst($SearchInput), '<span class="highlight">'.ucfirst($SearchInput).'</span>', $Name);
            $Name = $Name.','.$Product['price'];
        }   echo '<a href="">'.$Name.'</a>';
    }    
?>